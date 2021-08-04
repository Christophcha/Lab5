import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string");

		String s = scan.nextLine();
		
		//String rev = reverseString(s);

		System.out.println("Your reversed string is: " + reverseString(s)); // calls reverseString method in print statement
		
		scan.close();
	}

	public static String reverseString(String s) {

		if (s.isEmpty())
			return s;
		return reverseString(s.substring(1)) + s.charAt(0);

	}

}
