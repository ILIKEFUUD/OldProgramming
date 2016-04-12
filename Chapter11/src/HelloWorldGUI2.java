/*
 * Program that uses buttons and actionlistener to perform a task
 */


import javax.swing.*;
import java.awt.event.*;

public class HelloWorldGUI2 implements ActionListener {

	final static String LABEL_TEXT = "Hello, everybody";
	
	private JLabel label;
	private JFrame frame;
	private JPanel contentPane;
	private JButton button;
	
	public HelloWorldGUI2(){
		
		//create and set up the frame
		frame = new JFrame("HelloWorldGUI2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create a content pane with a BoxLayout and empty borders
		contentPane = new JPanel();
		contentPane.setLayout(new BoxLayout(contentPane,BoxLayout.PAGE_AXIS));
		contentPane.setBorder(BorderFactory.createEmptyBorder(20,50,50,20));
		
	
		
		//create and add label to the contentPane that is centered and has empty borders
		label = new JLabel(LABEL_TEXT);
		label.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		label.setBorder(BorderFactory.createEmptyBorder(20,50,20,50));
		contentPane.add(label);
		
		//create and add a button that is centered
		button = new JButton("HIDE");
		button.setAlignmentX(JButton.CENTER_ALIGNMENT);
		button.setActionCommand("HIDE");
		button.addActionListener(this);
		
		contentPane.add(button);
		
		//add contentPane to the frame
		frame.setContentPane(contentPane);
		
		//size and display the frame
		frame.pack();
		frame.setVisible(true);
	}//end of constructor
	
	public void actionPerformed (ActionEvent event){
		String eventName = event.getActionCommand();
		if (eventName.equals("HIDE")){
			label.setText("");
			button.setActionCommand("SHOW");
			button.setText("SHOW");
		}else{
			label.setText(LABEL_TEXT);
			button.setActionCommand("HIDE");
			button.setText("HIDE");
		}
	}//end of ActionListener
	
	private static void runGUI(){
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		HelloWorldGUI2 greeting = new HelloWorldGUI2();
	}
	
	public static void main(String[] args) {
		
		//methods that create and show GUIs should be run from
		//an event dispatching thread
		
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				runGUI();
				
			}
		});

	}//end of main

}//end of HelloWorldGUI2
