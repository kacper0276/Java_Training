package ProgramowanieSieciowe;

import java.io.BufferedInputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionNauka {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://google.com");
        URLConnection connection = url.openConnection();
        BufferedInputStream input = new BufferedInputStream(connection.getInputStream());
        int i;
        while ((i = input.read()) != -1) {
            System.out.print((char) i);
        }
    }
}
