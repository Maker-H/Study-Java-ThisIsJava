package sec13.exam01_format;


import java.text.MessageFormat;
public class MessageFormatExample {
    public static void main(String[] args) {
        String id = "java";
        String name = "Heesom";
        String tel = "010-7256-1378";

        String text = "User ID : {0} \nUser Name : {1}\nUser Tel : {2}";
        String result1 = MessageFormat.format(text,id,name,tel);
        System.out.println(result1);
        System.out.println();

        String sql = "insert into member values( {0}, {1}, {2} )";
        Object[] arguments = {"java", "Heesom", "010-7256-1378"};
        String result2 = MessageFormat.format(sql, arguments);
        System.out.println(result2);
    }
}
