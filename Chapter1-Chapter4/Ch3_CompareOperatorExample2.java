
public class Ch3_CompareOperatorExample2{
    public static void main(String[] args){
       int v2 = 1;
       double v3 = 1.0;
       System.out.println(v2==v3); //assume ture
       System.out.println();
       
       /* this is purspose of this  practice*/
       double v4 = 0.1;
       float v5 = 0.1f;
       System.out.println(v4 == v5); 
       System.out.println((float)v4 == v5);
       System.out.println((int)(v4*10) == (int)(v5*10)); //convert float to int and compare
    }


    
}