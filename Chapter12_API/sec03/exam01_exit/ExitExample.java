package sec03.exam01_exit;

public class ExitExample {
    public static void main(String[] args) {
       
       /* for(int i=0; i<10; i++) {
            System.out.println(i);
            if(i==6) {
                System.exit(0);
            }
        }*/


        System.setSecurityManager(new SecurityManager() {
            @Override
            public void checkExit(int status) {
                if(status != 5) { //if status is not 5, raise an error
                    throw new SecurityException();
                }
            }
        });

        for(int i=0; i<10; i++) {
            System.out.println(i);
            try {
                System.exit(i); //if i is 5, ends JVM. 
            } catch (SecurityException e) {}
        }
    }


}

