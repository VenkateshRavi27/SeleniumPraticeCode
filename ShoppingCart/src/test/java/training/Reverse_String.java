package training;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {

		/*
		 * String name = "Venkatesh";
		 * 
		 * String revName ="";
		 * 
		 * for(int i=name.length()-1; i>=0; i--) {
		 * 
		 * revName += name.charAt(i);
		 * 
		 * }
		 * 
		 * System.out.println(revName);
		 */

		/*
		 * int totalNumber = 10;
		 * 
		 * while (totalNumber > 0) {
		 * 
		 * if (totalNumber % 2 == 0) {
		 * 
		 * System.out.println("Counting coins : " + totalNumber); }
		 * 
		 * totalNumber--;
		 * 
		 * }
		 */

		String correctPassword = "admin123";
		Scanner sc = new Scanner(System.in);
		String enteredPassword = "";

		while (!enteredPassword.equals(correctPassword)) {
			System.out.print("Enter password: ");
			enteredPassword = sc.nextLine();

			if (enteredPassword.equals(correctPassword)) {
				System.out.println("✅ Your password is correct!");
			} else {
				System.out.println("❌ Wrong password. Try again!");
			}
		}

		sc.close();

	}
}
