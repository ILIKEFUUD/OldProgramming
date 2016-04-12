import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;

public class Riddle implements ActionListener {

	private JLabel label, answer;
	private JFrame frame;
	private JPanel contentPane;
	private JButton button;

	public Riddle() {
		// create and set up the frame
		frame = new JFrame("HelloWorldGUI2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// create a content pane with a BoxLayout and empty borders
		contentPane = new JPanel();
		contentPane.setLayout(new GridLayout(0, 2, 10, 5));
		contentPane.setBorder(BorderFactory.createEmptyBorder(20, 50, 50, 20));

		// create and add label to the contentPane that is centered and has
		// empty borders
		label = new JLabel("Why did the chicken cross the road?");
		label.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		label.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));
		contentPane.add(label);

		// create the answer label which is hidden
		answer = new JLabel(" ");
		answer.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
		answer.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));
		contentPane.add(answer);

		// create and add a button that is centered
		button = new JButton("Answer");
		button.setAlignmentX(JButton.LEFT_ALIGNMENT);
		button.setActionCommand("Answer");
		button.addActionListener(this);

		contentPane.add(button);

		// add contentPane to the frame
		frame.setContentPane(contentPane);

		// size and display the frame
		frame.pack();
		frame.setVisible(true);
	}// end of constructor

	public void actionPerformed(ActionEvent event) {
		answer.setText("To get to the other side!");

	}// end of ActionListener

	private static void runGUI() {

		JFrame.setDefaultLookAndFeelDecorated(true);

		Riddle chicken = new Riddle();
	}// end of runGUI

	public static void main(String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				runGUI();
				
			}
		});

	}//end of main

}//end of Riddle
