package com.aurionpro.model;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Buttons implements ActionListener {
	static JButton button;
	public static void main(String[] args) {
		
		ImageIcon icon = new ImageIcon("point.jpg");
		
		button = new JButton();
		button.setBounds(200, 100, 250, 250);
		button.setText("Click Me");
		button.setFocusable(false);
		button.setIcon(icon);
		button.addActionListener(e-> System.out.println("Hell yea!!"));
		button.setFont(new Font("Comic Sans",Font.BOLD,10));
		
		
		JFrame frame = new JFrame(); 
		frame.setTitle("Swing Practice"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setLayout(null);
		frame.setSize(500, 500); 
		frame.setVisible(true); 
		frame.add(button);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("Hell yea!!");
		}
		
	}
}
