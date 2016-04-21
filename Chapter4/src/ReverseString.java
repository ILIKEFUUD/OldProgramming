public class ReverseString {
	
	public static void main(String[] args) {

		String str = "pred a si nadnerb";		
		System.out.println(reverse(str));//should display yppah
	}

	public static String reverse (String s){
		// you write the code that goes here
		String container = "";
		for (int x = s.length()-1; x >= 0; x--){
			container += s.substring(x,x+1);
		}
		return container;
	}
}
