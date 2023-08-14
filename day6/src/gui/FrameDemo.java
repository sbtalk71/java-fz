package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameDemo {

	JLabel label=new JLabel("Hello There..");
	JPanel panel;
	public FrameDemo() {
		JFrame frame = new JFrame("My Frame 1");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton b1 = new JButton("Print Message");
		b1.setBackground(Color.red);

		b1.addActionListener(new MyActionEventHandler());

		panel = new JPanel();
		panel.setLayout(new GridLayout(3, 1));
		panel.setBackground(Color.cyan);

		panel.add(b1);

		frame.add(panel);

		frame.setSize(300, 200);
		frame.setVisible(true);

	}

	public static void main(String[] args) {

		new FrameDemo();
	}

	class MyActionEventHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {

			System.out.println("Button pressed...");
			label.setForeground(Color.yellow);
			label.setFont(new Font("Ariel",Font.BOLD,20));
			panel.add(label);

		}

	}

}
