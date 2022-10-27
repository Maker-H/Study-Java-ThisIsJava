package Question.exam02;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> c1 = new Container();
        c1.set("heesom");
        String str = c1.get();

        Container<Integer> c2 = new Container<>();
        c2.set(6);
        int value = c2.get();
        
        System.out.println(str+value);
    }
}
