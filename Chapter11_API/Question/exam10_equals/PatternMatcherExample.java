package Question.exam10_equals;

import java.util.regex.Pattern;

public class PatternMatcherExample {
    public static void main(String[] args) {
        String id ="5Angel10004";
        String regExp="\\w{8,12}";
        boolean isMatch = Pattern.matches(regExp, id);
        
        if(isMatch) {
            System.out.println("can use as id");
        }else {
            System.out.println("cannot use as id");
        }
    }
}
