public class Lib_Service{
    @In_PrintAnnotation //apply as default 
    //this annotation serves to add dividing line
    public void method1() {
        System.out.println("Execution details 1");
    }
    
    @In_PrintAnnotation("*") //set the default element value as *
    public void method2() {
        System.out.println("Execution details 2");
    }
    
    @In_PrintAnnotation(value="*",number=20) //set value as #, number as 20
    public void method3() {
        System.out.println("Execution details 3");
    }


}//end of class
