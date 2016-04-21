/*
 * Rahul Shah
 * PD2
 * 3/12/14
 * Circles
 */
import java.applet.Applet;
import java.awt.*;
public class Circles extends Applet{
	public void init(){
		setSize(500,500);
		
	}//end of init
	public void paint (Graphics page){
		
		//constants
		final int NUM_CIRCLES = 100, MAX_WIDTH = 75, MIN_WIDTH = 5;
		
		//draw circles
		for (int c = 0; c < NUM_CIRCLES; c++){
			int red = (int) (Math.random() * 255); 
			int green = (int) (Math.random() * 255); 
			int blue = (int) (Math.random() * 255);
			Color color = new Color (red, green, blue);
			int width = (int) (Math.random() * MAX_WIDTH + MIN_WIDTH);
			int height = width;
			int x = (int) (Math.random() * (500 - width) + 1);
			int y = (int) (Math.random() * (500 - height) + 1);
			
			//fill or empty
			if (width < 25){
				page.setColor(color);
				page.fillOval(x, y, width, height);
			}else{
				page.setColor(color);
				page.drawOval(x, y, width, height);
			}
			 
		}//end of the loop
		
	}//end of paint

}//end of Circles
