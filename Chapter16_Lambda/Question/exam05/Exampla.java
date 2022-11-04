package Question.exam05;

public class Exampla {
    public static void main(String[] args) {
        Button  bton = new Button();
        bton.setClickListener(() -> System.out.println("clicked ok button"));
        bton.click();

        Button btcancel = new Button();
        btcancel.setClickListener(() -> System.out.println("clicked cancel button"));
        btcancel.click();
    }
}
