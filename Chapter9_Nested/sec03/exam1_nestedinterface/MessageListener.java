package sec03.exam1_nestedinterface;

public class MessageListener implements Button.OnClickListener{
    //override abstract method
    @Override
    public void onClick() {
        System.out.println("Sending message");
    }
    
}
