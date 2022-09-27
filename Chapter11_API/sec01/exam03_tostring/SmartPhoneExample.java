package sec01.exam03_tostring;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("Google", "Android");

        String obj = myPhone.toString();
        System.out.println(obj);
        System.out.println(myPhone);

    }
}
