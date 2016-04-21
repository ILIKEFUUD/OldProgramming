import java.applet.Applet;
import java.awt.*;

/*
 * Rahul Shah
 */
public class Boxes extends Applet{
	
	public void init(){
		
		setSize(400,400);
		setBackground(Color.BLACK);
		
	}//end of init
	
	public void paint (Graphics page){
		
		//constants
		final int NUM_BOXES = 50, THICKNESS = 15, MAX_SIDE = 75;
		final int MAX_X = 375, MAX_Y = 350;
		
		int x, y, width, height;
		page.setColor(Color.ORANGE);
		//draw random rectangles
		for (int c = 0; c < NUM_BOXES; c++){
			
			//random positions
			x = (int) (Math.random() * MAX_X + 1);
			y = (int) (Math.random() * MAX_Y + 1);
			
			//random side lengths
			width = (int) (Math.random() *  MAX_SIDE + 1);
			height = (int) (Math.random() *  MAX_SIDE + 1);
			
			if (THICKNESS >= width){
				page.setColor(Color.ORANGE);
				page.fillRect(x, y, width, height);
			}else if (THICKNESS >= height){
				page.setColor(Color.PINK);
				page.fillRect(x, y, width, height);
			}else{
				page.setColor(Color.CYAN);
				page.drawRect(x, y, width, height);
			}
			
		}//end of loop to draw boxes
		
	}//end of paint

}//end of boxes
