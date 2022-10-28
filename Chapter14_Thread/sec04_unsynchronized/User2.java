package sec04_unsynchronized;

public class User2 extends Thread{
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.setName("User2"); //Set current Thread's name
        this.calculator = calculator; //Store parameter's calculator to fiel calculator
    }

    public void run(){
        calculator.setMemory(2);
    }
    
}
