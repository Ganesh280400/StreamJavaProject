package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NameSorting {

	public static void main(String[] args) {
		List<String> ls = Arrays.asList("gani", "bujji", "chinna", "govind", "jaanu");

		// sorted list(ascending order)
		ls.stream().sorted().forEach(e -> System.out.println(e));

		// reverse order list(descending order)
		ls.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.println(e));

	}

}
