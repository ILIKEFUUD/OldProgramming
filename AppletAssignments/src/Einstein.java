/*
 * Rahul Shah
 * PD2
 * 2/20/14
 * 
 */
import java.applet.*;
import java.awt.*;
public class Einstein extends Applet{
	
	//init method, sets up the starting applet window
	public void init (){
		
		setSize(350,150);
		
	}//end of init
	
	public void paint (Graphics page){
		//variables inside paint
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		Color myColor = new Color (red, green, blue);
		
		
		page.setColor(Color.BLACK);
		page.drawRect(50,50,40,40);
		page.setColor(Color.GREEN);
		page.drawRect(60, 80, 225, 30);
		page.setColor(Color.CYAN);
		page.drawOval(75, 65, 20, 20);
		page.setColor(Color.RED);
		page.drawString("Albert Einstein", 130, 100);
		page.setColor(myColor);
		page.fillRect(90, 90, 25, 90);
		page.setColor(Color.MAGENTA);
		page.drawArc(290, 50, 40, 40, 150, 45);
		page.setColor(Color.YELLOW);
		page.fillArc(290, 80, 40, 40, 180, 180);
		
		
	}//end of paint

}//end of Einstein
