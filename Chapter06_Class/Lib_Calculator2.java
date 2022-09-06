public class Lib_Calculator2{
	
    //method
    int plus(int x, int y) {
        int result = x+y;
        return result;
    }

    double avg(int x, int y) {
        double sum = plus(x,y);
        double result = sum/2;
        return result;
    }

    void execute() { 
        double result = avg(7,10);
        println("Execution result : " + result); //also a method
    }

    void println(String message) {
        System.out.print(message);
    }

}//end of class
