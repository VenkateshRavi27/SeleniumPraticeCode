package training;

public class Extract_No_in_given_string {

	public static void main(String[] args) {

		String text = "My order id is S12KJ09";

		String numbersOnly = text.replaceAll("[^0-9]", "");

		System.out.println("Extracted No : " + numbersOnly);

		int sum = 0;

		for (int i = 0; i < numbersOnly.length(); i++) {

			char ct = numbersOnly.charAt(i);

			sum += Character.getNumericValue(ct);

		}

		System.out.println("Added Value is : " + sum);

	}
}
