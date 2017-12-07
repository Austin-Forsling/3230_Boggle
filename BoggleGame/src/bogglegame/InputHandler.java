/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bogglegame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import org.json.JSONArray;
import org.json.JSONException;

import org.json.JSONObject;

/**
 *
 * @author austi
 */
class InputHandler implements Runnable {

    //Socket to connect to server
    private Socket socket;

    //Parent client, which will handle the translated JSON
    private Client parent;

    public InputHandler(Client inClient, Socket inSocket) {
        parent = inClient;
        socket = inSocket;
        runThread();
    }

    //runs a thread of this to prevent blocking the rest of the program.
    private void runThread() {
        new Thread(this).start();
    }

    //uses switches on a received JSON to figure out what it's trying to do.
    private void translateJSON(JSONObject message) {
        System.out.println(message.toString());
        switch (message.optString("type")) {
            case ("acknowledge"):
                parent.receivedChat(message.optString("message"));
                break;
            case ("DENY"):
                parent.denyLogin();
                break;
            case ("application"):
                try {
                    JSONObject innerMessage = message.getJSONObject("message");
                    switch (innerMessage.optString("action")) {
                        case ("CHAT"):
                            if (innerMessage.optString("username").equals("")) {
                                parent.receivedChat(innerMessage.optString("chatMessage"));
                            } else {
                                parent.receivedChat(innerMessage.optString("username"), innerMessage.optString("chatMessage"));
                            }
                            break;
                        case ("STARTGAME"):
                            JSONArray gameBoard = innerMessage.getJSONArray("board");
                            parent.receivedStartGame(gameBoard);
                            break;
                        case ("WORD"):
                            parent.receivedWord(innerMessage.optString("word"));
                            break;
                        case ("POINTS"):
                            parent.receivedPoints(innerMessage.optInt("points"));
                            break;
                        case ("GAMEEND"):
                            parent.receivedEndGame();
                            break;
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    //Shouldn't get here, but there isn't anything I can do if we do get here.
                }
                break;
        }
    }

    @Override
    public void run() {
        try {
            BufferedReader inRead = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                try {
                    //blocks until input is received.
                    JSONObject fromServer = new JSONObject(inRead.readLine());
                    System.out.println("Read:");
                    translateJSON(fromServer);
                } catch (IOException | JSONException e) {
                    e.printStackTrace();
                    //not much that can be done here, if it breaks the connection has been lost.
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
            //There isn't much that can be done here.
        }

    }

}
