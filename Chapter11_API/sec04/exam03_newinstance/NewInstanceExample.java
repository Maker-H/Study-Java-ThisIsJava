package sec04.exam03_newinstance;

public class NewInstanceExample {
    public static void main(String[] args) {
        try {
           // Class clazz = Class.forName("sec04.exam03_newinstance.SendAction"); //ClassNotFound exception could occur
            Class clazz = Class.forName("sec04.exam03_newinstance.ReceiveAction");
            Action action = (Action) clazz.newInstance(); //get Object object and cast to action
            action.execute();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
