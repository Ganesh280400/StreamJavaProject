package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighSalEmp {

	public static void main(String[] args) {
		List<Emp> empobj = Arrays.asList(new Emp(1, "gani", "it", 6000L), new Emp(2, "bujji", "admin", 9000L),
				new Emp(3, "chinna", "hr", 5000L), new Emp(4, "jaanu", "it", 1000L),
				new Emp(1, "govind", "admin", 7000L), new Emp(1, "ramya", "hr", 3000L));

		// secong highest salary from employee object
		Optional<Emp> highSecSal = empobj.stream().sorted(Comparator.comparingLong(Emp::getSal).reversed()).skip(1)
				.findFirst();

		System.out.println(highSecSal.get().getName() + "::" + highSecSal.get().getSal());
	}

}
