/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bogglegame;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author austi
 */
public class Client {
    OutputHandler output;
    UIWindow window;
    
    public Client(){
        window = new UIWindow(this);
        try{
        Socket socket = new Socket("ec2-34-224-216-23.compute-1.amazonaws.com",8989);
        output = new OutputHandler(socket);
        InputHandler input = new InputHandler(this,socket);
        }
        catch(IOException e){
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
        UIWindow.updateChat(username, chatMessage);
    }

    private void sendLogin() {
        String login = window.getLogin();
        output.sendLogin(login);
    }
    
}
