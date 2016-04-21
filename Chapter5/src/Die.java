public class Die implements Comparable{
	
	//constants
	public final int MIN_FACES = 4;
	
	//variables
	private int sides;
	private int faceVal;
	
	//constructor
	
	public Die (){
		sides = 6;
		faceVal = 1;
	}
	public Die (int n){
		if (n >= MIN_FACES)
			sides = n;
		else
			sides = MIN_FACES;
		
		faceVal = 1;
		
		
		
	}
	
	//modifier
	public void roll(){
		faceVal = (int)(Math.random() * sides + 1);
	}
	
	//accessor
	public String toString(){
		return ("" + faceVal);
	}
	//returns the face value
	public int getFaceVal(){
		return faceVal;
	}
	
	public int compareTo(Object obj){
		Die diee = (Die) obj;
		 
		return this.faceVal - diee.faceVal;
	}
	

}//end of Die
