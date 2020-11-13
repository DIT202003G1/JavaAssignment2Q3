package net.frankium.sunwaydiit.assignment.Assignment2Q3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Patient extends Person {
	private String id;
	private Date DOB, admittedDate, dischargedDate;
	private Doctor physician;
	public Patient(String firstName, String lastName,Date DOB ,String ID, Date admittedDate, Date dischargedDate, Doctor physician) {
		super(firstName, lastName);
		setPhysician(physician);
		setId(ID);
		setDOB(DOB);
		setAdmittedDate(admittedDate);
		setDischargedDate(dischargedDate);
	}
	
	public String toString(){
        return "Patient: " + super.toString() + "\n"
               + "Attending Physician: " + physician.toString()
               + "\n" + "Admit Date: " + admittedDate.toString()
               + "\n" + "Discharge Date: " +  dischargedDate.toString()
               + "\n";
    }
	
	//setters getters
	public void setPhysician(Doctor physician){ this.physician = physician; }
	public void setId(String id){ this.id = id; }
	public void setAdmittedDate(Date admittedDate){ this.admittedDate = admittedDate; }
	public void setDischargedDate(Date dischargedDate){ this.dischargedDate = dischargedDate; }
	public void setDOB(Date DOB) { this.DOB = DOB; }
	public String getId(){ return id; }
	public Date getAdmittedDate(){ return admittedDate; }
	public Date getDischargedDate(){ return dischargedDate; }
	public Doctor getPhysician(){ return physician; }
	public Date getDOB() { return DOB; }
	
	//Derived Attributes
	public int getAge(){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	    LocalDateTime now = LocalDateTime.now();
	    int y = now.getYear();
	    int d = now.getDayOfYear();
	    int ageYear = y - this.DOB.getYear();
	    if (d<this.DOB.getDayOfYear()){
	        ageYear --;
	    }
	    return ageYear;
	}
}
