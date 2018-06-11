package asosleugim.coding;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number to factor");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();

		int num = Integer.parseInt(str);

		factorial(num);

	}

	static void factorial(int num) {

		int factorial = 1;
		for (int i = num; i >= 1; i--) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}

}
