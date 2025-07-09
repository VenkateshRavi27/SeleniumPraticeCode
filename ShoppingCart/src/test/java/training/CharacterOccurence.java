package training;

public class CharacterOccurence {

	public static void main(String[] args) {

		String text = "Venkatesh";

		char target = 'e';

		int count = 0;

		for (char c : text.toCharArray()) {

			if (c == target)

				count++;
		}
		System.out.println("Count is : " + count);

	}

}
