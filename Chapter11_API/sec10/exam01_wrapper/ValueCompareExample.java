package sec10.exam01_wrapper;

public class ValueCompareExample{
    public static void main(String[] args) {
        System.out.println("[-128~127 out of range]");
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println("Result of == : "+(obj1==obj2));        
        System.out.println("Result of == after unboxing : "+(obj1.intValue()
        ==obj2.intValue()));
        System.out.println("Result of equals : " +obj1.equals(obj2));
        System.out.println();

        System.out.println("[In range -128~127]");
        Integer obj3 = 100;
        Integer obj4 = 100;
        System.out.println("Result of == : "+(obj3==obj4));
        System.out.println("Result of == after unboxing : "+(obj3.intValue()==obj4.intValue()));
        System.out.println("Result of equals : "+obj3.equals(obj4));
    }
}