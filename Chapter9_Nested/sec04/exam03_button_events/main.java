package sec04.exam03_button_events;

public class main {
    public static void main(String[] args) {
        Window w = new Window();
        w.b1.touch();
        w.b2.touch();
        
        
        System.out.println("-------------");
        int a;

        Window re = new Window(1);
        
        re.b1.touch();
        re.b2.touch();


    }
}
