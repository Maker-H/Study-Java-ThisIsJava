package sec03_priority;


public class CalcThread extends Thread{
    //Constructor
    public CalcThread(String name) {
        setName(name);
    }

    public void run() {
        for(int i=0;i<2000000000;i++){
            //
        }
        System.out.println(getName());
    }
}
