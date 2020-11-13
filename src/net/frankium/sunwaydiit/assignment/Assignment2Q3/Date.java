package net.frankium.sunwaydiit.assignment.Assignment2Q3;

public class Date {
	private int year,month,day;
	private static final int[] DAY_OF_MONTHS = {31,28,31,30,31,30,31,31,30,31,30,31};
	public Date(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public void setDate(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public String toString() {
		return + year + "-" + month + "-" + day ;
	}
	public int getDay() { return day; }
	public int getMonth() { return month; }
	public int getYear() { return year; }
	public int getDayOfYear(){
		int days = 0;
		for (int i = 0; i < this.getMonth() ; i++) days += DAY_OF_MONTHS[i];
		return days + this.getMonth();
	}
}
