/*
 * Rahul Shah
 * PD2
 * 2/21/14
 */
import java.applet.Applet;
import java.awt.*;
public class DrawingAssignment extends Applet{
	
	public void init (){
		setSize(300,300);
		setBackground(Color.YELLOW);
	}//end of init
	
	public void paint (Graphics page){
		
		page.setColor(Color.BLACK);
		page.drawString("Shapes and Colors", 100, 50);
		page.drawString("Rahul Shah", 110, 70);
		
		page.setColor(Color.RED);
		page.drawRect(100, 100, 100, 100);
		
		page.setColor(Color.RED);
		page.fillRect(110, 110, 80, 80);
		
		page.setColor(Color.BLUE);
		page.fillOval(125, 125, 50, 50);
		
		page.setColor(Color.YELLOW);
		page.drawLine(140, 140, 160, 160);
		
	}//end of paint

}//end of DrawingAssignment
