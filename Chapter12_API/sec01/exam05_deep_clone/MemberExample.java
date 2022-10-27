package sec01.exam05_deep_clone;

public class MemberExample {
    public static void main(String[] args) {
        Member original = new Member("Sam",25, new int[] {90,90}, new Car("Bently"));

        Member cloned = original.getMember();
        cloned.scores[0] = 0;
        cloned.car.model = "BMW";

        System.out.println("#####ORIGINAL######");
        System.out.println("age : "+original.age);
        System.out.print("scores : {" );
        for(int i=0; i<cloned.scores.length;i++) {
            System.out.print(cloned.scores[i]);
            System.out.print(i == (cloned.scores.length-1) ? "" : ",");
        }
        System.out.println("}");
        System.out.println("car : "+original.car.model);
        
        
        System.out.println();

        System.out.println("#####CLONED######");
        System.out.println("age : "+cloned.age);
        System.out.print("scores : {");
        for(int i=0; i<cloned.scores.length;i++) {
            System.out.print(cloned.scores[i]);
            System.out.print(i == (cloned.scores.length-1) ? "" : ",");
        }
        System.out.println("}");
        System.out.println("car : "+cloned.car.model);

    }
}
