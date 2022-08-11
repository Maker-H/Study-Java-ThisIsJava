public class Ch6_ShopService_Singleton{
	public static void main(String[] args){
		Lib_ShopService obj1 = Lib_ShopService.getInstance();
		Lib_ShopService obj2 = Lib_ShopService.getInstance();

		if(obj1==obj2) {
			System.out.println("Same ShopService object");
		} else {
			System.out.println("Different ShopService object");
		}

	}//end of main
}//end of class
