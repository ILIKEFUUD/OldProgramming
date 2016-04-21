/*
 * Rahul Shah
 * PD2
 * 2/21/14
 * More practice with drawing. Drawing a picture
 */
import java.applet.Applet;
import java.awt.*;

public class DrawingPractice extends Applet {
	
	public void init(){
		setSize(300,300);
		setBackground(Color.BLACK);
	}//end of init
	
	public void paint (Graphics g){
		Color purple = new Color (110, 0, 150);
		g.setColor(purple);
		g.fillRoundRect(100,100,30,100,50,20);
		
		g.setColor(Color.BLACK);
		g.fillRoundRect(115, 115, 30, 100, 50, 20);
		
		g.setColor(Color.ORANGE);
		g.fillOval(225,37,50,25);
		Color myOrange = new Color (255,102,0);
		g.setColor(myOrange);
		g.fillOval(225,37,50,25);
		
		g.setColor(Color.YELLOW);
		g.drawArc(10,110,80,80,90,180);
		
		g.setColor(Color.CYAN);
		g.fillArc(140, 40, 120, 120, 90, 45);
		
		g.setColor(Color.MAGENTA);
		g.fillArc(150, 150, 100, 100, 90, 90);
		
		g.setColor(Color.BLACK);
		g.fillArc(160, 160, 80, 80, 90, 90);
		
		
		
		
	}//end of paint

}//end of DrawingPractice
