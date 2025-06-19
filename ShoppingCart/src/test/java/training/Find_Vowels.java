package training;

public class Find_Vowels {

	public static void main(String[] args) {

		String text = "AEIOU";

		for (int i = 0; i < text.length(); i++) {

			char ct = text.toLowerCase().charAt(i);

			if (ct == 'a' || ct == 'e' || ct == 'i' || ct == 'o' || ct == 'u') {
				
				System.out.println("Vowel word is : " + ct);
				
			}
		}

		
	}

}
