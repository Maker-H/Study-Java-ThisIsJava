package Question.exam04;

public class MySqlDao implements DataAccessObject{

    @Override
    public void delete() {
        System.out.println("Delete MySql DB");
        
    }

    @Override
    public void insert() {
        System.out.println("Insert to MySql DB");
        
    }

    @Override
    public void select() {
        System.out.println("Select in MySql DB");
        
    }

    @Override
    public void update() {
        System.out.println("Modify MySql DB");
        
    }
    
}
