package OperacjeNaPlikach;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderFileWriterNauka {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("files\\inny.txt");
            out = new FileWriter("files\\copy2.txt");
            int v;
            while ((v = in.read()) != -1) {
                System.out.print((char) v);
                out.write(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(in != null) in.close();
            if(out != null) out.close();
        }
    }
}
