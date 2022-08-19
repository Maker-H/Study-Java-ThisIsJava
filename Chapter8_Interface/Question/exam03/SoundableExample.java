package Question.exam03;

public class SoundableExample {
    private static void printSound(Soundable soundabl) {
        System.out.println(soundabl.sound());
    }

    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());
    }
}
