package com.db.sample.exampleApp;

public class Customer {
	
	private String name;

	public Customer() {
		String name="Name";
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void getName() {
		System.out.println(name);
	}

}
