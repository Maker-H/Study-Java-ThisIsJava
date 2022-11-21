package sec09_print;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("/Users/hs_/Downloads/test.txt");
        PrintStream ps = new PrintStream(fos);

        ps.println("like");
        ps.println("printer is working,");
        ps.println("prints data");
        ps.println("prints data");
        ps.printf("| %6d | %-10s | %10s | \n", 1 , "heesom", "student");
        ps.printf("| %6d | %-10s | %10s | \n", 2 , "java", "doctor");

        ps.flush();
        ps.close();
    }
}
