package sec04_charStream.exam01_writeChar;
import java.io.Writer;
import java.io.FileWriter;
import java.io.IOException;

public class WriteExample {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("/Users/hs_/Downloads/test.txt");

            char a = 'A';
            char b = 'B';
            writer.write(a);
            writer.write(b);

            char[] arr = { 'C', 'D', 'E' };
            writer.write(arr);

            writer.write("FHG");

            writer.flush();

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
