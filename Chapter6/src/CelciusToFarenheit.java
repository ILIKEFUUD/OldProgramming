import java.text.DecimalFormat;
/*
 * Rahul Shah
 * PD2
 * 1/27/14
 * Converts celcius to farenheit and rounded to the first decimal place
 */
public class CelciusToFarenheit {

	
	public static void main(String[] args) {
		
		//variables
		DecimalFormat fmt = new DecimalFormat(".0");
		double celcius;
		
		//output and processing
		System.out.println("CELCIUS\t\tFARENHEIT");
		for(int x = 0; x <= 100; x++){
			celcius = 1.8 * x + 32;
			System.out.println(x + "\t\t" + fmt.format(celcius));
		}

	}//end of main

}//end of CelciustoFarenheit
