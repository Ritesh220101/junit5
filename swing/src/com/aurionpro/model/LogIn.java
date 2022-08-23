package com.aurionpro.model;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LogIn {
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Logged In Successfully");
	
	LogIn(){
		label.setBounds(0,0,100,150);
		label.setFont(new Font(null,Font.PLAIN,30));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.add(label);
	}
	
}
