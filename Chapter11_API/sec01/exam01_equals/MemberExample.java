package sec01.exam01_equals;

public class MemberExample {
    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");
 
        if(obj1.equals(obj2)) {
            System.out.println("obj1(blue) equals obj2(blue)");
        } else {
            System.out.println("obj1(blue) doesn't equals obj2(blue) because each are diffent object with same data");
        }

        if(obj1.equals(obj3)) {
            System.out.println("obj1(blue) equals obj2(red)");
        } else {
            System.out.println("obj(blue) and obj3(Red) is not same");
        }
        
    }
}
