package sec02.exam04_outerclass_reference;

public class Outter {
    String field = "Outter-field";
    void method() {
        System.out.println("Outter-method");
    }

    class Nested {
        String field = "inner-field";
        void method() {
            System.out.println("Inner-Class");
        }

        void print() {
            System.out.println(field); //nested field
            System.out.println(this.field); //nested field
            System.out.println(Outter.this.field); //outer field
        }
    }
}
