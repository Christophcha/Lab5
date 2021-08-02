import java.util.Scanner;

public class DivisorCalc {

	public static void main(String[] args) {

		int num1;
		int num2;
		int gcd1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your first number: ");
		num1 = scan.nextInt();
		System.out.println("Please enter your second number: ");
		num2 = scan.nextInt();
		
		//gcd1 = gcd(numberOne,numberTwo);
		
		System.out.println("Your greatest common divisor is " + gcd(num1,num2));
		
		scan.close();
	}

	public static int gcd(int num1, int num2) {

		if (num1 % num2 == 0)
			return num2;

		return gcd(num2, num1 % num2);

	}

}
