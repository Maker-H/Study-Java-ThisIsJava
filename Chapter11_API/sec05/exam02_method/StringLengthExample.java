package sec05.exam02_method;

public class StringLengthExample {
    public static void main(String[] args) {
        String ssn = "9512202600000";
        int length = ssn.length();

        if(length == 13) {
            System.out.println("the number of digits in ssn is correct");
        } else  {
            System.out.println("the number of digits in ssn is incorrect");
        }
    }
}
