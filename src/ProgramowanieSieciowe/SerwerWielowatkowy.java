package ProgramowanieSieciowe;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SerwerWielowatkowy {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        ExecutorService executorService = Executors.newFixedThreadPool(10); // max 10 klientow
        while (true) {
            final Socket socket = serverSocket.accept();
            Runnable connection = new Runnable() {
                @Override
                public void run() {
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                        bufferedWriter.write("Hello from Server!");
                        bufferedWriter.flush();
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            };
            executorService.submit(connection);
        }
    }
}
