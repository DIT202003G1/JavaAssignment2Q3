package net.frankium.sunwaydiit.assignment.Assignment2Q3;

public class Person {
	private String firstName, lastName;
	public Person(String firstName,String lastName){
		this.setFirstName(firstName);
		this.setFirstName(lastName);
	}
	//setters and getters
	public String getFirstName(){ return this.firstName; }
	public String getLastName(){ return this.lastName; }
	public void setFirstName(String firstName){ this.firstName = firstName; }
	public void setLastName(String lastName){ this.lastName = lastName; }
}
