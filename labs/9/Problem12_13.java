import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem12_13 {
	public static void main(String [] args) throws FileNotFoundException {
		if (args.length != 1) {
			System.out.println("filename");
			System.exit(1);
		}
		File file = new File(args[0]); 
		Scanner in = new Scanner(file); 
		int words = 0; 
		int lines = 0; 
		int chars = 0; 
		while(in.hasNextLine()) {
			lines++; 
			String line = in.nextLine(); 
			chars += line.length(); 
			// JA: Use line.split(" ").length
			words += new StringTokenizer(line, ",").countTokens();
		}
		System.out.println("words: " + words + " lines: " +lines + " chars: " +chars); 
	}
}
