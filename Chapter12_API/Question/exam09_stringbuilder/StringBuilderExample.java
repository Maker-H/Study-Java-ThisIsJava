package Question.exam09_stringbuilder;

public class StringBuilderExample {
    public static void main(String[] args) {
        String str = " ";
        for(int i=0; i<=100; i++) {
            str += i;
        }
        System.out.println(str);
        
        //Improved code
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<-100;i++){
            sb.append(i);
        }
        System.out.println(str);

    }
}
