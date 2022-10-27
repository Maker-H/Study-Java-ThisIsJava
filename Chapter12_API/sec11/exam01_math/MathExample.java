package sec11.exam01_math;

public class MathExample {
    public static void main(String[] args) {
        
        System.out.println("[Absolute Number]");
        int v1 = Math.abs(-1);
        double v2 = Math.abs(-10.2);
        System.out.println("v1 : "+v1);
        System.out.println("v2 : "+v2);
        System.out.println();
        
        
        System.out.println("[Round UP Number]");
        double v3 = Math.ceil(5.3);
        double v4 = Math.ceil(-5.9);
        System.out.println("v3 : "+v3);
        System.out.println("v4 : "+v4);
        System.out.println();
        
        
        System.out.println("[Round Down Number]");
        double v5 = Math.floor(5.3);
        double v6 = Math.floor(5.3);
        System.out.println("v5 : "+v5);
        System.out.println("v6 : "+v6);
        System.out.println();
        
        
        System.out.println("[Maximum Number]");
        int v7 = Math.max(1,10);
        double v8 = Math.max(1.2,10.6);
        System.out.println("v7 : "+v7);
        System.out.println("v8 : "+v8);
        System.out.println();
        
        
        System.out.println("[Minimum Number]");
        int v9 = Math.min(5,9);
        double v10 = Math.min(5.3,2.5);
        System.out.println("v9 : "+v9);
        System.out.println("v10 : "+v10);
        System.out.println();
        
        
        System.out.println("[Random Number]");
        double v11 = Math.random();
        System.out.println("v11 : "+v11);
        System.out.println();
        
        
        System.out.println("[Rounding to int Number]");
        double v12 = Math.rint(5.3);
        double v13 = Math.rint(10.2);
        System.out.println("v12 : "+v12);
        System.out.println("v13 : "+v13);
        System.out.println();
        
        
        System.out.println("[Round Up Number]");
        long v14= Math.round(5.3);
        long v15 = Math.round(5.7);
        System.out.println("v14 : "+v14);
        System.out.println("v15 : "+v15);
        System.out.println();
        
        System.out.println("[Round Up Number]");
        double value = 12.2345;
        double temp1 = value*100;
        long temp2 = Math.round(temp1);
        double v16 = temp2/100.0;
        System.out.println("v16 : "+v16);
        System.out.println();
    }
}
