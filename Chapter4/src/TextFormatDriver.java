
public class TextFormatDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  
	    TextFormatter txt2 = new TextFormatter ("This is _very_ good.");
	    TextFormatter txt3 = new TextFormatter("_This_ is _very_ _good_.");
	    TextFormatter txt4 = new TextFormatter ("This is _very good.");
	    TextFormatter txt5 = new TextFormatter ("This is __very good.");
	    
	    System.out.println(txt2.convertItalics());
	    System.out.println(txt3.convertItalics());
	    System.out.println(txt4.convertItalics());
	    System.out.println(txt5.convertItalics());
	
	    
	}

}
