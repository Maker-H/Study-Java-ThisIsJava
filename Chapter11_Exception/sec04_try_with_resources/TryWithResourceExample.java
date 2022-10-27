package sec04_try_with_resources;

public class TryWithResourceExample {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("file.txt")) {
            fis.read();//when this code is finished, close method is called automatically
            throw new Exception();//force an exception to occur
        } catch(Exception e) {
            System.out.println("exception code has been started");
        }
    }
}
