/*
 * First example of a GUI to display a message
 * Creates a frame, content pane and a label
 */
import javax.swing.*;
public class HelloWorldGUI1 {
	
	//instane variables
	private JFrame frame;
	private JPanel contentPane;
	private JLabel label;
	
	//constants
	final static String LABEL_TEXT = "  Hello World!  ";
	
	
	public HelloWorldGUI1(){
		//create and set up the frame
		frame = new JFrame("HelloWorldGUI1");
		
		//create a content pane
		contentPane = new JPanel();
		
		//create the label that will display in the frame
		label = new JLabel(LABEL_TEXT);
		
		//add the label
		contentPane.add(label);
		
		//add contentPane to the frame
		frame.setContentPane(contentPane);
		
		frame.pack();//sizes frame or window
		frame.setVisible(true);//shows the window
	}//end of constructor
	
	private static void runGUI(){
		 JFrame.setDefaultLookAndFeelDecorated(true);
		 HelloWorldGUI1 greeting = new HelloWorldGUI1();
	}//end of runGUI
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				runGUI();
			}
		});
		runGUI();

	}//end of main

}//end of HelloWorldGUI1
