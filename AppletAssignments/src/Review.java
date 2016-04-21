/*
 * Rahul Shah
 * PD2
 * 3/5/14
 * 
 */
import java.applet.Applet;
import java.awt.*;

public class Review extends Applet{
	
	public void init(){
		setSize(300,200);
		setBackground(Color.BLUE);
	}//end of init
	
	public void paint(Graphics g){
		
		g.setColor(Color.CYAN);
		g.fillRect(0, 100, 300, 100);
		g.setColor(Color.BLUE);
		g.fillOval(0,75,50,50);
		
	}//end of paint

}//end of Review
