package training;

public class Highest_and_second_highest_number {

	public static void main(String[] args) {

		int[] num = {10, 45, 22, 89, 86, 33, 32};

		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int n : num) {
		    if (n > firstMax) {
		        secondMax = firstMax;
		        firstMax = n;
		    } else if (n > secondMax && n < firstMax) {
		        secondMax = n;
		    }
		}

		System.out.println("Highest number: " + firstMax);
		System.out.println("Second highest number: " + secondMax);

	}

}
