package sec03.exam02_gc;

public class GcExample {
    public static void main(String[] args) {
        Employee emp;

        emp = new Employee(1);
        emp = null;
        emp = new Employee(2);
        emp = new Employee(3);

        System.out.print("employee number which emp refers lastly is "); System.out.println(emp.eno);
        System.gc(); //garbage collector
    }
}

