
public class TempTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Temperature temp1 = new Temperature (32, "F");
		Temperature temp2 = new Temperature (0, "C");
		Temperature temp3;
		Temperature temp4 = new Temperature (212, "F");
		Temperature temp5 = new Temperature (100, "F");
		
		double d;
		double x = 100;
		
		System.out.println(temp1);
		System.out.println(temp2);
		
		d = temp1.getDegrees();
		System.out.println("Temp1 degrees = " + d);
		
		System.out.println(temp1.getScale());
		
		temp3 = temp2.getFarenheit();
		System.out.println(temp2 + " is equal to " + temp3);
		
		
		System.out.println(temp3 + " in celcius is " + temp3.getCelcius() + " degrees");
		System.out.println(temp4.getCelcius());

		//Temperature temp5 = new Temperature (212, "F");
		System.out.println(temp5);
		System.out.println(temp5.getCelcius());
		System.out.println(temp5);
		temp5.toCelsius();
		System.out.println(temp5);
		
		Temperature temp6 = new Temperature (100, "C");
		temp6.toFarenheit();
		System.out.println(temp6);
		Temperature temp7 = new Temperature (10, "F");
		temp7.raiseTemperature(10.5);
		System.out.println(temp7);
		temp7.decreaseTemperature(10.8);
		System.out.println(temp7);
		
		Date date1 = new Date(4,29,2014);
		System.out.println(date1);
	}//end of main


}//end of TempTester
