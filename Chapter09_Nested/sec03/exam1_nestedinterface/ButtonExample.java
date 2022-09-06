package sec03.exam1_nestedinterface;

public class ButtonExample {
    public static void main(String[] args) {
        Button btn = new Button();

        btn.SetOnClickListner(new CallListener());
        btn.touch();

        btn.SetOnClickListner(new MessageListener());
        btn.touch();
        

        //button's onclicklistener interface
        btn.SetOnClickListner(new Button.OnClickListener() {

            @Override
            public void onClick() {
                System.out.println("Taking Picture");
                
            }
            
        });

        btn.touch();

    }
}
