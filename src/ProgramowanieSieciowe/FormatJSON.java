package ProgramowanieSieciowe;

import netscape.javascript.JSObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Objects;

public class FormatJSON {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://api.exchangeratesapi.io/latest?base=USD");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.connect();
        if(con.getResponseCode() != 200) {
            System.out.println("Can't access server");
            return;
        }

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream())
        );
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) content.append(inputLine);

        String jsonStr = content.toString();
        System.out.println(jsonStr);

//        JSONObject jsonObj = new JSONObject(jsonStr); // Dostępne w Maven
//        JSONObject rates = jsonObj.getJSONObject("rates");
//        Map<String, Object> objMap = rates.toMap();

//        objMap.forEach((key, value) -> System.out.println(key + " " + value));

        in.close();
    }
}
