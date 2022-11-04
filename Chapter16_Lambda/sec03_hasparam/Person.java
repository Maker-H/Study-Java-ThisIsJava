package sec03_hasparam;

public class Person {
    public void action1(Workable workable) {
        workable.work("heesom", "programming");
    }
    public void action2(Speakable speakable) {
        speakable.speak("hi~");
    }
}
