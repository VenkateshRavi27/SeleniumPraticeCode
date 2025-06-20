package training;

public class Fibbo {

	public static void main(String[] args) {

		int n = 10;

		int a = 0;

		int b = 1;

		System.out.println("Fibbonici series up to " + n + " terms");

		for (int i = 1; i <= n; i++) {

			System.out.print(a + " ");

			int next = a + b;

			a = b;

			b = next;

		}

	}
}