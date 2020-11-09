package com.telran.files2solution;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class ReadText {

        public static void main(String... args) throws IOException{
            ReadText text = new ReadText();

            text.readTextFile("Text.txt");
        }

        public static Charset ENCODING = StandardCharsets.UTF_8;

        void readTextFile(String fileName) throws IOException {
            Path path = Paths.get(fileName);
            try (BufferedReader reader = Files.newBufferedReader(path, ENCODING)){
                String line = null;
                while ((line = reader.readLine()) != null) {
                    log(line);
                }
            }
        }


        private static void log(Object msg){
            System.out.println(String.valueOf(msg));
        }
}
