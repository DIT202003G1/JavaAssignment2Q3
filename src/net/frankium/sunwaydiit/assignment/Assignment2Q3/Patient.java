package net.frankium.sunwaydiit.assignment.Assignment2Q3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Patient extends Person {
	String id;
	int age;
	Date dob, admittedDate, dischargedDate;
	Doctor physician;
	
	public Patient(String firstName, String lastName, String ID, Date DOB, Date admittedDate, Date dischargedDate) {
		super(firstName, lastName);
		setId(ID);
		setDob(DOB);
		setAdmittedDate(admittedDate);
		setDischargedDate(dischargedDate);
	}
	
	//setters getters
	public void setPhysician(Doctor physician){ this.physician = physician; }
	public void setId(String id){ this.id = id; }
	public void setAdmittedDate(Date admittedDate){ this.admittedDate = admittedDate; }
	public void setDischargedDate(Date dischargedDate){ this.dischargedDate = dischargedDate; }
	public void setDob(Date dob){ this.dob = dob; }
//	public void setAge(int age){ this.age = age; }
	public String getId(){ return id; }
	public Date getAdmittedDate(){ return admittedDate; }
	public Date getDischargedDate(){ return dischargedDate; }
	public Doctor getPhysician(){ return physician; }
	public Date getDob(){ return dob; }
//	public int getAge(){ return this.age; }
}
