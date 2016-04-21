/*
 * Rahul Shah
 * 12/9/14
 * Pd 6
 * Amberg
 * AP Programming 2
 * Date.java 
 * Creates a date object with a month day and year
 * Can be compared and set and the year can be
 * incremented. The day, month, and year can be
 * returned
 */
public class Date implements Comparable{
	
	//data members
	private String month;
	private int day;
	private int year;
	
	//constructors
	
	//constructor with no parameters
	public Date(){
		month = "January";
		day = 1;
		year = 2000;
	}//end of Date empty constructor
	public Date (String m, int d, int y){
		month = m;
		day = d;
		year = y;
	}//end of user entered Date
	
	//accessors
	
	//precondition: none
	//postcondition: returns value stored in month 
	public String getMonth(){
		return month;
	}//end of getMonth()
	
	//precondition: none
	//postcondition: returns value stored in year 
	public int getYear(){
		return year;
	}//end of getYear
	
	//precondition: none
	//postcondition: returns value stored in day
	public int getDay(){
		return day;
	}//end of getDay
	
	//precondition: none
	//postcondition: returns a string representing the
	//date in mm,dd,yyyy
	
	public String toString(){
		return month + " " + day + ", " + year;
	}//end of toString
	
	//mutators
	//precondition: none
	//postcondition: increments year by 1
	
	public void incrementYear(){
		year++;
	}//end of incrementYear
	
	//precondition: none
	//postcondition: sets the year to yearNumber
	public void setYear(int yearNumber){
		year = yearNumber;
	}//end of setYear
	
	//precondition: dayNumber is a valid number for the month
	//postcondition: sets day to dayNumber
	public void setDay(int dayNumber){
		day = dayNumber;
	}//end ofSetDay
	
	//precondition: monthString is a valid name of a month
	//postcondition: sets month to monthString
	public void setMonth(String monthString){
		month = monthString;
	}//end of setMonth
	
	//precondition: the date is valid
	//postcondition: returns a value when comparing the date
	//uses year, if same uses month, if same uses day
	public int compareTo(Object obj){
		
		Date today = (Date) obj;
		
		if (this.year == today.year){
			if(this.getMonthNumber() == today.getMonthNumber()){
				if (this.day == today.day)
					return 0;
				else
					return this.day - today.day;
					
			}
			else
				return (this.getMonthNumber() + this.day)
				- (today.getMonthNumber() + today.day) * 30;//days;
		}
		else
			return (this.year + this.day +
					this.getMonthNumber()) * 365 * 30 - 
					(today.year + today.day + today.getMonthNumber()) * 365 * 30;
				
		
	}
	
	//precondition: month is a valid name of a month
	//postcondition: returns a number for the corresponding month. 
	//helper for the compareTo method
	private int getMonthNumber(){
		String m = getMonth();
		
		
		if (m.equalsIgnoreCase("January"))
			return 1;
		else if (m.equalsIgnoreCase("February"))
			return 2;
		else if (m.equalsIgnoreCase("March"))
			return 3;
		else if (m.equalsIgnoreCase("April"))
			return 4;
		else if (m.equalsIgnoreCase("May"))
			return 5;
		else if (m.equalsIgnoreCase("June"))
			return 6;
		else if (m.equalsIgnoreCase("July"))
			return 7;
		else if (m.equalsIgnoreCase("August"))
			return 8;
		else if (m.equalsIgnoreCase("September"))
			return 9;
		else if (m.equalsIgnoreCase("October"))
			return 10;
		else if (m.equalsIgnoreCase("November"))
			return 11;
		else if (m.equalsIgnoreCase("December"))
			return 12;
		else
			return 0;
		
	}//end of getMonthNumber
	
	

}//end of Date class
