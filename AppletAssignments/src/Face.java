/*
 * Rahul Shah
 * PD2
 * 2/26/14
 * Face.java
 * Draw a creative face with eyes, ears, mouth, nose, etc.
 */
import java.applet.Applet;
import java.awt.*;
public class Face extends Applet{
	
	public void init(){
		setSize(400,400);
		setBackground(Color.LIGHT_GRAY);
	}//end of init
	
	public void paint (Graphics page){
		Color myColor = new Color (100,50,0);
		//the head
		page.setColor(myColor);
		page.fillOval(80, 150, 240, 150);
		
		//the eyes
		page.setColor(Color.WHITE);
		page.fillOval(140, 180, 40, 50);//left eye
		page.fillOval(220, 180, 40, 50);//right eye
		
		page.setColor(Color.BLACK);
		page.fillOval(150, 190, 20, 30);//left pupil
		page.fillOval(230, 190, 20, 30);//right pupil
		
		//the nose
		page.setColor(Color.BLACK);
		page.fillOval(170, 230, 50, 30);
		
		//the mouth
		page.drawArc(145, 200, 100, 85, 180, 180);//the smile
		page.drawLine(195, 250, 195, 285);//the thing that connects his mouth to his nose...
		
		page.drawArc(110, 180, 50, 65, 240, 90);//dimple or smile thing 1
		page.drawArc(235, 185, 50, 65, 200, 90);//dimple thing 2
	
		
		//the ears :D
		page.setColor(myColor);
		page.fillArc(90, 140, 50, 80, -160, -178);//left ear
		page.fillArc(255, 140, 50, 80, -178, -200);//right ear
			
		
		//text
		page.setColor(Color.BLACK);
		page.drawString("RAWR! I'M A BEAR!", 149, 350);
		
		//name
		page.drawString("Rahul Shah", 50, 50);
	}
	

}//end of Face
