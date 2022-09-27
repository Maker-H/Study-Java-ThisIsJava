package sec05.exam02_method;

public class StringReplaceExample {
    public static void main(String[] args) {
        String oldStr = "java is object-oriented language. java supports abundant API";
        String newStr = oldStr.replace("java","자바"); //make new object with 'java' replaced by 'c'
        System.out.println(oldStr);
        System.out.println(newStr);
    }
}
