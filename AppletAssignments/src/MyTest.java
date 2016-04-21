/*
 * Rahul Shah
 * PD2
 * 3/6/14
 * This is an applet for a test
 */
import java.awt.*;
import java.applet.Applet;
public class MyTest extends Applet {
	
	public void init() {
		setSize(300,300);
		setBackground(Color.YELLOW);
	}//end of init
	
	public void paint (Graphics page) {
		
		page.setColor(Color.CYAN);
		page.fillRect(0, 0, 300, 20);
		
		page.setColor(Color.BLACK);
		page.fillOval(110, 110,	80, 80);
		page.setColor(Color.GREEN);
		page.fillRect(110, 140, 80, 20);
		
		page.setColor(Color.BLUE);
		page.fillOval(205, 205, 40, 40);
		page.fillOval(55, 55, 40, 40);
		
		page.setColor(Color.BLACK);
		page.drawString("Rahul Shah", 25, 275);
		
		
		
	}//end of paint

}//end of MyTest
