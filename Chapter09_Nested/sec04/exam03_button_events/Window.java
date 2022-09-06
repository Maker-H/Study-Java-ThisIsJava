package sec04.exam03_button_events;

public class Window {
    //create field
    Button b1 = new Button();
    Button b2 = new Button();

    //put to filed
    Button.OnClickListener listener = new Button.OnClickListener() {

        @Override
        public void onClick() {
            System.out.println("Calling!!!!!");
            
        }
        
    };

    //Contructer
    Window() {
        b1.setOnClickListener(listener); 
        b2.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick() {
                System.out.println("send message");
                
            }
            
        });
    }

    Window(int a) {
        b2.setOnClickListener(listener); 
        b1.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick() {
                System.out.println("send message");
                
            }
            
        });
    }
}
