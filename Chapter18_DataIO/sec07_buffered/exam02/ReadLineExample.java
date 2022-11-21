package sec07_buffered.exam02;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineExample {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("/Users/hs_/Downloads/test.txt"));

        int lineNo = 1;
        while(true) {
            String str = br.readLine();
            if(str == null) break;
            System.out.println(lineNo + "\t" + str);
        }

        br.close();
    }
}
