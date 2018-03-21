package com.cisc181.core;

public class PersonException extends Exception{
	private Person Person;
	
	public PersonException(Person Person) {
		this.Person = Person;
	}

	public Person getPerson() {
		return Person;
	}

	public void setPerson(Person person) {
		Person = person;
	}
	

}
