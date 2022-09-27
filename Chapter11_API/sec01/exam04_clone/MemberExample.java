package sec01.exam04_clone;

public class MemberExample {
    public static void main(String[] args) {
        
    Member original = new Member("blue", "Sam", "12345", 25, true);

    //get cloned object and change passward
    Member cloned = original.getMember();
    cloned.password = "0000";

    System.out.println("#######Original member#######");
    System.out.println("name : "+original.name);
    System.out.println("password : "+original.password);
    System.out.println("age : "+original.age);
    System.out.println("adult : "+original.adult);

    System.out.println("#######Cloned member#######");
    System.out.println("name : "+cloned.name);
    System.out.println("password : "+cloned.password);
    System.out.println("age : "+cloned.age);
    System.out.println("adult : "+cloned.adult);
}
}
