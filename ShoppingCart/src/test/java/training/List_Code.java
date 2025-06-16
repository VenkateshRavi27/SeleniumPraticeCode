package training;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class List_Code {

	public static void main(String[] args) {

		List<String> list = new LinkedList<>();

		list.add("Selenium");

		list.add("Java");

		list.add("Selenium");

		list.add("TestNg");

		System.out.println("Before Result: " + list);

		Set<String> st = new LinkedHashSet<>();

		st.addAll(list);

		System.out.println("After Result: " + st);

	}
}
