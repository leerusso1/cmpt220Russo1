package projects;

import java.util.Scanner;

public class Excercise2_5 {

		public static void main(String args[]) {
			//Declare variables 
			double subtotal;
			double rate; 
			double gratuity; 
			double total; 
			
			//Create a scanner object
			Scanner input = new Scanner(System.in); 
			
			// Receieve inputs from keyboard
			System.out.println("Enter a subtotal: "); 
			subtotal = input.nextDouble();
			
			System.out.println("Enter gratuity rate:"); 
			rate = input.nextDouble();
			
			gratuity = (subtotal * rate)/100D;
			total = subtotal + gratuity; 
			
			//Display results 
			System.out.println("the gratuity is " + gratuity + " and total is " + total);
			
		}
}
