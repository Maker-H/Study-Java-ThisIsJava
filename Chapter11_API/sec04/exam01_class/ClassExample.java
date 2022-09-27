package sec04.exam01_class;



public class ClassExample {
    public static void main(String[] args) {
        
    
    Car car = new Car();
    Class clazz1 = car.getClass(); //get class object by object

    System.out.println(clazz1.getName()); //get hole name with pacakge
    System.out.println(clazz1.getSimpleName()); //get only class name
    System.out.println(clazz1.getPackage().getName()); //get package name
    

    System.out.println("-------");


    try{
        Class clazz2 = Class.forName("sec04.exam01_class.Car");
        System.out.println(clazz1.getName()); //get hole name with pacakge
        System.out.println(clazz1.getSimpleName()); //get only class name
        System.out.println(clazz1.getPackage().getName()); //get package name
    } catch (ClassNotFoundException e) {
     //   e.printStackTrace();
    }
    }
}
