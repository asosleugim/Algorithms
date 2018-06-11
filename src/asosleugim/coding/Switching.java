package asosleugim.coding;

public class Switching {

	static public void main(String args[]) {

		int a = 3;
		int b = 9;

		a = a + b;
		System.out.println(a);
		b = a - b;
		System.out.println(b);
		a = a - b;
		System.out.println(a);

		System.out.println("a=" + a + " b=" + b);

	}

}