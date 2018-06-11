package asosleugim.coding;

public class Prime {

	public static void main(String[] args) {

		// Prime numbers
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= i; j++) {
				if (i == j) {
					System.out.println(i + " is a Prime\n");
				}
				if (i % j  == 0) {
					break;
				}
			}
		}

	}

}
