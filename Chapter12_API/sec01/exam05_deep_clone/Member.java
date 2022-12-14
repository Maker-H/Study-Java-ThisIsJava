package sec01.exam05_deep_clone;

import java.util.Arrays;

public class Member implements Cloneable {
    //Field
    public String name;
    public int age;
    public int[] scores;
    public Car car;

    //Constructor
    public Member(String name, int age, int[] scores, Car car) {
        this.name = name;
        this.age = age;
        this.scores = scores;
        this.car = car;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //frist do thin clone 
        Member cloned = (Member) super.clone();

        //deep clone scores
        cloned.scores = Arrays.copyOf(this.scores,this.scores.length);
        //deep clone car
        cloned.car = new Car(this.car.model);
        return cloned;
    }

    public Member getMember() {
        Member cloned = null;
        try{
            cloned = (Member)clone();
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }

    
    
    
}
