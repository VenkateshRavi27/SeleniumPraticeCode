package training;

import java.util.Arrays;

public class Highest_and_second_highest_number {

	public static void main(String[] args) {

		int[] num = {10, 45, 22, 89, 86, 33, 32};

		Arrays.sort(num);
		
		int firstMax = num[num.length -1];
		
		int secondMax = num[num.length -2];
		
		System.out.println("First Max No : " +firstMax);
		
		System.out.println("Second Max No : " +secondMax);

	}

}
