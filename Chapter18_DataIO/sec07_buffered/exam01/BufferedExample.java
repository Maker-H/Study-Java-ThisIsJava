package sec07_buffered.exam01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.print.attribute.standard.Copies;

public class BufferedExample {
    public static void main(String[] args) throws Exception{
        String originalFilePath1 = "/Users/hs_/Downloads/test.png";
        String targetFilePath1 = "/Users/hs_/Downloads/targetFile1.png";

        FileInputStream fis = new FileInputStream(originalFilePath1);
        FileOutputStream fos = new FileOutputStream(targetFilePath1);
        
        String originalFilePath2 = "/Users/hs_/Downloads/test.png";
        String targetFilePath2 = "/Users/hs_/Downloads/targetFile2.png";
        
        FileInputStream fis2 = new FileInputStream(originalFilePath2);
        FileOutputStream fos2 = new FileOutputStream(targetFilePath2);

        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        //no buffer
        long nonBufferTime = copy(fis, fos);
        System.out.println("no buffer : " + nonBufferTime + "ns");
        
        long bufferTime = copy(bis, bos);
        System.out.println("use buffer : " + bufferTime + "ns");

        

    }

    private static long copy(InputStream is, OutputStream os) throws Exception {
        long start = System.nanoTime();

        while(true) {
            int data = is.read();
            if(data == -1) break;
            os.write(data);
        }
        os.flush();

        long end = System.nanoTime();

        return end - start;
    }
}
