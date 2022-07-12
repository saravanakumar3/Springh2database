package com.luciddreamerpsk.comon;

public class HelloWorld {
	private String name;
 private String city;
 private int id;



	public void setName(String name) {
		this.name = name;
	}

	/*
	 * public String getCity() { return city; }
	 */

	public void setCity(String city) {
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void printHello() {

		System.out.println("Hello ! " + name);
		System.out.println("city ! " + city);

	}
	
}