package Question.exam04;

public class OracleDao implements DataAccessObject{

    @Override
    public void delete() {
        System.out.println("Delete Oracle DB");
        
    }

    @Override
    public void insert() {
        System.out.println("Insert to Oracle DB");
        
    }

    @Override
    public void select() {
        System.out.println("Select in Oracle DB");
        
    }

    @Override
    public void update() {
        System.out.println("Modify Oracle DB");
        
    }
    
}
