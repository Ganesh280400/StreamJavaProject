package com.streams;

import java.util.Arrays;
import java.util.List;

public class GetSalgretthan5k {

	public static void main(String[] args) {
		List<Emp> empobj = Arrays.asList(new Emp(1, "gani", "it", 6000L), new Emp(2, "bujji", "admin", 9000L),
				new Emp(3, "chinna", "hr", 5000L), new Emp(4, "jaanu", "it", 1000L),
				new Emp(1, "govind", "admin", 7000L), new Emp(1, "ramya", "hr", 3000L));

		// whose salary greater than or equal to 5000 from the emp object
		empobj.stream().filter(e -> e.getSal() >= 5000)
				.forEach(e -> System.out.println(e.getName() + "::" + e.getSal()));
	}

}
