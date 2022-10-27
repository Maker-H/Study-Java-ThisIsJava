package sec02_runtime_exception;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Animal animal = new Dog();

        Dog dog = (Dog) animal;
        changeDog(dog);

        //error
        Cat cat = new Cat();
        changeDog(cat);
    }

    //method
    public static void changeDog(Animal animal) {
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
        }else {
            System.out.print("cannot promote to dog");
        }
    }
}

    class Animal{}
    class Dog extends Animal{}
    class Cat extends Animal{}


