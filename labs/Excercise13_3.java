import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Excercise13_3 {
	public static void main(String[] args) {
		ArrayList<Integer> collection1 = new ArrayList<>();
		collection1.add(65);
		collection1.add(1);
		collection1.add(18);
		collection1.add(7);

		System.out.println("A list of numbers in collection1: ");
		sort(collection1);

	}

	public static void sort(ArrayList<Number> list) {
		Collections.sort(list);
	}
}
