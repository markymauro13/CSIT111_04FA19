// Author: Mark Mauro
import java.util.Random;

public class Die {

	private int MAX = 6;
	private int faceValue;
	
	public Die() {
		faceValue = 1;	// initializes face value to 1
	}
	
	public int roll() {		// method for simulating rolling a die
		faceValue = (int)(Math.random() * MAX) + 1;
		return faceValue;
	}
	
	public void setFaceValue(int value) {	// method to set a certain value to the die
		faceValue = value;
	}
	
	public int getFaceValue() {		// return the current face value
		return faceValue;
	}
	
	public String toString() {		// return the faceValue as a String
		return "" + faceValue;
		
	}
}
