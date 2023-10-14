package org.example;

import java.util.Calendar;

import org.apache.commons.text.WordUtils;
import  org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

public class PdfBoxNauka {
    public static void writeLineOfText(PDPageContentStream content, int tx, int ty, PDFont font, String text) {
        if(font == null) font = PDType1Font.HELVETICA;

        try {
            content.beginText();
            content.setFont(font, 10);
            content.newLineAtOffset(tx, ty);
            content.showText(text);
            content.endText();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeTextColumn(PDPageContentStream content, int tx, int ty, PDFont font, String text, int wrapLength) {
        String lines[] = WordUtils.wrap(text, wrapLength).split("\\r?\\n");

        int posY = 0;
        for(int i = 0; i < lines.length; i++) {
            String l = lines[i];
            System.out.println(l);
            posY = ty - i * 15;
            writeLineOfText(content, tx, posY, font, l);
        }
    }

    public static void drawImage(PDDocument document,  PDPageContentStream content, int tx, int ty, float scaleX, float scaleY, String filename) {
        try {
            PDImageXObject image = PDImageXObject.createFromFile(filename, document);
            int iw = (int)(image.getWidth() * scaleX);
            int ih = (int)(image.getHeight() * scaleY);
            content.drawImage(image, tx, ty, iw, ih);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        Calendar calendar = Calendar.getInstance();
        String filename = "files/file_"+calendar.get(Calendar.HOUR_OF_DAY) + "_" + calendar.get(Calendar.MINUTE) + ".pdf";

        PDDocument document = new PDDocument();
        PDPage page1 = new PDPage();
        document.addPage(page1);

        PDPageContentStream contentStream = new PDPageContentStream(document, page1);

        writeLineOfText(contentStream, 40, 100, null, "Hello World!");

        drawImage(document, contentStream, 0, 300, 0.2f, 0.2f, "files/img1.PNG");

        contentStream.close();

        // Nowa strona
        PDPage page2 = new PDPage();
        PDPageContentStream content2 = new PDPageContentStream(document, page2);
        document.addPage(page2);
        writeLineOfText(content2, 40, 700, PDType1Font.COURIER_BOLD, "Hello World! Page 2"); // Liczone od dolnego lewego roku x i y

        writeTextColumn(content2, 40, 300, PDType1Font.COURIER_BOLD, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.", 50);

        content2.close();

        document.save(filename);
        document.close();
    }
}
