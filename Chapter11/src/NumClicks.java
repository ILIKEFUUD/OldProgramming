/*
 * Rahul Shah
 * Creates a button displaying how many times a button is clicked
 */
import javax.swing.*;
import java.awt.event.*;
public class NumClicks implements ActionListener{
	
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	private static int clicks = 0;
	public NumClicks(){
		//set up and create the frame
		frame = new JFrame("NumClicks");
		
		//set up and add the panel
		panel = new JPanel();
		frame.add(panel);
		
		//set up and add button
		button = new JButton("You have clicked " + clicks + " times!");
		button.addActionListener(this);
		
		panel.add(button);
		
		//put the content pane on the frame
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		
	}//end of constructor for NumClicks
	
	private static void runGUI(){
		JFrame.setDefaultLookAndFeelDecorated(true);
		NumClicks click = new NumClicks();
	}
	
	public void actionPerformed(ActionEvent event){
		clicks++;
		button.setText("You have clicked " + clicks + " times!");
	}
	
	public static void main(String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				runGUI();

			}
		});

	}//end of main

}//end of NumClicks
