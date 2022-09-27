package sec01.exam06_finalize;

public class Counter {
    //Field
    private int no;

    //Constructor
    public Counter(int no) {
        this.no = no;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(no+"st object's finalize method proceeds");
    }

}
