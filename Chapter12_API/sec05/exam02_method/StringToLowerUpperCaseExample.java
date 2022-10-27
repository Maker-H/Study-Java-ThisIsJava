package sec05.exam02_method;

public class StringToLowerUpperCaseExample {
    public static void main(String[] args) {
        String str1 = "java programming";
        String str2 = "JAVA Programming";

        System.out.println("before converting to lower or upper : "+str1.equals(str2));

        String lowerStr1 = str1.toLowerCase();
        String lowerStr2 = str2.toLowerCase();
        System.out.println("after convert to lower : "+lowerStr1.equals(lowerStr2));

        System.out.println("used equalsIgnoreCase : "+str1.equalsIgnoreCase(str2));
    }
}
