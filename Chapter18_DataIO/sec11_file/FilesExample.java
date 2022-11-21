package sec11_file;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExample {
    public static void main(String[] args) {
        try {
            String data = "" + "id : spring\n" + "email : spring@mycompany.com\n" + "tel : 010-1234-5678";

            Path path = Paths.get("/Users/hs_/Downloads/user.txt");

            Files.writeString(path, data, Charset.forName("UTF-8"));
            
            System.out.println("file type : " + Files.probeContentType(path));
            System.out.println("file size : " + Files.size(path) + "bytes");

            String content = Files.readString(path, Charset.forName("UTF-8"));
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
