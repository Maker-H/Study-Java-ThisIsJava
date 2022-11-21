package sec03_byteInput.exam03_copy;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
    public static void main(String[] args) throws Exception{
        String originalFileName = "/Users/hs_/Downloads/test.png";
        String targetFieldName = "/Users/hs_/Downloads/test2.png";

        InputStream is = new FileInputStream(originalFileName);
        OutputStream os = new FileOutputStream(targetFieldName);

        byte[] data = new byte[1024];
        while(true) {
            int num = is.read(data);
            if(num == -1) break;
            os.write(data, 0, num);
        }
        //is.transferTo
        os.flush();
        os.close();
        is.close();

        System.out.println("Well Copied");
    }
}
