import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Demo {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("text.txt");

            int a = 0;
            byte[] buf = new byte[5];
            while ((a = inputStream.read()) != -1) {
                System.out.println((char) a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
