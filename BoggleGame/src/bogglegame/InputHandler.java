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
import org.json.JSONException;

import org.json.JSONObject;

/**
 *
 * @author austi
 */
class InputHandler implements Runnable {

    Socket socket;
    Client parent;

    public InputHandler(Client inClient, Socket inSocket) {
        parent = inClient;
        socket = inSocket;
        runThread();
    }

    private void runThread() {
        new Thread(this).start();
    }

    private void translateJSON(JSONObject message) {
        System.out.println(message.toString());
        switch (message.optString("type")) {
            case ("acknowledge"):
                break;
            case ("DENY"):
                parent.denyLogin();
                break;
            case ("CHAT"):
                parent.receivedChat(message.optString("username"), message.optString("message"));
                break;
            case ("WORD"):
                break;
            case ("GAMESTART"):
                break;
            case ("GAMEEND"):
                break;
        }
    }

    @Override
    public void run() {
        try {
            BufferedReader inRead = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                if (inRead.ready()) {
                    try {
                        JSONObject fromServer = new JSONObject(inRead.readLine());
                        System.out.println("Read something");
                        translateJSON(fromServer);
                    } catch (IOException | JSONException e) {
                        e.printStackTrace();
                        //not much that can be done here, if it breaks the connection has been lost.
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            //There isn't much that can be done here.
        }

    }

}
