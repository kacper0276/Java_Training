package OperacjeNaPlikach;

import java.io.*;

// Bufforowane znacząco przyśpieszają odczyt i zapis do pliku
public class BufferedInputOutputStreamNauka {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream("test.txt"));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("buffOut.txt"));
            bufferedReader = new BufferedReader(new FileReader("test.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("files\\textBuffOutReader.txt"));

            String str = null;

            // Czytanie pliku znak po znaku
            int v = 0;
            while ((v = bufferedInputStream.read()) != -1) {
                System.out.print((char) v);
                bufferedOutputStream.write(v);
            }
            System.out.println("\n");
            // Czytanie pliku linia po linii
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
                bufferedWriter.write(str + "\n"); // Bez \n wszystko w jednej linii
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(bufferedInputStream != null)
                bufferedInputStream.close();
            if(bufferedReader != null)
                bufferedReader.close();
            if(bufferedOutputStream != null)
                bufferedOutputStream.close();
            if(bufferedWriter != null)
                bufferedWriter.close();
        }
    }
}
