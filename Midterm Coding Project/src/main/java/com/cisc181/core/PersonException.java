package com.cisc181.core;

public class PersonException extends Exception {

	private Person Person;

	public PersonException(String arg0, Person Person) {
		super(arg0);
		this.Person = Person;
	}

	public Person getPerson() {
		return Person;
	}
	
	
	
}
