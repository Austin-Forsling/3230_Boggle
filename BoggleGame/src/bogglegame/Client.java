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
            //connects to the server, runs a new input handler thread.
            Socket socket = new Socket("ec2-34-224-216-23.compute-1.amazonaws.com", 8989);
            output = new OutputHandler(socket);
            InputHandler input = new InputHandler(this, socket);
        } catch (IOException e) {
            window.couldNotConnect();
        }
        //tells UI window to get a username from the user
        sendLogin();
        window.setVisible(true);
    }

    //starts up everything
    public static void main(String[] args) {
        new Client();
    }

    //passes a chat string from the UI to the output handler.
    void sendChat(String inputString) {
        output.sendChat(inputString);
    }

    //if login was denied, try again
    void denyLogin() {
        String login = window.retryLogin();
        output.sendLogin(login);
    }

    //sends chat string to UI window to be displayed for the user.
    void receivedChat(String username, String chatMessage) {
        window.updateChat(username, chatMessage);
    }

    //sends username to the output handler.
    private void sendLogin() {
        String login = window.getLogin();
        output.sendLogin(login);
    }

    //posts the successful login message.
    //TODO: overload receivedChat to accept single string and remove ':'
    void loginMessage(String loginMessage) {
        receivedChat("", loginMessage);
    }

    //passes play message to output handler to start a new game.
    void sendPlay() {
        output.sendPlay();
    }

    //builds the boggle game board array and passes it along to the UI.
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
        window.startGame();
    }
}
