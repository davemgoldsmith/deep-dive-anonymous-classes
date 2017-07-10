package edu.cnm.deepdive.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class HelloWorld implements ActionListener {

	private JFrame frame;
	
	private void createAndShowGui() {
			frame = new JFrame("Hello World in Swing");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JButton button = new JButton("Say Hello");	
			button.addActionListener(this);
			frame.getContentPane().add(button);
			frame.pack();
			frame.setVisible(true);
		}


	@Override
	public void actionPerformed(ActionEvent evt) {
		JOptionPane.showMessageDialog(frame, "Hello, you crazy world of Swing");
		
	}
	
	
	

	public static void main(String[] args) {
		SwingUtilities.invokeLater(()-> {new HelloWorld().createAndShowGui();});

		
				
			
				
					
		
} //main


} //HelloWorld Class


