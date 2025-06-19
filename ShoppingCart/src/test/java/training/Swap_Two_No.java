package training;

public class Swap_Two_No {

	public static void main(String[] args) {

		int a = 50;
		int b = 60;

		System.out.println("Before swapping: a=" + a + " & b=" + b);

		a = a + b; // a= 50+60 => 110
		b = a - b; // b = 110-60=> 50
		a = a - b; // a = 110 - 50 - 60

		System.out.println("After swapping: a=" + a + " & b=" + b);

	}

}
