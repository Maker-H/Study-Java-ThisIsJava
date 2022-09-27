package sec05.exam02_method;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
    public static void main(String[] args) {
        String str = "euc는 한글 2바이트 utf는 한글 3바이트로 변환합니다";

        byte[] bytes1 = str.getBytes(); //convert str to byte
        System.out.println("default os bytes1.length : "+bytes1.length);
        String str1 = new String(bytes1); //convert bytes to str
        System.out.println("byte to str : " +str1);

        try{
            byte[] bytes2 = str.getBytes("EUC-KR"); //incode as euc-kr
            System.out.println("bytes2.length : "+bytes2.length);
            String str2 = new String(bytes2, "EUC-KR");
            System.out.println("bytes->String : " + str2);
            
            
            byte[] bytes3 = str.getBytes("UTF-8"); //incode as euc-kr
            System.out.println("bytes3.length : "+bytes3.length);
            String str3 = new String(bytes3, "UTF-8");
            System.out.println("bytes->String : " + str3);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
