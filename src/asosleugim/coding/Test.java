package asosleugim.coding;

public class Test {

	static int balance = 0;

	public static int test(int[] credit, int[] checks, int currentbalance) {

		balance = currentbalance;

		for (int i = 0; i < credit.length; i++) {
			currentbalance += credit[i];
		}

		for (int j = 0; j < checks.length; j++) {
			currentbalance += checks[j];
		}

		return balance;
	}

	static public void main(String args[]) {

		int[] credit = { 200, 200 };
		int[] checks = { 500, 500 };
		int currentbalance = 5000;
		System.out.println(test(credit, checks, currentbalance) == 5000);
	}

}
