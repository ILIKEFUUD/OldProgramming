//Rahul Shah
//4/25/14
//Date.java
//this class allows the user to create a date object
public class Date {
	
	//instance variables
	private int day, month, year;
	private String date;
	private int inDays = (year * 365) + (31-month) + day;
	
	//constructor
	
	//no parameters, set default date to 1/1/2012;
	public Date(){
		day = 1;
		month = 1;
		year = 2012;
		
	}
	//pre: revieves valid month day and year 
	//post: month is set to m, day is set to d, year is set to y
	public Date(int m, int d, int y){
		day = d;
		month = m;
		year = y;
	}
	
	//accessor methods
	
	//pre: none
	//post: returns the month for this date
	public int getMonth(){
		return month;
	}
	
	//pre: none
	//post: returns the day for this date
	public int getDay(){
		return day;
	}
	
	//pre: none
	//post: returns the day for this year
	public int getYear(){
		return year;
	}
	
	//override toString
	//precondition: none
	//post: returns date in as a String in the format
	//format month/day/year
	public String toString(){
		return date = month + "/" + day + "/" + year;
	}
	
	//modifiers
	
	//pre: a valid day, month, and year value
	//post: CHANGES the date to the assigned value
	public Date changeDate(int d, int m, int y){
		day = d;
		month = m;
		year = y;
		Date changedDate = new Date (day, month, year);
		return changedDate;
	}
	

}//end of Date
