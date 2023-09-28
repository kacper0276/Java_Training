package OperacjeNaPlikach;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class KlasaFileZarzadzanieKatalogamiPlikami {
    public static void main(String[] args) throws IOException {
        File file = new File("files\\javaFile1.txt"); // Klasa File - dane odnośnie plików i katalogów

        if(!file.exists()) {
            if(file.createNewFile()) {
                System.out.println("Plik utworzony!");
            } else {
                System.out.println("Problem z utworzeniem pliku");
            }
        }

        if(file.exists()) {
            boolean canRead = file.canRead();
            System.out.println("canRead: " + canRead);
            boolean canWrite = file.canWrite();
            System.out.println("canWrite: " + canWrite);

            boolean isDirectory = file.isDirectory();
            System.out.println("isDirectory: " + isDirectory);
            boolean isFile = file.isFile();
            System.out.println("isFile: " + isFile);

            String filename = file.getName();
            System.out.println("fileName: " + filename);

            String parent = file.getParent();
            System.out.println("parent: " + parent);

            String filePath = file.getPath();
            System.out.println("path: " + filePath);

            String absolutePath = file.getAbsolutePath();
            System.out.println("absolutePath: " + absolutePath);

            boolean isHidden = file.isHidden();
            System.out.println("isHidden: " + isHidden);

            long lastModified = file.lastModified(); // timestamp
            System.out.println("lastModified: " + lastModified);
            System.out.println(new Date(lastModified));

            long fileLength = file.length();
            System.out.println("fileLength: " + fileLength); // Wielkość pliku
        }

        File files = new File("files");

        if(files.exists() && files.isDirectory()) {
            String filess[];
            filess = files.list();

            for(String fileName: filess) {
                System.out.println(fileName);
            }
        }

        File dir = new File("files\\dirTest");
        if(!dir.exists()) {
            boolean dirCreated = dir.mkdir();
            System.out.println("Directory created: " + dirCreated);
        }

        if(dir.delete()) {
            System.out.println("Dir deleted");
        }
    }
}
