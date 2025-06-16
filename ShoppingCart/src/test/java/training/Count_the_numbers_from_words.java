package training;

public class Count_the_numbers_from_words {
	
	public static void main(String[] args) {
		
		String name ="  Hello   I am  venkatesh  ";
		
		String[] split = name.trim().split("\\s+");
		
		System.out.println(split.length);
		
	}

}
