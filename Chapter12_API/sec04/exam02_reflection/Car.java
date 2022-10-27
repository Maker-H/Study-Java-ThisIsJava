package sec04.exam02_reflection;

public class Car {
    //Field
    private String model;
    private String owner;

    //Constructor
    public Car() {}
    public Car(String model) {
        this.model = model;
    }
    public Car(String model, String owner) {
        this.model = model;
        this.owner = owner;
    }

    //Method Getter and Setter
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getOwner() {
        return owner;
    }
    //set as private
    private void setOwner(String owner) {
        this.owner = owner;
    }

    
    
}
