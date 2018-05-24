package inclass;

public class date {

	
	//construct
	date(int month, int day, int year){
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	
	
	//properties
	private int month;
	private int day;
	private int year;
	
	
	//Getters and Setters
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	//to string
	@Override
	public String toString() {
		return "date [month=" + month + ", day=" + day + ", year=" + year + "]";
	}
	
	
	
	//display
	public String displayDate() {
		return "Date: " + month + "/" + day + "/" + year;
		
	}
	
	
	
}
