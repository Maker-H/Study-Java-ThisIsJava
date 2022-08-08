public class C_Car3{
	//Field
	int gas;

	//Constructor

	//Method
	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("No gas");
			return false;
		}
		System.out.println("Has gas");
		return true;
	}

	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("Running. (Remaining amout of gas : "+ gas+ ")");
				gas-=1;
			} else {
				System.out.println("Stopping. (Remaining amout of gas : "+ gas+ ")");
				return;
			}
		}
	}
}//end of class
