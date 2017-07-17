package edu.cnm.deepdive.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class HelloWorld  {

	private JFrame frame;
	
	private void createAndShowGui() {
			frame = new JFrame("Hello World in Swing");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JButton button = new JButton("Say Hello");	
			button.addActionListener(evt -> {
				JOptionPane.showMessageDialog(frame, "Hello from inside an anonymous class!");
			});
				
			frame.getContentPane().add(button);
			frame.pack();
			frame.setVisible(true);
		}




	public static void main(String[] args) {
		SwingUtilities.invokeLater(()-> {new HelloWorld().createAndShowGui();});
	
					
		
} //main


} //HelloWorld Class


