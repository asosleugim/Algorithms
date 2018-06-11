package asosleugim.coding;

public class EvenNumbers {

	static public void main(String args[]) {

		int num[] = { 1, 2, 3, 5, 5, 7, 8, 9, 28, 25, 30, 10, 50 };

		for (int i = 0; i <= num.length - 1; i++) {
			if ((num[i] % 2) == 0) {
				System.out.println(num[i]);

			}

		}
	}

}
