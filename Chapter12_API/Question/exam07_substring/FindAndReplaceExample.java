package Question.exam07_substring;

public class FindAndReplaceExample {
    public static void main(String[] args) {
        String str = "every program can be porgrammed as java language";
        int index = str.indexOf("java");
        System.out.println(index);

        if(index ==-1 ) {
            System.out.println("java string does not exist");
        }else {
            System.out.println("java string exists");
            str = str.replace("java", "JAVA");
            System.out.println("->"+str);
        }
    }
}
