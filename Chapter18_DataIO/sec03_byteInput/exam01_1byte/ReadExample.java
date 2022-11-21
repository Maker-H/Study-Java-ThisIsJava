package sec03_byteInput.exam01_1byte;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try{
            InputStream is = new FileInputStream("/Users/hs_/Downloads/test1.db");

            while(true) {
                int data = is.read();
                if(data == -1) break;
                System.out.println(data);
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
