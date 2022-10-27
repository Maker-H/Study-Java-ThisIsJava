package Question.exam03;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String, String> c1 = new Container<>();
        c1.set("heesom", "developer");
        String name1 = c1.getkey();
        String job = c1.getValue();

        Container<String, Integer> c2 = new Container<>();
        c2.set("heesom", 28);
        String name2 = c2.getkey();
        int age = c2.getValue();

        System.out.println(name2+ " "+job+ " "+age);

    }
}
