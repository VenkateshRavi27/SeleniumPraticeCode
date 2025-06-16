package training;

public class Extract_No {

	public static void main(String[] args) {

		String text = "The total price is ₹1,509";

		String ExtractNo = text.replaceAll("[^0-9]", "");

		System.out.println("Extracted No : " + ExtractNo);

		int sum = 0;

		for (int i = 0; i < ExtractNo.length(); i++) {

			char ct = ExtractNo.charAt(i);

			sum += Character.getNumericValue(ct);

		}
		System.out.println("Addition of extacted no: " + sum);

	}

}
