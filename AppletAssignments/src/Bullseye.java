/*
 * Rahul Shah
 * PD2
 * 3/7/14
 * 
 */
import java.applet.Applet;
import java.awt.*;
public class Bullseye extends Applet{
	public void init (){
		setSize(300,300);
		setBackground(Color.CYAN);
	}//end of init
	
	public void paint (Graphics page){
		//constants
		final int MAX_WIDTH = 300, NUM_RINGS = 5, RING_WIDTH = 25;
		
		//variables
		int  x = 0, y = 0, diameter = MAX_WIDTH;
		
		page.setColor(Color.WHITE);
		
		for (int counter = 0; counter < NUM_RINGS; counter++){
			//loop to alternate between white and black
			if (page.getColor() == Color.WHITE)
				page.setColor(Color.BLACK);
			else
				page.setColor(Color.WHITE);
			page.fillOval(x, y, diameter, diameter);
			diameter = diameter - 2 * RING_WIDTH;
			x = x + RING_WIDTH;
			y = y + RING_WIDTH;
			
		}//end of loop to draw rings
		
		//draw center of bullseye
		
		page.setColor(Color.RED);
		page.fillOval(x, y, diameter, diameter);
		
	}//end of paint

}//end of Bullseye
