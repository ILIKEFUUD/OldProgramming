/*
 * Rahul Shah
 * Display your name in a label (Part 1)
 * Add a show/hide button (Part 2)
 */
import javax.swing.*;
import java.awt.event.*;
public class Name implements ActionListener{
	
	private JFrame frame;
	private JPanel contentPanel;
	private JLabel label;
	private JButton button;
	
	public Name(){
		//create and set up the frame
		frame = new JFrame ("Name");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//create the panel
		contentPanel = new JPanel();
		
		//create the label and put it on the content panel
		label = new JLabel ("Rahul Shah");
		contentPanel.add(label);
		
		//create the button 
		button = new JButton("HIDE");
		button.setActionCommand("HIDE");
		button.addActionListener(this);
		
		contentPanel.add(button);
		
		//put the content pane to the frame
		frame.add(contentPanel);
		
		frame.pack();//sizes frame 
		frame.setVisible(true);//shows the frame
	}//end of constructor for Name
	
	private static void runGUI(){
		JFrame.setDefaultLookAndFeelDecorated(true);
		Name myName = new Name();
	}//end of runGUI
	
	public void actionPerformed(ActionEvent event){
		String eventName = event.getActionCommand();
		if (eventName.equals("HIDE")){
			label.setText("");
			button.setActionCommand("SHOW");
			button.setText("SHOW");
		}else{
			label.setText("Rahul Shah");
			button.setActionCommand("HIDE");
			button.setText("HIDE");
		}
	}//end of actionPerformed


	
	public static void main(String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				runGUI();
			}
		});
		

	}//end of main

}//end of Name
