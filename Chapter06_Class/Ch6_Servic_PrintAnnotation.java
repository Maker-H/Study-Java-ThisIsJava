import java.lang.reflect.*;

public class Ch6_Servic_PrintAnnotation{
	public static void main(String[] args){
		//get annotation method info from class service as array
		Method[] declaredMethods = Lib_Service.class.getDeclaredMethods();

		//copy delcaredMethods to 'method' one by one
		for(Method method : declaredMethods) {
			
			//check whether In_PrintAnnotation is applyed.
		 	if(method.isAnnotationPresent(In_PrintAnnotation.class)) {
				//If In_PrintAnnotation is applied, get an object
				In_PrintAnnotation printAnnotation = method.getAnnotation(In_PrintAnnotation.class);
			
		
				//print 'Lib_Setvice methods' name
				System.out.println("["+method.getName()+"]");
				
				//print dividing line
				for(int i=0; i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();

				try {
					//call method
					method.invoke(new Lib_Service());
				} catch (Exception e) {
					System.out.println();
				}

			}//end of if
		}//end of loop

	}//end of main
}//end of class
