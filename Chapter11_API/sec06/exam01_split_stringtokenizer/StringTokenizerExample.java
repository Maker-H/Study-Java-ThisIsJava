package sec06.exam01_split_stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String text = "Sam/Ray/Google";

        //how1 : get the number of token and loop by for statment
        StringTokenizer st = new StringTokenizer(text,"/");
        int countTokens = st.countTokens(); //get left token
        for(int i=0; i<countTokens; i++) {
            String token = st.nextToken();
            System.out.println(token);
        }

        System.out.println("======how2=======");
        //how2 : check left token and loop by while statement
        st = new StringTokenizer(text,"/");
        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
