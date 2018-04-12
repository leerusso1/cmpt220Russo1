import java.util.Random;
import java.util.Scanner;

public class Problem12_3 {
	public static void main(String[] args) {

		int[] intArray = new int[100];

		for (int i = 0; i < intArray.length; i++) {
			Random rand = new Random();

			int n = rand.nextInt();
			intArray[i] = n;
		}
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the index: ");
		int n = reader.nextInt();

		try {
			System.out.println(intArray[n]);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.print("Out of bounds");
		}
	}
}