public class Lib_MemberService{
	//Method
	boolean login(String id, String passward) {
		if(id.equals("hong") && passward.equals("12345")) 
			return true;
		else
			return false; 
	}

	void logout(String id) {
		System.out.println("Logout");
	}
}//end of class
