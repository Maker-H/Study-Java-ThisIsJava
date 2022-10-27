package sec04.exam01_unsynchronized;

public class User1 extends Thread{
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.setName("User1"); //Set current Thread's name
        this.calculator = calculator; //Store parameter's calculator to fiel calculator
    }

    public void run(){
        calculator.setMemory(100);
    }
    
}
