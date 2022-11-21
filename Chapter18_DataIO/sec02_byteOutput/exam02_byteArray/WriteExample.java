package sec02_byteOutput.exam02_byteArray;

import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;


public class WriteExample {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("/Users/hs_/Downloads/test3.db");

            byte[] arr = { 10, 20, 30 };

            os.write(arr, 1, 2);

            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
