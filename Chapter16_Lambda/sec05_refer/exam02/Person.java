package sec05_refer.exam02;

public class Person {
    public void ordering(Comparable comparable) {
        String a = "heesom";
        String b = "java";

        int result = comparable.compare(a, b);
        
        if(result < 0) {
            System.out.println(a + " comes first then " + b);
        } else if(result == 0) {
            System.out.println(a + " is the same with " + b);
        } else {
            System.out.println(a + " comes before then " + b);
        }

    }
}
