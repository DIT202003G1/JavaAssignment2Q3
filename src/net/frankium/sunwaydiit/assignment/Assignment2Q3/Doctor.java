package net.frankium.sunwaydiit.assignment.Assignment2Q3;

public class Doctor extends Person {
	private String specialty;
	public Doctor(String firstName, String lastName, String specialty) {
		super(firstName, lastName);
		setSpecialty(specialty);
	}
	public String toString(){
		return super.toString() + " - " + specialty;
	}
	//getters and setters
	public String getSpecialty() { return specialty; }
	public void setSpecialty(String specialty) { this.specialty = specialty; }
}
