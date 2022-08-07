public class Ch5_ArrayCopyExample {
    public static void main(String[] args) {
        String[] oldStrArray = {"java", "array", "copy"}; //array length 3
        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for(int i=0; i<newStrArray.length; i++) {
            System.out.println(newStrArray[i]+",");
        }
    }//end of main

   
    
}//end of class

