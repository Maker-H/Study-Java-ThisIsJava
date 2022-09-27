package sec11.exam01_math;

public class MathRandomExample {
    public static void main(String[] args) {
        int num = (int) (Math.random()*6)+1; //0~5 ->1~6
        System.out.println("dice number : "+num);
    }
}
