public class CardTester
{
	public static void main (String[]args)
	{
		Card c1 = new Card();
		Card c2 = new Card();
		Card c3 = new Card();
		Card c4 = new Card();
		Card c5 = new Card(13,3);
		Card c6 = new Card(1,4);
		Card c7 = new Card(10,3);
		Card c8 = new Card(7,4);
		Card c9 = new Card (7,4);
		Card c10 = new Card (7, 3);
		Card c11 = new Card (1,3);
		final String BORDER = "\n***************************************\n";
		
		System.out.println(BORDER);
		System.out.println("Displaying my current cards:");
		System.out.println(c1);
		System.out.println(c2);	
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);	
		System.out.println(c7);
		System.out.println(c8);
		System.out.println(c9);
		System.out.println(c10);
		System.out.println(c11);
		System.out.println(BORDER);
		
		System.out.println(BORDER);
		System.out.println("Test isHigherThan Ace High Default");
		System.out.println( c1 + " isHigherThan " + c2 + " " + c1.isHigherThan(c2));
		System.out.println( c2 + " isHigherThan " + c1 +  " " + c2.isHigherThan(c1));
		System.out.println(c5 + " isHigherThan " +  c6 + " " + c5.isHigherThan(c6));
		System.out.println( c6+ " isHigherThan " + c5 +  " " +c6.isHigherThan(c5));
		System.out.println(c11 + " isHigherThan " + c6 +  " " +c11.isHigherThan(c6));
		System.out.println(c6 + " isHigherThan " + c11 +  " " +c6.isHigherThan(c11));
		System.out.println(BORDER);
		
		
		System.out.println(BORDER);
		System.out.println("Test isHigherThan Ace High passed as true");
		System.out.println( c1 + " isHigherThan " + c2 + " " + c1.isHigherThan(c2, true));
		System.out.println( c2 + " isHigherThan " + c1 +  " " + c2.isHigherThan(c1, true));
		System.out.println(c5 + " isHigherThan " +  c6 + " " + c5.isHigherThan(c6, true));
		System.out.println( c6+ " isHigherThan " + c5 +  " " +c6.isHigherThan(c5, true));
		System.out.println(c11 + " isHigherThan " + c6 +  " " +c11.isHigherThan(c6));
		System.out.println(c6 + " isHigherThan " + c11 +  " " +c6.isHigherThan(c11));
		System.out.println(BORDER);
		
		
		System.out.println(BORDER);
		System.out.println("Test isHigherThan Ace High passed as Ace high is false");
		System.out.println( c1 + " isHigherThan " + c2 + " " + c1.isHigherThan(c2, false));
		System.out.println( c2 + " isHigherThan " + c1 +  " " + c2.isHigherThan(c1, false));
		System.out.println(c5 + " isHigherThan " +  c6 + " " + c5.isHigherThan(c6, false));
		System.out.println( c6+ " isHigherThan " + c5 +  " " +c6.isHigherThan(c5, false));
		System.out.println("\nChecking same face value with false\n ");
		System.out.println( c8 + " isHigherThan " + c9 + " " + c8.isHigherThan(c9, false));
		System.out.println( c9 + " isHigherThan " + c8 +  " " + c9.isHigherThan(c8, false));
		System.out.println(c9 + " isHigherThan " +  c10 + " " + c9.isHigherThan(c10, false));
		System.out.println( c10+ " isHigherThan " + c9 +  " " +c10.isHigherThan(c9, false));		
		System.out.println(BORDER);
		
	}
}