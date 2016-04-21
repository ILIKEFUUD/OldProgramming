
public class TextFormatter {

	/**
	 * @param args
	 */
	
	
		private String line;
		public TextFormatter(String lineToFormat){
			line = lineToFormat;
		}
		

	
	/*
	 * Finds single instance of str
	 */
	public int findString(String str, int start){
		
		int psn = line.indexOf(str, start);
		
		while(psn != -1){
			String before = "";
			String after = "";
			
			if (psn > 0)
				before = line.substring(psn-1, psn);
			
			if(psn < line.length() - 1)
				after = line.substring(psn+1, psn+2);
			
			if (!str.equals(before) && !str.equals(after)){
				return psn;
			}
			
				psn = line.indexOf(str, psn+1);
			
		}//end of while
		return -1;
		
	}//end of findString
	
	//countStrings
	
	public int countStrings(String str){
		int counter = 0;
		int psn = findString(str, 0);
		if (psn!= -1)
			counter = 1;
		while(psn!= -1 && psn != line.length()-1){
			psn = findString(str, psn+1);
			if (psn != -1){
				counter++;
			}
		}
		
		return counter;
		
	}
	
	//convertItalics
	public String convertItalics(){
		int under = countStrings("_");
		
		if (under%2 == 1){
			return line;
		}
		
		int pos = 0;
		String result = "";
		String tag = "<I>";
		
		while(findString("_", pos) != -1){
			int newPos = findString("_", pos);
			
			result += line.substring(pos, newPos);
			
			result += tag;
			
			if (tag.equals("<I>"))
				tag = "</I>";
			else
				tag = "<I>";
			
			pos = newPos+1;
			
			
		}
		return result += line.substring(pos);
		
		
	}

}
