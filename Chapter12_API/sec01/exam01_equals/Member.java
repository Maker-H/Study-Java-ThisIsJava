package sec01.exam01_equals;

public class Member {//inherite Object class automatically

    //Field
    public String id;

    //Constructor
    public Member (String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member member = (Member) obj;
            //in case of string equals compare data not object
            if(id.equals(member.id)) { //member.id means the id value that comes in this method and id of id.equals is the filed in this member class
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}