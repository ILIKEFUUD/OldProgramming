
public class RationalTester {

	
	public static void main(String[] args) {
		
		Rational rat1 = new Rational (4,8);
		System.out.println(rat1.getNumerator());
		System.out.println(rat1.getDenominator());
		Rational rat2 = new Rational (1,2);
		
		System.out.println(rat1.add(rat2));
		//System.out.println(rat1.subtract(rat2));
		System.out.println(rat1.multiply(rat2));
		System.out.println(rat1.divide(rat2));
		System.out.println(rat1.equals(rat2));
		
		System.out.println(rat1);
		System.out.println();
	}

}
