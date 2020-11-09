package de.telran.textfiles;
import java.io.IOException;

public class FileData {
    public static void main(String[] args) throws Exception {
        String file_name = "Text.txt";

        try {
            ReadFile file = new ReadFile(file_name);
            String[] aryLines = file.OpenFile();
            for (int i = 0; i < aryLines.length; i++) {
                System.out.println(aryLines[i]);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
}