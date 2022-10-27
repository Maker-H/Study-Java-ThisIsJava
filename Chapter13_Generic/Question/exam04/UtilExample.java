package Question.exam04;

public class UtilExample {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String,Integer>("heesom", 28);
        Integer age = Util.getValue(pair,"heesom");
        System.out.println(age);

    }
}
