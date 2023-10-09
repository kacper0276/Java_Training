package ProgramowanieSieciowe;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ProstySerwerJava {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(300);
        Socket socket = serverSocket.accept(); // Blokuje program aż pojawi się klient
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true); // dane do klienta
        writer.println("HTTP/1.1 200 OK");
        writer.println("Content-Type: text/html; charset=utf-8");
        writer.println("Connection: Keep-Alive");
        writer.println();

        System.out.println("Write text: ");
        Scanner scanner = new Scanner(System.in);
        String str = null;
        while (!(str = scanner.nextLine()).equals("exit")) {
            writer.println(str);
//            writer.flush(); wymusza wrzucenie zmian do bazy, ale jeszce nie commituje transakcji
        }

        scanner.close();
        socket.close();
    }
}
