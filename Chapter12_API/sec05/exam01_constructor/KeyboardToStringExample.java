package sec05.exam01_constructor;

import java.io.IOException;

public class KeyboardToStringExample {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[100];

        System.out.print("Enter : ");
        int readByteNo = System.in.read(bytes);

        String str = new String(bytes, 0, readByteNo-1);
        System.out.println(str);
    }
}
