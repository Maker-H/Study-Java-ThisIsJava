package sec07.exam01_stringbuilder;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); //make stringbuilder object

        System.out.println("============append==========");
        sb.append("JAVA"); //add java at the end of string
        sb.append(" Program Study"); //add at the end of string
        System.out.println(sb.toString());
        
        
        System.out.println("============insert==========");
        sb.insert(4,2);
        System.out.println(sb.toString());
        
       
        System.out.println("============setChar==========");
        sb.setCharAt(4, '6'); //beware that it's char!!
        System.out.println(sb.toString());
        

        System.out.println("============replace==========");
        sb.replace(6,13,"book"); //convert index6~12 to book
        System.out.println(sb.toString());


        System.out.println("============delete==========");
        sb.delete(4, 5); //delete only index 4
        System.out.println(sb.toString());
        

        System.out.println("============length==========");
        int length = sb.length();
        System.out.println(length);
        
        
        System.out.println("============tostring==========");
        String result = sb.toString();
        System.out.println(result);


    }
}
