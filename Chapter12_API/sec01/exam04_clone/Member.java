package sec01.exam04_clone;


public class Member implements Cloneable{
    //Field
    public String id, name, password;
    public int age;
    public boolean adult;

    //Constructor
    public Member(String id, String name, String password, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
    }

    //Method
    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone();
        }catch(CloneNotSupportedException e) {}
            return cloned;
    }
    
    
}
