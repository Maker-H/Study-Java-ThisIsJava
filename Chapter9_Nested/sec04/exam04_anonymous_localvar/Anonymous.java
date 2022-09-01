package sec04.exam04_anonymous_localvar;

public class Anonymous {
    private int field;

    public void method(int arg1, int arg2) {
        int var1 = 0;
        int var2 = 0;
        
        //arg1 = 20;
        //arg2 = 20;
        //var1 = 30;
        //var2 = 30;
        //by this example we can learn that if we use method's local variable in anonymous implemented object variable is automatically defined as final 
        //if variable is defined as final it cannot be changed

        field = 10;

        Calculatable calc = new Calculatable() {

            @Override
            public int sum() {
                int result = arg1+arg2+var1+var2;
                return result;
            }
            
        };
        System.out.println(calc.sum());

    }
 }
