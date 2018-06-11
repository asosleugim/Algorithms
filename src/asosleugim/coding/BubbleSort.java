package asosleugim.coding;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	static public void main(String args[]) {

		int[] unsorted = { 32, 39, 21, 45, 23, 3 };
		System.out.println("Unsorted:");
		System.out.println(Arrays.toString(unsorted));

		bubbleSorting(unsorted);

		// Arrays.sort(unsorted);

		System.out.println(Arrays.toString(unsorted));

	}

	static void bubbleSorting(int[] unsorted) {

		for (int i = 0; i <= unsorted.length; i++) {

			for (int j = 1; j <= unsorted.length; j++) {
				if (unsorted[j - 1] > unsorted[j]) {
					int temp = unsorted[j];
					unsorted[j] = unsorted[j - 1];
					unsorted[j - 1] = temp;
				}
				System.out.println(Arrays.toString(unsorted));
			}

		}

	}



}