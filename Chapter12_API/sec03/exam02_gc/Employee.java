package sec03.exam02_gc;

public class Employee {
    //Field
    public int eno;
    
    //Constructor
    public Employee(int eno) {
        this.eno = eno;
        System.out.println("Employee(" + eno + ") is created in memory");
    }

    //Method
    public void finalize() throws Throwable {
        System.out.println("Employee (" + eno + ")is elemenated at memory");
    }
}
