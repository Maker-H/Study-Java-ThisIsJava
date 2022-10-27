package sec06.exam01_split_stringtokenizer;

public class StringSplitExample {
    public static void main(String[] args) {
        String text = "Sam&Marry,Kim,Ray,Java-Samsung";

        String[] names = text.split("&|,|-");
        for(String name : names) {
            System.out.println(name);
            System.out.println();

        }
    }
}
