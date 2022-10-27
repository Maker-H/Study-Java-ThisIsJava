package sec05.exam02_method;

public class StringSubstringExample {
    public static void main(String[] args) {
        String ssn = "951220-20000001";

        String firstNum = ssn.substring(0,6);
        //0=<x<6, 0~5. doesn't include 6
        System.out.println(firstNum);

        String secondNum = ssn.substring(7, 15);
        System.out.println(secondNum);
    }
}
