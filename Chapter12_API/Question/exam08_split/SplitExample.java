package Question.exam08_split;

import java.util.StringTokenizer;

public class SplitExample {
    public static void main(String[] args) {
        String str = "id,name,passward";
        
        //Way 1:
        String[] arrs = str.split(",");
        for(String arr: arrs){
            System.out.println(arr);
        }

        System.out.println();
        //Way 2:
        StringTokenizer st = new StringTokenizer(str,",");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }


    }
}
