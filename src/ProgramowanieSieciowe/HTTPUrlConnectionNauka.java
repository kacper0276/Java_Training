package ProgramowanieSieciowe;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

public class HTTPUrlConnectionNauka {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://google.com");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET"); // Typ zapytań GET, POST, itp.

        long expDate = con.getExpiration(); // data dokumentu
        System.out.println(expDate == 0 ? "Brak info" : new Date(expDate));

        long mod = con.getLastModified(); // Ostatnia modyfikacja
        System.out.println(mod == 0 ? "Brak info" : new Date(mod));

        System.out.println("Content-type: " + con.getContentType());
        System.out.println("Content length: " + con.getContentLength());
        System.out.println("Doc date: " + new Date(con.getDate()));
        System.out.println("Response code: " + con.getResponseCode());
        con.disconnect();
    }
}
