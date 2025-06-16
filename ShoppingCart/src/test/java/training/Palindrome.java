package training;

public class Palindrome {

	public static void main(String[] args) {

		String name = "Madam";

		String rev = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			rev += name.charAt(i);

		}

		if (rev.equalsIgnoreCase(name)) {

			System.out.println("Palindrome");

		} else {

			System.out.println("It is not palindrome");
		}

	}

}
