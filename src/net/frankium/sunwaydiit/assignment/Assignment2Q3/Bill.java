package net.frankium.sunwaydiit.assignment.Assignment2Q3;

import java.util.ArrayList;
import java.util.List;

public class Bill {
	String pID;
	List<Double> bills;
	public Bill(String pID, ArrayList<Double> bills){
		this.setBills(bills);
		this.setPID(pID);
	}
	
	public void addBill(double fee){ this.bills.add(fee); }
	
	//setters and getters
	public void setBills(List<Double> bills) { this.bills = bills; }
	public void setPID(String pID) { this.pID = pID; }
	public List<Double> getBills() { return bills; }
	public String getPID() { return pID; }
}
