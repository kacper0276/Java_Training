package OperacjeNaPlikach;

import java.io.*;

// Aby odczytać dane inne niż tekstowe czy pojedyncze bajty powinno się używać wyspecjalizowanych klas z metodami do odczytu i zapisu innych typów prostych
// Klasa DataOutputStream daje do dyspozycji konkretne metody do zapisu typów prostych np. writeInt(0), writeDouble() itd
public class DataInputOutputStreamNauka {
    public static void main(String[] args) throws IOException {
        // Zapis do pliku test.dat
        DataOutputStream data = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("files\\test.dat")));

        data.writeBoolean(true);
        data.writeByte(8);
        data.writeChar('T');
        data.writeDouble(250.56d);
        data.writeFloat(32.9f);
        data.writeInt(24);
        data.writeLong(123456789101112L);
        data.writeShort(12000);
        data.writeUTF("String in UTF-8 ąęłó tekst");
        data.flush(); // wymuszenie zapisu z bufora
        data.close();
        System.out.println("Data saved");

        // Odczyt danych
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("files\\test.dat")));

        // W takiej kolejności w jakiej zapisujemy w takiej musimy odczytać
        boolean b = dataInputStream.readBoolean();
        System.out.println(b);
        byte _byte = dataInputStream.readByte();
        System.out.println(_byte);
//        dataInputStream.skipBytes(8); <- pomijanie 8 bajtów
        char c = dataInputStream.readChar();
        System.out.println(c);
        double d = dataInputStream.readDouble();
        System.out.println(d);
        float f = dataInputStream.readFloat();
        System.out.println(f);
        int i = dataInputStream.readInt();
        System.out.println(i);
        long l = dataInputStream.readLong();
        System.out.println(l);
        short s = dataInputStream.readShort();
        System.out.println(s);
        String str = dataInputStream.readUTF();
        System.out.println(str);
        dataInputStream.close();
        System.out.println("Data read");
    }
}
