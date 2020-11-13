package net.frankium.sunwaydiit.assignment.Assignment2Q3;


import java.text.DecimalFormat;
import java.text.MessageFormat;

public class Bill {
	DecimalFormat DF = new DecimalFormat("#.##");
	private String ID;
    private double pharmacyCharges, roomRent, doctorFee;
	public Bill(String ID,double pharmacyCharges,double roomRent,double doctorFee){
		this.setID(ID);
		this.setPharmacyCharges(pharmacyCharges);
		this.setRoomRent(roomRent);
		this.setDoctorFee(doctorFee);
	}
	
	public String toString() {
		return String.format("%s%.2f%n%s%.2f%n%s%.2f%n%s %n%s%.2f%n",
                             "Pharmacy Charges: $", pharmacyCharges,
                             "Room Charges:     $", roomRent,
                             "Doctor's Fees:    $", doctorFee,
                             "______________________________ ",
                             "Total Charges:    $",
				             getTotalPrice());
	}
	
	//Add Fees
	public void addPharmacyCharges(double fee){ pharmacyCharges += fee; }
	public void addDoctorFee(double fee){ doctorFee += fee; }
	public void addRoomRent(double fee){ roomRent += fee; }
	
	//setters and getters
	public void setPharmacyCharges(double pharmacyCharges) { this.pharmacyCharges = pharmacyCharges; }
	public void setDoctorFee(double doctorFee) { this.doctorFee = doctorFee; }
	public void setRoomRent(double roomRent) {this.roomRent = roomRent; }
	public void setID(String ID) { this.ID = ID; }
	public String getID() { return ID; }
	public double getDoctorFee() { return doctorFee; }
	public double getPharmacyCharges() { return pharmacyCharges; }
	public double getRoomRent() { return roomRent; }
	public double getTotalPrice(){return pharmacyCharges+doctorFee+roomRent;}
}