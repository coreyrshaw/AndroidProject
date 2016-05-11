package mobile.tiy.todoclientchatandroidapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Corey Shaw on 5/11/2016.
 */
public class ChatClient {

    public String sendMessage(String serverMessage) {
        try {


            Socket clientSocket = new Socket("172.168.4.10", 8005);
            PrintWriter outPut = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader inPut = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
         //   BufferedReader inPut = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            outPut.println(serverMessage);
            String serverResponse = inPut.readLine();
            return serverResponse;
        } catch (IOException ioexception) {
        } return null;
    }

}
