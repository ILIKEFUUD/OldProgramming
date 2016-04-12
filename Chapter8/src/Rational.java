//Class to represent a rational number
//any number that can be represented as a fraction
//term comes from ratio
public class Rational {
	
	//instance variables
	private int myNum;
	private int myDenom;
	
	//constructors
	
	//default
	//sets this rational to 1/1
	public Rational(){
		myNum = 1;
		myDenom = 1;
		
	}
	
	
	//sets this rational number to n/d
	public Rational (int n, int d){
		myNum = n;
		myDenom = d;
		reduce();
	}
	
	//accessors
	
	//returns this numerator
	public int getNumerator (){
		return myNum;
	}
	
	//returns this denominator
	public int getDenominator(){
		return myDenom;
	}
	
	//overrides toString
	public String toString(){
		String s = myNum + "/" + myDenom;
		return s;
	}
	
	//arithmetic operations
	
	//preconditions: r has been instantiated and is not null
	//postconditions: returns a new rational number
	//which is set to this rational number plus r
	//leaves this rational number and r unchanged
	
	public Rational add (Rational r){
		int newDenom = this.myDenom * r.myDenom;
		int newNum = (this.myNum * r.myDenom) + (r.myNum * this.myDenom);
		Rational newRat = new Rational (newNum, newDenom);
		return newRat;
	}
	
	//preconditions: r has been instantiated and is not null
	//postconditions: returns a new rational number minus r
	//leaves this rational number and r unchanged.
	public Rational subtract (Rational r){
		int newDenom = this.myDenom * r.myDenom;
		int newNum = (this.myNum * r.myDenom) - (r.myNum * this.myDenom);
		Rational newRat = new Rational (newNum, newDenom);
		return newRat;
	}
	
	//preconditions: r has been instantiated and is not null
	//postconditions: returns a new rational number 
	//leaves this rational number and r unchanged.
	public Rational multiply (Rational r){
		Rational newRat = new Rational(this.myNum * r.myNum, this.myDenom * r.myDenom);
		return newRat;
	}
	
	//preconditions: r has been instantiated and is not null
	//postconditions: returns a new rational number 
	//leaves this rational number and r unchanged.
	public Rational divide (Rational r){
		Rational newRat = new Rational(this.myNum * r.myDenom, this.myDenom * r.myNum);
		return newRat;
	}
	
	
	//override equals method
	//preconditions: Receives a rational number object as an argument
	//postconditions: returns true if this rational number is equal to obj
	public boolean equals (Object obj){
		Rational objRat = (Rational)obj;
		return (this.myNum == objRat.myNum && this.myDenom == objRat.myDenom);
	}
	
	//ensure rational number is in lowest terms
	//should be called from the constructor
	//preconditions: none
	//postconditions: returns a new rational number 
	//leaves this rational number and r unchanged.
	public void reduce (){
		//algorithm to reduce
		int gcd = findGCD();
		myNum = myNum / gcd;
		myDenom = myDenom / gcd;
	}
	
	//private helper method to be called from reduce
	//find the common divisor
	private int findGCD (){
		int larger, smaller;
		//the following is an algorithm to find gcd
		if (myNum > myDenom){
			larger = myNum;
			smaller = myDenom;
		}
		else{
			larger = myDenom;
			smaller = myNum;
		}
		
		int trialGCD = smaller;
		boolean gcdFound = false;
		while (gcdFound != true){
			if (larger%trialGCD == 0 && smaller%trialGCD == 0){
				gcdFound = true;
			}
			else
				trialGCD = trialGCD - 1;
				
		}//end of while loop
		return trialGCD;
			
	}//end of GCD

}//end of Rational
