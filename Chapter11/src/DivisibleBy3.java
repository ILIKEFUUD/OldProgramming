/*
 * Rahul Shah
 * PD2
 */
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class DivisibleBy3 implements ActionListener {

	private JFrame frame;
	private JPanel contentPane;
	private JLabel label, divisible;
	private JTextField integer;
	private JButton button;
	

	public  DivisibleBy3() {
		// set up the frame
		frame = new JFrame("DivisibleBy3");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// create a content pane with GridLayout
		contentPane = new JPanel();
		contentPane.setLayout(new GridLayout(0, 2, 10, 5));
		contentPane.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));

		// create and add a prompt and a text field
		label = new JLabel("Enter an integer");
		contentPane.add(label);

		integer = new JTextField(20);
		contentPane.add(integer);

		// create a button
		button = new JButton("Check");
		button.addActionListener(this);
		button.setActionCommand("CHECK");
		button.setAlignmentX(JButton.LEFT_ALIGNMENT);
		button.setAlignmentY(JButton.BOTTOM_ALIGNMENT);
		contentPane.add(button);
		
		// create the second label
		divisible = new JLabel(" ");
		contentPane.add(divisible);



		// add content pane to the frame
		frame.add(contentPane);

		frame.pack();
		frame.setVisible(true);

	}// end of constructor

	public void actionPerformed(ActionEvent event) {
		String eventName = event.getActionCommand();

		if (eventName.equals("CHECK")) {
			String num = integer.getText();
			if (Integer.parseInt(num) % 3 == 0) {
				divisible.setText("The number is divisible by 3");
			} else {
				divisible.setText("The nwumber is not divisible by 3");
			}

		}
	}// end of actionPerformed

	private static void runGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);

		DivisibleBy3 divideBy3 = new DivisibleBy3();
	}

	public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				runGUI();

			}
		});
	}// end of main

}
