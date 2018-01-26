package projects;
import java.util.Scanner; 

public class Excercise2_1 {
	public static void main(String args[])
	{ 
		Scanner scan= new Scanner(System.in); 
		
		System.out.println("Enter 1 to convert from Celcius to Farenheit.");
		System.out.println("Enter 2 to convert from Farenheit to Celsius");
		int choice = scan.nextInt(); 
		
		double temperature=0.0;
		double converted= 0.0;
		if (choice==1)
		{ 
			System.out.println("Enter the temperature in Celsius.");
			temperature = scan.nextDouble();
			converted = 9/5.0*temperature+32;
			System.out.println("Temperature in Farenheit= "+converted);
		}
		else if(choice==2) {
			System.out.println("Enter the temperature in Farenheit.");
			temperature = scan.nextDouble();
			converted = 5/9.0*(temperature-32);
			System.out.println("Temperature in Celsius= "+converted);
		}
		else 
			System.out.println("Wrong Input. Please try again.");
	}
	
}
