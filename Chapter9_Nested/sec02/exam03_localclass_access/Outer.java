package sec02.exam03_localclass_access;

public class Outer {
    //before java7. have no final so occurs error 
    public void method1(){
        int localVariable = 1;
        
        class Inner{ //inner class stored in heap


            void method(int arg) {
                //always stores here
                int result = arg + localVariable;
            }
        }
    }
    
    
    
    
    
    //after java8
    public void method2(){
        int localVariable = 1;
        
        class Inner{ //inner class
            //if var has no final 
            
            
            void method(int arg) {
                //if var has final keywork stores in here
                int result = arg + localVariable;
            }
        }
    }
    }
