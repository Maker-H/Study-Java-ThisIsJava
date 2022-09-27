package sec08.exam01_pattern_match;

import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        String regExp = "(02|010)-\\d{3,4}-\\d{4}";
        String data = "010-7256-1378";
        boolean result = Pattern.matches(regExp,data);
        if(result) {
            System.out.println("Consistent with regular expression");
        } else {
            System.out.println("Unconsistent with regular expression");
        }
        
        regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        data = "angel@navercom";
        result = Pattern.matches(regExp, data);
        if(result) {
            System.out.println("Consistent with regular expression");
        } else {
            System.out.println("Unconsistent with regular expression");
        }

    }


}
