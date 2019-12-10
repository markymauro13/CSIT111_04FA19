//********************************************************************

// Author: Mark Mauro

// Section: 04

// In Class Lab

//********************************************************************

import java.util.Scanner;

public class Calculation {

	public static void main(String args[]) {
	
      System.out.println("**********************");
      System.out.println("Task 1: Sum of Squares");
      System.out.println("**********************");
   
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		
		int x = sc.nextInt();
		
		if(x < 1) {
			System.out.println("error, less than 1");
		}
		else if(x >= 1) {
			System.out.println("The Sum of Squares is: " + sumSquare(x));
			
		}
		
		 System.out.println("***********");
      System.out.println("Task 2: Displacement");
      System.out.println("***********");
		
		System.out.print("Enter a value: ");
		int a = sc.nextInt();
		System.out.print("Enter another value: ");
		int b = sc.nextInt();
		System.out.print("Enter one last value: ");
		int c = sc.nextInt();
		
		System.out.println("The displacement of the values is: " + displacement(a,b,c));
		
		
	}
	
	public static int sumSquare(int x) {
		int sum = 0;
		for(int i  = 1; i <= x; i++) {
			sum += (i*i);
		}
		return sum;
	}
	
	public static double displacement(double x, double v, double t) {
		final double G = 9.78;
		return x + (v * t) - 9.78 * (t*t) / 2;
	}
	
}