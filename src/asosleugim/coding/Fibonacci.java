package asosleugim.coding;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String args[]) {

		// fibonacciOne(args[0]);
		fibonacciTwo(args[0]);

		System.out.println("\nEnter number upto which Fibonacci series to print: ");
		int number1 = new Scanner(System.in).nextInt();
		
		for(int i=1;i<number1;i++){
			System.out.print(	" " +	fibonacci(i));
		}
		}

	static void fibonacciOne(String name) {
		int n = Integer.parseInt(name);

		int f = 0, g = 1;
		System.out.print(f + " ");

		for (int i = 1; i <= n; i++) {
			f = f + g;
			g = f - g;
			System.out.print(f + " ");
		}
	}

	public static int fibonacci(int number1) {



		if (number1 == 1 || number1 == 2) {
			return 1;
		}
		return fibonacci(number1 - 1) + fibonacci(number1 - 2);
	}

	static void fibonacciTwo(String name) {

		int n1 = 0, n2 = 1, n3;

		int number = Integer.parseInt(name);

		System.out.print(n1 + " " + n2);

		for (int i = 1; i < number; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
		}

	}

}