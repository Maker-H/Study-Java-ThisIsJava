package sec02.exam04_outerclass_reference;

public class OutterExample {
    public static void main(String[] args) {
        Outter outter = new Outter();
        Outter.Nested nest = outter. new Nested(); //not a static class
        nest.print();
    }
}
