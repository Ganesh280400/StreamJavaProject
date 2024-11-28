package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighSalEachDep {

	public static void main(String[] args) {
		List<Emp> empobj = Arrays.asList(new Emp(1, "gani", "it", 6000L), new Emp(2, "bujji", "admin", 9000L),
				new Emp(3, "chinna", "hr", 5000L), new Emp(4, "jaanu", "it", 1000L),
				new Emp(1, "govind", "admin", 7000L), new Emp(1, "ramya", "hr", 3000L));

		
		//second highest salary from each department
	Map<String,Optional<Emp>> secHighDepSal	=empobj.stream().collect(Collectors.groupingBy(Emp::getDep, 
				Collectors.collectingAndThen(Collectors.toList(),
				list -> list.stream().sorted(
				Comparator.comparingLong(Emp::getSal).reversed()).skip(1).findFirst()
		)));

	secHighDepSal.forEach((dep,emp)->System.out.println(dep+"::"+emp.get().getName()+":"+emp.get().getSal()));
	}

}
