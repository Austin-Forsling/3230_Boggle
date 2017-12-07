/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bogglegame;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import org.json.JSONArray;
import org.json.JSONException;

/**
 *
 * @author austi
 */
public class Client {

    private OutputHandler output;
    private UIWindow window;

    public Client() {
        window = new UIWindow(this);
        try {
            Socket socket = new Socket("ec2-34-224-216-23.compute-1.amazonaws.com", 8989);
            output = new OutputHandler(socket);
            InputHandler input = new InputHandler(this, socket);
        } catch (IOException e) {
            window.couldNotConnect();
        }
        sendLogin();
        window.setVisible(true);
    }

    public static void main(String[] args) {
        new Client();
    }

    void sendChat(String inputString) {
        output.sendChat(inputString);
    }

    void denyLogin() {
        String login = window.retryLogin();
        output.sendLogin(login);
    }

    void receivedChat(String username, String chatMessage) {
        window.updateChat(username, chatMessage);
    }

    private void sendLogin() {
        String login = window.getLogin();
        output.sendLogin(login);
    }

    void loginMessage(String loginMessage) {
        receivedChat("", loginMessage);
    }

    void sendPlay() {
        output.sendPlay();
    }

    void receivedStartGame(JSONArray gameBoard) {
        char[] gameBoardArray = new char[gameBoard.length()];
        for(int i = 0; i < gameBoardArray.length; i++){
            try{
            String boardString = gameBoard.getString(i);
            char boardChar = boardString.charAt(0);
            gameBoardArray[i] = boardChar;
            } catch (JSONException e){
                //If the JSON received from the server is broken, there isn't much to be done.
            }
        }
        window.writeBoard(gameBoardArray);
    }
}
