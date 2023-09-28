package OperacjeNaPlikach;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PlikiWstep {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream out = null;
        int num = 0;
        try {
            fis = new FileInputStream("test.txt");
            out = new FileOutputStream("copy.txt");

            while ((num = fis.read()) != -1) {
                // Odczytany bajt zamieniony na znak
                System.out.println((char) num);
                out.write(num);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Zamknięcie strumienia do pliku
            if(fis != null) fis.close();
            if(out != null) out.close();
        }
    }
}
