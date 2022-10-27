package sec05.exam02_method;

public class StringCharAtExample {
    public static void main(String[] args) {
        String ssn = "412345";
        char sex = ssn.charAt(0);
        
        switch(sex) {
            case '1':
            case '3':
                System.out.println("male");
                break;
            case '2':
            case '4':
                System.out.println("female");
                break;
        }
    }
}
