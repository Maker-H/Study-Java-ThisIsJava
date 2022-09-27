package sec01.exam02_hashcode;

public class Key {
    //Field
    public int number;

    //Constructor
    public Key(int number) {
        //initialize field
        this.number = number;
    }

    //Method
    @Override
    public boolean equals(Object obj) {
        System.out.println("equals()");
        if(obj instanceof Key) { //if obj is made as Key
            Key compareKey = (Key) obj; //convert Object obj to Key
            if(this.number == compareKey.number) { //if value of this.number is the same with compareKey.number
                return true; //return ture
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode()");
        return number;
    }
    
}
