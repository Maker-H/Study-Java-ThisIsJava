public class Lib_ShopService{
	//Field
	private static Lib_ShopService shopService = new Lib_ShopService();

	//Consturctor
	//as the constructor is called object is made. therefore not to be called outside, Constructor has to be private. 
	private Lib_ShopService() {}

	//Method
	static Lib_ShopService getInstance() {
		return shopService;
	}

}//end of class
