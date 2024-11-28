package com.streams;

import java.util.Arrays;
import java.util.List;

public class CountElements {

	public static void main(String[] args) {

		List<Emp> empobj = Arrays.asList(new Emp(1, "gani", "it", 6000L), new Emp(2, "bujji", "admin", 9000L),
				new Emp(3, "chinna", "hr", 5000L), new Emp(4, "jaanu", "it", 1000L),
				new Emp(1, "govind", "admin", 7000L), new Emp(1, "ramya", "hr", 3000L));
		
		List<String> ls=Arrays.asList("gani","mani","saikiran","saikumar","chaitanya");


		//count the list
		System.out.println(empobj.stream().count());
		System.out.println(ls.stream().count());
	}

}
