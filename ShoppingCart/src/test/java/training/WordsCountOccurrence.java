package training;

import java.util.HashMap;
import java.util.Map;

public class WordsCountOccurrence {

	public static void main(String[] args) {

		String sentences = "I am a software tester. I am working at Infosys from last year ";
		
		sentences = sentences.replace(".", "").toLowerCase();
		
		String[] words = sentences.split(" ");
		 
		Map<String, Integer> wordsCount = new HashMap<>();
		
		for (String word : words) {
			
			wordsCount.put(word, wordsCount.getOrDefault(word, 0) + 1);
			
		}
		System.out.println(wordsCount);
	}

}
