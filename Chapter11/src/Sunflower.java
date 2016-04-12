/*
 * Rahul Shah
 * PD2
 */
import javax.swing.*;
import java.awt.event.*;

public class Sunflower implements ActionListener{
	private JFrame frame;
	private JPanel contentPane;
	private JLabel label;
	private JButton button, button2;
	final static String LABEL_TEXT = "Sunflower";
	
	public Sunflower(){
		//create and set up the frame
		frame = new JFrame(LABEL_TEXT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//set up the content pane with BoxLayout and empty border
		contentPane = new JPanel();
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
		contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		
		//create a label that is centered 
		label = new JLabel("Sunflower");
		label.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		label.setBorder(BorderFactory.createEmptyBorder(20,50,20,50));
		contentPane.add(label);
		
		//create a button to display the english version
		button = new JButton("English");
		button.setAlignmentX(JButton.CENTER_ALIGNMENT);
		button.setActionCommand("English");
		button.addActionListener(this);
		contentPane.add(button);
		
		//create a button to display the latin name
		button2 = new JButton("Latin");
		button2.setAlignmentX(JButton.CENTER_ALIGNMENT);
		button2.setActionCommand("Latin");
		button2.addActionListener(this);
		contentPane.add(button2);
		
		//add content pane to the frame
		frame.add(contentPane);
		
		frame.pack();
		frame.setVisible(true);
	}//end of constructor
	
	public void actionPerformed(ActionEvent event){
		String eventName = event.getActionCommand();
		if (eventName.equals("English")){
			label.setText("Sunflower");
		}else{
			label.setText("Helianthus");
		}
	}//end of actionPerformed
	
	private static void runGUI(){
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		Sunflower flower = new Sunflower();
	}
	
	
	
	public static void main(String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				runGUI();
				
			}
		});

	}//end of main
	
}//end of Sunflower
