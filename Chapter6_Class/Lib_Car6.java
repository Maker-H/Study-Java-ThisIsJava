public class Lib_Car6
{
	//Field 
	//make field as private not to change the data outside of class
	private int speed;
	private boolean stop;

	//Constructor
	
	//method
	public int getSpeed() { //getter method
		return speed;
	}
	
	public void setSpeed(int speed) { //setter method
		if(speed<0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}

	public boolean isStop() { //boolean's getter method
		return stop;
	}

	public void setStop(boolean stop) { //setter method
		this.stop = stop;
		this.speed = 0;
	}

}//end of class
