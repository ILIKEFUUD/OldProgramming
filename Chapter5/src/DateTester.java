
public class DateTester {

	
	public static void main(String[] args) {
		

		Date d1 = new Date();
		Date d2 = new Date("January", 1, 2000);
		Date d3 = new Date("June", 30, 2018);
		Date d4 = new Date("June", 30, 2024);
		Date d5 = new Date("June", 6, 2018);
		Date d6 = new Date("March", 2, 2015);
		Date d7 = new Date("December", 25, 2014);
		Date d8 = new Date("October", 31, 2014);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		System.out.println(d7);
		System.out.println(d8);
		
		
		System.out.println("Get month with " + d4);
		System.out.println(d4.getMonth());
		
		System.out.println("Get year with " + d4);
		System.out.println(d4.getYear());
		
		System.out.println("Get day with " + d4);
		System.out.println(d4.getDay());
		
		
		System.out.println("\ncompareTo tests...\n");
		System.out.println(d1 + " compareTo " + d2 + "  " + d1.compareTo(d2));
		System.out.println(d3 + " compareTo " + d4 + "  " + d3.compareTo(d4));
		System.out.println(d4 + " compareTo " + d3 + "  " + d4.compareTo(d3));
		System.out.println(d3 + " compareTo " + d5 + "  " + d3.compareTo(d5));
		System.out.println(d5 + " compareTo " + d3 + "  " + d5.compareTo(d3));
		System.out.println(d7 + " compareTo " + d8 + "  " + d7.compareTo(d8));
		System.out.println(d8 + " compareTo " + d7 + "  " + d8.compareTo(d7));
		System.out.println(d3 + " compareTo " + d6 + "  " + d3.compareTo((Object)d6));
		System.out.println(d6 + " compareTo " + d3 + "  " + d6.compareTo((Object)d3));
		
		System.out.println();
		System.out.println("increment year for " + d1);
		d1.incrementYear();
		System.out.println(d1);
		System.out.println();
		System.out.println("set day for " + d1 + " to 21");
		d1.setDay(21);
		System.out.println(d1);
		System.out.println();
		System.out.println("set Month to June for " + d1);
		d1.setMonth("June");
		System.out.println(d1);
		System.out.println();
		System.out.println("set year to 2020 for " + d1);
		d1.setYear(2020);
		System.out.println(d1);
		
		
	}
	

}
