/*
 * Rahul Shah
 * 2/24/14
 * Snowman.java
 * DO YOU WANT TO BUILD A SNOWWWMAAAAAAAN?
 */
import java.applet.Applet;//for Applets
import java.awt.*;//for graphics
public class Snowman extends Applet{
	
	public void init (){
		setSize(300,200);  //set the size of the applet window
		
	}//end of init
	
	public void paint (Graphics p){
		
		//constants for mid and top of snowman
		//added 20 :P haxorrr
		final int MID = 170;
		final int TOP = 50;
		
		setBackground(Color.CYAN);
		
		//fill in the bottom rectangle
		p.setColor(Color.BLUE);
		p.fillRect(0, 175, 300, 200);//ground
		
		//SAY MY NAME
		p.setColor(Color.BLACK);
		p.drawString("Rahul Shah", 10, 30);
		
		//draw the sun
		//even though he will melt in the sun
		p.setColor(Color.YELLOW);
		p.fillOval(240, -40, 80,80);
		
		//draw the snowman
		//THEN WHAT HAVE I BEEN DRAWING ALL THIS TIME THEN?!
		p.setColor(Color.WHITE);
		p.fillOval(MID-20, TOP, 40, 40);//head
		p.fillOval(MID-35, TOP+35, 70, 50);//upper torso
		p.fillOval(MID-50, TOP+80, 100, 60);//lower torso
		p.setColor(Color.RED);
		p.fillOval(MID-5, TOP+35, 10, 10);//BUTTON
		p.fillOval(MID-5, TOP+55, 10, 10);//BUTTON
		
		
		//draw the face
		p.setColor(Color.BLACK);
		p.fillOval(MID-10, TOP+10, 5, 5);//left eye
		p.fillOval(MID+5, TOP+10, 5, 5);//right eye
		p.drawArc(MID-10, TOP+20, 20, 10, -190,-160);//smile/frown
		
		//draw the arms
		p.drawLine(MID-25, TOP+60, MID-50, TOP+40);//left arm
		p.drawLine(MID+25, TOP+60, MID+55, TOP+60);//right arm
		
		//draw the hat
		p.drawLine(MID-20, TOP+5, MID+20, TOP+5);//brim of the hat
		p.fillRect(MID-15, TOP-20, 30, 25);//top of hat
		
		
		
	}//end of of paint
}//end of Snowman
