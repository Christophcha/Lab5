import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) throws FileNotFoundException {

		int max = Integer.MIN_VALUE;
		String[] arr;
		int numIndex;
		int rowCount = 1;

		Scanner reader = new Scanner(
				new File("C:\\Users\\Christopher\\eclipse-workspace\\Lab5.exercise1\\src\\input.csv"));

		System.out.println("Maximum Values");

		while (reader.hasNextLine()) {
			arr = reader.nextLine().split(",");
			for (int i = 0; i < arr.length; i++) {
				numIndex = Integer.parseInt(arr[i]);
				if (numIndex > max) {
					max = numIndex;
				}
			}
			System.out.println("Row " + rowCount + ": " + max);
			max = Integer.MIN_VALUE; //resets max
			rowCount++;
		}

	}

}
