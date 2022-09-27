package sec01.exam03_tostring;

public class SmartPhone {
    //Field
    private String company;
    private String os;

    //Constructor
    public SmartPhone(String company, String OS) {
        this.company = company;
        this.os = OS;
    }

    @Override
    public String toString() {
        return company+","+os;
    }

}
