
public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "fish";
		String s2 = "cat";
		doSomething(s1,s2);
		System.out.println(s1);
		System.out.println(s2);
		
	}
	public static void doSomething(String s1, String s2){
		String s3 = s1;
		s1 = s2;
		s2 = s3;
	}
	
	Die d = new Die();
	Die d2 = new Die();
	
	
	

}
