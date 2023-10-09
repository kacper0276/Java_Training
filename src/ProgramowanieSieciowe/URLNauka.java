package ProgramowanieSieciowe;

import java.net.MalformedURLException;
import java.net.URL;

public class URLNauka {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://ckziubrodnica.pl/aaa/");

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Path: " + url.getPath());
            System.out.println("File: " + url.getFile());

            URL url2 = new URL("https://google.com:8080");
            System.out.println("Port: " + url2.getPort());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
