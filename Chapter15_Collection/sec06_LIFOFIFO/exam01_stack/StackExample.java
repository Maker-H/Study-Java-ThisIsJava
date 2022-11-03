package sec06_LIFOFIFO.exam01_stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinbox = new Stack<Coin>();

        coinbox.push(new Coin(100));
        coinbox.push(new Coin(150));
        coinbox.push(new Coin(200));
        coinbox.push(new Coin(300));
        coinbox.push(new Coin(400));

        while(!coinbox.isEmpty()) {
            Coin coin = coinbox.pop();
            System.out.println("tacken out"+ coin.getValue()+"won");
        }
        
    }
}
