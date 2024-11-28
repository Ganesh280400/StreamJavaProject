package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortingEmpSal {

	public static void main(String[] args) {
	List<Emp> empobj=Arrays.asList(new Emp(1, "gani", "it", 6000L),new Emp(2, "bujji", "admin", 9000L),
			new Emp(3, "chinna", "hr", 5000L),new Emp(4, "jaanu", "it", 1000L),
			new Emp(1, "govind", "admin", 7000L),new Emp(1, "ramya", "hr", 3000L));
	
	
	//sorted order by using emp salary(ascending)
	 Stream<Emp>  sortSal=empobj.stream().sorted(Comparator.comparingLong(Emp::getSal));
	sortSal.forEach(e->System.out.println(e.getName()+"::"+e.getSal()));
	
	
	//sorted reversed order by using salary(descending order)
	Stream<Emp> revSorted=empobj.stream().sorted(Comparator.comparingLong(Emp::getSal).reversed());
	revSorted.forEach(e->System.out.println(e.getName()+"::"+e.getSal()));
	}

}
