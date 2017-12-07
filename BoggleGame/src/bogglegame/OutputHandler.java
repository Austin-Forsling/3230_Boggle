/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bogglegame;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author austi
 */
public class OutputHandler {

    PrintWriter outPrint;
    
    OutputHandler(Socket inSocket) {
        Socket socket = inSocket;
        try{
            outPrint = new PrintWriter(socket.getOutputStream());
        } catch (IOException e){
            e.printStackTrace();
            //This would only happen if the server is never connected or loses connection.
        }
    }

    void sendChat(String inputString) {
        JSONObject chat = new JSONObject();
        try{
        chat.put("type","chat");
        chat.put("message",inputString);
        }
        catch (JSONException e){
            //shouldn't get here
        }
        
    }

    void sendLogin(String user) {
        JSONObject login = new JSONObject();
        JSONObject message = new JSONObject();
        try{
            message.put("password"," ");
            message.put("username",user);
            login.put("type","login");
            login.put("message",message);
            System.out.println(login.toString());
            outPrint.println(login.toString());
            outPrint.flush();
        }
        catch(JSONException e){
            e.printStackTrace();
            //Since the JSON object is being built here, there shouldn't be any issues with it
        }
    }
    
}
