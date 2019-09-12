
public class Earth {
	
	public static void main(String args[]) {
	
		Human Tom = new Human();
		
		/*
		 * or Human tom; 
		 * ... 
		 * tom = new Human();
		 */
		
		Tom.age = 5;
		Tom.eyeColor = "brown";
		Tom.heightInInches = 72;
		Tom.name = "Tom Zsabo";
		
		Tom.speak();
		Tom.eat();
		Tom.walk();
		Tom.work();
	}
	
}
