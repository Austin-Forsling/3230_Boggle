/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bogglegame;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author austi
 */
public class OutputHandler {

    private PrintWriter outPrint;
    private final String groupName = "Boggle_Of_Epicness";

    OutputHandler(Socket inSocket) {
        Socket socket = inSocket;
        try {
            outPrint = new PrintWriter(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
            //This would only happen if the server is never connected or loses connection.
        }
    }
    
    //actually sends the object to the server. Complete with a message for debuggin purposes.
    void send(JSONObject message){
        System.out.println("Sending:");
        System.out.println(message.toString());
        outPrint.println(message.toString());
        outPrint.flush();
    }

    //builds a chat message.
    void sendChat(String inputString) {
        JSONObject chat = new JSONObject();
        JSONObject innerChat = new JSONObject();
        try {
            chat.put("type", "application");
            innerChat.put("module", groupName);
            innerChat.put("action", "CHAT");
            innerChat.put("chatMessage", inputString);
            chat.put("message", innerChat);
            send(chat);
        } catch (JSONException e) {
            //shouldn't get here, JSON shouldn't break.
        }

    }

    //builds a chat message with a target username, for whispering.
    void sendChat(String inputString, String username) {
        JSONObject chat = new JSONObject();
        JSONObject innerChat = new JSONObject();
        try {
            chat.put("type", "application");
            innerChat.put("module", groupName);
            innerChat.put("action", "CHAT");
            innerChat.put("chatMessage", inputString);
            innerChat.put("username", username);
            chat.put("message", innerChat);
            send(chat);
        } catch (JSONException e) {
            //shouldn't get here, JSON shouldn't break.
        }
    }

    //builds a login message.
    void sendLogin(String user) {
        JSONObject login = new JSONObject();
        JSONObject message = new JSONObject();
        try {
            message.put("password", " ");
            message.put("username", user);
            login.put("type", "login");
            login.put("message", message);
            send(login);
        } catch (JSONException e) {
            e.printStackTrace();
            //Since the JSON object is being built here, there shouldn't be any issues with it
        }
    }

    //builds a play message to start a game.
    void sendPlay() {
        JSONObject play = new JSONObject();
        JSONObject innerPlay = new JSONObject();
        try {
            play.put("type", "application");
            innerPlay.put("module", groupName);
            innerPlay.put("action", "PLAY");
            play.put("message", innerPlay);
            send(play);
        } catch (JSONException e) {
            e.printStackTrace();
            //There shouldn't be an issue with the JSON
        }
    }

    void sendGuess(int[] currentGuess) {
        JSONObject guess = new JSONObject();
        JSONObject innerGuess = new JSONObject();
        try{
            JSONArray guessArray = new JSONArray(currentGuess);
            guess.put("type","application");
            innerGuess.put("module", groupName);
            innerGuess.put("action", "GUESS");
            innerGuess.put("positions", guessArray);
            guess.put("message", innerGuess);
            send(guess);
        } catch (JSONException e){
            e.printStackTrace();
            //Shouldn't get here, currentGuess array should be clean to get to this point.
        }
    }

}
