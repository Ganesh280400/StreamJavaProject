package com.streams;

import java.util.Arrays;
import java.util.List;

public class DistinctList {

	public static void main(String[] args) {

		List<String> ls = Arrays.asList("gani", "mani", "nani", "sai", "gani", "sai", "chai");

		// remove the duplicate names from list
		ls.stream().distinct().forEach(e -> System.out.println(e));
	}

}
