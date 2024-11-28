package com.streams;

public class Emp {

	int id;
	String name;
	String dep;
	Long sal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public Long getSal() {
		return sal;
	}

	public void setSal(Long sal) {
		this.sal = sal;
	}

	public Emp(int id, String name, String dep, Long sal) {
		super(); 
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.sal = sal;
	}

}
