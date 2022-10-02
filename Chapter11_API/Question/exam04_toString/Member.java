package Question.exam04_toString;

public class Member {
    //Feild
    private String id;
    private String name;

    //Constuctor
    public Member(String id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return id+": "+name;
    }
}
