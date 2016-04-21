
public class WarmUpTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pile p1 = new Pile (32);
		Pile p2 = new Pile (100);

		System.out.println(p1);
		System.out.println(p2);
		p1.remove(2);
		p2.remove (2);
		System.out.println(p1);
		System.out.println(p2);
		p1=p2;
		p1.remove(2);
		p2.remove (2);
		System.out.println(p1);
		System.out.println(p2);


	}

}
