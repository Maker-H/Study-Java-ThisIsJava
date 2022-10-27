package sec05.exam02_method;

public class StringIndexOfExample {
    public static void main(String[] args) {
        String subject = "java programming";

        int location = subject.indexOf("programming");
        System.out.println(location); //return index num where 'programming' string starts

        
        if(subject.indexOf("java") != -1) {
            System.out.println("related with java");
        } else {
            System.out.println("not related with java");
        }

    }
}
