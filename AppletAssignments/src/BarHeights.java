/*Rahul Shah
 * PD2
 * 3/10/14
 * paints bars of varying heights, tracking the tallest and shortest
 * bars, which are redrawn in color at the end
 */
import java.applet.Applet;
import java.awt.*;

public class BarHeights extends Applet {

	public void init() {
		setSize(320, 300);
		setBackground(Color.BLACK);
	}

	public void paint (Graphics p){
		
		//constants
		final int NUM_BARS = 7, WIDTH = 35, MAX_HEIGHT = 300, GAP = 10;

		//variables
		int tallX = 0, tallest = 0, shortX =0, shortest = MAX_HEIGHT;
       	int x = GAP, height, y, shortHeight, tallHeight;
		
		
		//you add the following code according to the comments...
		
		//set background color to black
       	//done
		
		//set the drawing color to CYAN for the bars
       	p.setColor(Color.CYAN);
				
		//use a loop to draw NUM_BARS bars with random heights
	    
       	for (int counter = 0; counter < 7; counter++){
       		
       		//generate a random height from 1 to MAX_HEIGHT
       		 height = (int) (Math.random() * MAX_HEIGHT + 1);
       		 
       		 //draw the current bar
       		 p.fillRect(x, MAX_HEIGHT - height, WIDTH, height);
       		 
       		if (height > tallest){
       		//keep track of tallest bar so it can be redrawn later
	    		// tallX is the x value of the tallest bar
	    		// tallest should be the height of the tallest bar
       			tallest = height;
       			tallX = x;
       			tallHeight = MAX_HEIGHT - height;
       		}
       		if (height < shortest){
       		//keep track of shortest so it can be redrawn later
           		// shortX is the x value of the shortest bar
           		// shortest should be the height of the shortest bar
       			shortest = height;
       			shortX = x;
       			shortHeight = MAX_HEIGHT - height;
       			
       		}
       			
       		x = WIDTH + GAP + x;
       		 
       	}
	    		
	    	    	
	    //redraw the shortest bar in red
       	p.setColor(Color.RED);
       	p.fillRect(shortX, MAX_HEIGHT - shortest, WIDTH, shortest);
	    
	   //redraw the tallest in yellow
       	p.setColor(Color.YELLOW);
       	p.fillRect(tallX, MAX_HEIGHT - tallest, WIDTH, tallest);
	
	}
}
