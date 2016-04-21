/*
 * Rahul Shah
 * PD2
 * 3/11/14
 * 
 */
import java.applet.Applet;
import java.awt.*;
public class Stairs extends Applet {
	
	public void init() {
		
		setSize(300,300);
		setBackground(Color.BLACK);
	}
	public void paint (Graphics page){
		
		page.setColor(Color.ORANGE);
		int x = 0, y = 299;
		for (int i = 0; i < 10; i++){
			
			page.drawLine(x, y, x, y - 30);
			page.drawLine(x, y - 30, x + 30, y - 30);
			
			x+=30;
			y-=30;
			
			
		}//end of for loop
	}//end of paint

}//end of Stairs
