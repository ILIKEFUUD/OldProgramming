/*
 * Rahul Shah
 */
public class FibonacciSeries {

	
	public static void main(String[] args) {
		
		double a = 0, b = 1, c;
		System.out.println("1");
		for (int x = 0; x < 100; x++){
			
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
			
			
		}
		

	}

}
