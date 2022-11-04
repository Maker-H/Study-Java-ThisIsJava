package sec02_noparam.exam02;

public class ButtonExample {
    public static void main(String[] args) {
        Button bt = new Button();
        bt.setClickListner(() -> {
            System.out.println("Clicked okay button");
        });

        bt.click();

        Button btcancel = new Button();

        btcancel.setClickListner(() -> {
            System.out.println("clicked cancel button");
        });

        btcancel.click();
    }
}
