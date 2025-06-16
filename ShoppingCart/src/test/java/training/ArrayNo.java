package training;

import java.util.HashSet;
import java.util.Set;

public class ArrayNo {

	public static void main(String[] args) {

		int[] numbers = { 4, 7, 2, 9, 4, 7 };

		Set<Integer> st = new HashSet<>();

		for (int num : numbers) {
			st.add(num); // removes duplicates
		}

		int sum = 0;

		for (int unique : st) {

			sum = sum + unique;

		}

		System.out.println("Unique numbers: " + st);
		System.out.println("Sum of unique numbers: " + sum);

	}
}
