/*
 * Rahul Shah
 * This class will represent a circle object
 */
public class Circle {

	// instance variables
	private double radius;

	// constructor
	
	public Circle(double r){
		
		radius = r;
		
	}
	
	public Circle(){
		radius = 1;
	}
	
	//accessor
	
	//pre: none
	//post: returns the area of this circle
	public double area (){
		return Math.PI * radius * radius;
	}//end of area
	
	//pre: none
	//post:returns the radius of this circle
	public double getRadius(){
		return radius;
	}
	
	//pre:none
	//post:returns the circumference of this circle
	public double getCircumference(){
		return 2 * Math.PI * radius;
	}
		
		//modifier, allows people to change the state of an object
		
		//pre: none
		//post:changes radius of this circle to r unless r is less than or equal to 0
		public void setRadius(double r) {
			if (r > 0)
				radius = r;
		}
	//overrides toString
	public String toString(){
		return "RADIUS" + radius;
	}
	//overrides equals
	public boolean equals (Object obj){
		Circle circ = (Circle) obj;
		return(circ.radius == this.radius);
	}
	

}// end of Circle
