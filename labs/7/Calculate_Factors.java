import java.util.Scanner; 

public class Calculate_Factors { 
	public static void main(String[] args) {
		StackOfIntegers stack = new StackOfIntegers(); 
		
        System.out.print("Enter a positive number: ");
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
        for (int i = 2; i<=(number); i++) {
            while (number % i == 0) {
                number /= i;
                stack.push(i);   
            }
        } 
        while (!stack.empty()) {
        	System.out.print(stack.pop() + " ");
        }
    }
}
