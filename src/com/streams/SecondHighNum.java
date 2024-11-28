package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighNum {

	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(25, 32, 89, 25, 64, 63, 143, 7, 43);

		// second highest number in list
		System.out.println(ls.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst());

	}

}
