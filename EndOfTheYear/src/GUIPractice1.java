import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUIPractice1 {

	/**
	 * 
	 */

	private static final int WIDTH = 1000, HEIGHT = 1000;
	private int counter;
	private JLabel label;
	private JButton add, subtract;
	private JFrame frame;
	private JPanel panel;

	// set up GUI
	public GUIPractice1() {

		counter = 50;
		label = new JLabel(Integer.toString(counter));
		frame = new JFrame("Buttons");
		panel = new JPanel();

		add = new JButton("ADD");
		add.addActionListener(new ButtonListener());

		subtract = new JButton("SUBTRACT");
		subtract.addActionListener(new ButtonListener());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setBackground(Color.YELLOW);
		panel.setLayout(new FlowLayout());
		

		panel.add(add);
		panel.add(subtract);
		panel.add(label);

		frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.add(panel);

	}

	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			if (event.getActionCommand().equals("ADD")) {
				counter++;
				label.setText(Integer.toString(counter));
			} else {
				counter--;
				label.setText(Integer.toString(counter));
			}

		}

	}

	public void display() {
		// TODO Auto-generated method stub
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GUIPractice1 m = new GUIPractice1();
		m.display();

	}

}
