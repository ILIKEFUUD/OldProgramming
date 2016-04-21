import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Woo extends JApplet {

	private int WIDTH = 300, HEIGHT = 300;
	private JLabel counter;
	private float time;
	private JButton refresh;
	private static boolean isDone = false;
	
	private class WaitListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			time = (int) System.currentTimeMillis();
			counter.setText(Float.toString(time));
			repaint();
		}
		
	}

	public void init(){
		time = (int) System.nanoTime();
		counter = new JLabel(Float.toString(time));
		refresh = new JButton("STAHP");
		refresh.addActionListener(new WaitListener());		
		Container cp = getContentPane();
		cp.setBackground(Color.RED);
		cp.setLayout(new FlowLayout());
		setSize(WIDTH,HEIGHT);
		cp.add(counter);
		cp.add(refresh);
		
		
		
		
		
	}

}
