//represetns a temperature object that includes
//degrees and scale
public class Temperature {
	
	//instance variables
	private double degrees;
	private String scale;
	
	//constructors
	public Temperature (double degrees, String scale){
		this.degrees = degrees;
		this.scale = scale;
	}//end of constructor
	
	//accessor
	//override toString
	
	//pre: none
	//post: returns this temperature in the format degrees, scale
	//ex: 32 degrees F
	
	public String toString(){
		String s;
		s = degrees + " degrees " + scale;
		return s;
	}
	
	//pre: none
	//post: returns this temperature's degrees
	
	public double getDegrees(){
		return degrees;
	}
	
	//pre:none
	//post: returns this temperature's scale
	public String getScale(){
		return scale;
	}
	
	//pre: this temperature is a valid farenheit temperature.
	//post: returns this Celcius temperature value converted to a farenheit
	public Temperature getFarenheit(){
		double d;
		d = degrees * (9.0/5) + 32;
		Temperature f = new Temperature (d, "F");
		return f;
		
	}
	
	//pre: this temperature is a valid farenheit temperature
	//post: returns a new temperature with this farenheit converted to a celcius temp
	public Temperature getCelcius(){
		double c = (degrees - 32) * (5.0/9);
		Temperature celcius = new Temperature (c, "C");
		return celcius;
	}
	
	//modifiers
	//pre: Temperature is a valid temperature in Farenheit
	//post: converts this temperature to Celcius
	public void toCelsius (){
		double d = (degrees - 32) * (5.0/9);
		degrees = d;
		scale = "C";
	}
	//pre: Temperature is a valid temperature in Celcius
	//post: converts this temperature to Farenheit
	public void toFarenheit(){
		double d = (degrees) * (9.0/5) + 32;
		degrees = d;
		scale = "F";
	}
	
	//pre: Temperature is a valid temperature
	//post: raises the amount by amt
	public void raiseTemperature(double amt){
		degrees = degrees + amt;
		
	}
	//pre: Temperature is a valid temperature
	//post: decrease this temperature by amt
	public void decreaseTemperature (double amt){
		degrees = degrees - amt;
	}

}//end of Temperature
