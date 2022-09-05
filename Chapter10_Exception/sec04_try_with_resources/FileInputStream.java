package sec04_try_with_resources;

public class FileInputStream implements AutoCloseable {
    //Field
    private String file;

    //Constructor
    public FileInputStream(String file) {
        this.file = file;
    }

    //Method
    public void read() {
        System.out.println("read"+file);
    }

    @Override
    public void close() throws Exception {
        System.out.println("close"+file);
    }
    
}
