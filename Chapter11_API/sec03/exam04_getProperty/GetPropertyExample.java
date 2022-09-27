package sec03.exam04_getProperty;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
    public static void main(String[] args) {
        String osName = System.getProperty("os.name"); 
        String userName = System.getProperty("user.name"); 
        String userHome = System.getProperty("user.home"); 

        System.out.println("OS : " +osName);
        System.out.println("user name : " +userName);
        System.out.println("Home directory : " +userHome);

        System.out.println("-------------");
        System.out.println("[key]  value");
        System.out.println("-------------");


        //print all property's key and value
        Properties props = System.getProperties(); //get collection consist by key and value
        Set keys = props.keySet(); //get value of only keys in collection

        for(Object objKey : keys) { //put all value in keys array to objKey in order
            String key = (String) objKey;
            String value = System.getProperty(key);
            System.out.println("["+key+"] "+value);
        }
    }
}
