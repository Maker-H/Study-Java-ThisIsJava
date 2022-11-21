package sec06_convert;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.channels.WritableByteChannel;

public class CharacterConvertStreamExample {
    public static void main(String[] args) throws Exception{
        write("Use convert stream");
        String data = read();
        System.out.println(data);
    }

    private static String read() throws Exception {
        InputStream is = new FileInputStream("/Users/hs_/Downloads/test.txt");
        Reader reader = new InputStreamReader(is, "UTF-8");
        char[] data = new char[100];
        int num = reader.read(data);
        reader.close();
        String str = new String(data, 0, num);
        return str;
    }

    private static void write(String str) throws Exception {
        OutputStream os = new FileOutputStream("/Users/hs_/Downloads/test.txt");
        Writer writer = new OutputStreamWriter(os, "UTF-8");
        writer.write(str);
        writer.flush();
        writer.close();
    }
}
