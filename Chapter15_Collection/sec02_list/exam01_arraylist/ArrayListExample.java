package sec02_list.exam01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();

        list.add(new Board("subject1", "content1", "writer1")); 
        list.add(new Board("subject2", "content2", "writer2")); 
        list.add(new Board("subject3", "content3", "writer3")); 
        list.add(new Board("subject4", "content4", "writer4")); 
        list.add(new Board("subject5", "content5", "writer5")); 

        int size = list.size();
        System.out.println("total objects number : "+size);
        System.out.println();

        Board b2 = list.get(2);
        System.out.println(b2.getSubject()+"\t"+b2.getContent()+"\t"+b2.getWriter());
        
        for(int i=0; i<list.size(); i++) {
            Board b = list.get(i);
            System.out.println(b.getSubject()+"\t"+b.getContent()+"\t"+b.getWriter());
        }
        System.out.println();
        
        list.remove(2);
        list.remove(2);
        
        for(Board b : list) {
            System.out.println(b.getSubject()+"\t"+b.getContent()+"\t"+b.getWriter());
        }
    }
    
}
