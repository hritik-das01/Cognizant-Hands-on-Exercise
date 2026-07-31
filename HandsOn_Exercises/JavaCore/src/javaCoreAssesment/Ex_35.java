package javaCoreAssesment;

import java.io.*;
import java.net.*;

public class Ex_35 {
	public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server started. Waiting for client...");

        Socket socket = serverSocket.accept();
        System.out.println("Client connected.");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        out.println("Welcome to TCP Server Chat!");
        System.out.println("Client says: " + in.readLine());

        socket.close();
        serverSocket.close();
    }
}
