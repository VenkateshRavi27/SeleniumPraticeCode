package training;

import java.util.HashSet;
import java.util.Set;

public class List_Code {

	public static void main(String[] args) {

		String[] courses = { "Selenium", "Java", "Selenium", "TestNG", "Cucumber" };

		Set<String> st = new HashSet<String>();

		for (String course : courses) {
			st.add(course); // Remove Duplicates
		}

		System.out.println("Removed Duplicate: " + st);

	}
}
