package asosleugim.coding;

import java.util.Scanner;

public class ReverseString {

	public static void main(String args[]) {

		System.out.println("Please enter a string to reverse");
		Scanner input = new Scanner(System.in);
		String read = input.nextLine();
		StringBuffer buffer2 = new StringBuffer(read).reverse();
		System.out.println("\nThe Reverse Strings Buffer\n" + buffer2);
		String reverse = "";

		for (int i = read.length() - 1; i >= 0; i--) {

			reverse = reverse + read.charAt(i);

		}

		System.out.println(reverse);
		System.out.println("String " + read);
		StringBuffer buffer = new StringBuffer(read);
		buffer.reverse();
		System.out.println("Reverse with String buffer: " + buffer);

	}
}