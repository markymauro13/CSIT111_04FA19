
public class RollingDice {

	public static void main(String[] args) {

		Die die1 = new Die();
		Die die2 = new Die();
		int sum;
		
		die1.roll();
		System.out.println("The current face value of die1 is: " + die1);
	
		die2.roll();
		System.out.println("The current face value of die2 is: " + die2);
		die2.setFaceValue(3);
		System.out.println("Now The current face value of die2 is: " + die2);
		
		
		sum = die1.getFaceValue() + die2.getFaceValue();
	    System.out.println("Sum: " + sum);
	    
	    sum = die1.roll() + die2.roll();
	    System.out.println("The sum of die1, (" + die1 + ") and die2, (" + die2 +") is: " + sum);
		
	}

}
