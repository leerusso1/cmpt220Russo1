import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Problem12_11 {
	public static void main(String[] args) throws IOException {
		/*
		 * File file = new File("File1.txt"); Scanner input = new Scanner(file);
		 * 
		 * while (input.hasNext()) { System.out.println(input.next());
		 */
		if (args.length != 2) { // JA
			System.out.println("Java Excercise12_11 <stringToRemove> filename");
			System.exit(1);
		}

		File sourceFile = new File(args[1]);
		if (!sourceFile.exists()) {
			System.out.println("Source file" + args[1] + "does not exist");
			System.exit(2);
		}
		String toRemove = args[0];
		Scanner input = new Scanner(sourceFile);
		String line = input.nextLine(); 
		BufferedWriter writer = new BufferedWriter (new FileWriter(args[1]));
		line = line.replace(toRemove, "");
		System.out.println(line);
		writer.write(line); 
	}
}