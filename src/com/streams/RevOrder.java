package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RevOrder {
	public static void main(String[] args) {
		
	
	
	List<String> ls=Arrays.asList("gani","mani","saikiran","saikumar","chaitanya");
	
	List<Emp> empobj=Arrays.asList(new Emp(1, "gani", "it", 6000L),new Emp(2, "bujji", "admin", 9000L),
			new Emp(3, "chinna", "hr", 5000L),new Emp(4, "jaanu", "it", 1000L),
			new Emp(1, "govind", "admin", 7000L),new Emp(1, "ramya", "hr", 3000L));
	
	//reversed order based upon name		
	ls.stream().sorted(Comparator.reverseOrder()).forEach(e->System.out.println(e));
	
	//reversed order based names of emp object
	empobj.stream().sorted(Comparator.comparing(Emp::getName).
			reversed()).forEach(e->System.out.println(e.getName()+"::"+e.getSal()));
	
	//reversed order based upon emp salary
	empobj.stream().sorted(Comparator.comparingLong(Emp::getSal).reversed()).
	forEach(e->System.out.println(e.getName()+"::"+e.getSal()));
	}
}
