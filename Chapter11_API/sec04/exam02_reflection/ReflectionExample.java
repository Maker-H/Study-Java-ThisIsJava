package sec04.exam02_reflection;


import java.lang.reflect.*;

public class ReflectionExample {
    public static void main(String[] args) throws Exception{ //throw exception to jvm which calls main method
        
        Class clazz = Class.forName("sec04.exam02_reflection.Car");

        System.out.println("[Class name]");
        System.out.println(clazz.getSimpleName());
        System.out.println();

/* ===============Print Constructor ============ */

        System.out.println("[Constructor info]");
        Constructor[] constructors = clazz.getDeclaredConstructors(); //call constructor and make each constructor object as array
        for(Constructor constructor : constructors) {
            System.out.print(constructor.getName()+" (");
            Class[] parameters = constructor.getParameterTypes();
            //get parameter objects as aray
            printParameters(parameters);
            System.out.println(")");
        }
        System.out.println();

/*==================Print Field=================== */
        System.out.println("[Field info]");
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields) {
            System.out.println(field.getType().getSimpleName()+ " "+ field.getName()); 
            //get name of field type + get name of field
        } 
        System.out.println();

/*================Print Method=================== */
        System.out.println("[Method info]");
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method : methods) {
            System.out.print(method.getReturnType().getSimpleName() + " ");
            System.out.print(method.getName()+"(");
            Class[] parameters = method.getParameterTypes();
            printParameters(parameters);
            System.out.println(")");
        }
        System.out.println();
    }

    //Common Method 
    private static void printParameters(Class[] parameters){
        for(int i=0; i<parameters.length;i++) {
            System.out.print(parameters[i].getSimpleName());
            if(i<(parameters.length-1)) {System.out.print(", ");}
        }
    }

}
