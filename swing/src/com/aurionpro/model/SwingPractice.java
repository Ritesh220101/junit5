package com.aurionpro.model;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SwingPractice{
	public static void main(String[] args) {
		JLabel label = new JLabel();
		label.setText("Login Page");
		label.setForeground(Color.white);
		label.setBackground(new Color(0xbde0fe));
		label.setFont(new Font("Comic Sans",Font.BOLD,30));
		label.setOpaque(true);
		label.setBounds(150,0,200,100);
		label.setVerticalAlignment(JLabel.TOP); 
		label.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel name = new JLabel();
		name.setText("Name: ");
		name.setForeground(Color.white);
		name.setBackground(new Color(0xbde0fe));
		name.setFont(new Font("",Font.ITALIC,30));
		name.setOpaque(true);
		name.setBounds(0, 100, 150, 100);
		name.setVerticalAlignment(JLabel.TOP); 
		name.setHorizontalAlignment(JLabel.LEFT);
		
		JLabel password = new JLabel();
		password.setText("Password: ");
		password.setForeground(Color.white);
		password.setBackground(new Color(0xbde0fe));
		password.setFont(new Font("",Font.ITALIC,30));
		password.setOpaque(true);
		password.setBounds(0, 200, 150, 100);
		password.setVerticalAlignment(JLabel.TOP); 
		password.setHorizontalAlignment(JLabel.LEFT);
		
		JTextField nameField = new JTextField();
		nameField.setBounds(150,100,200,35);
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(150,200,200,35);
		
		JButton button = new JButton();
		button = new JButton();
		button.setBounds(200, 300, 100, 50);
		button.setText("Log In");
		button.setFocusable(false);
		button.setBackground(Color.green);
		button.setFont(new Font("Comic Sans",Font.BOLD,15));
		button.setForeground(Color.white);
		button.addActionListener(e->System.out.println("Logged In"));
		
		JFrame frame = new JFrame();
		frame.setTitle("Simple GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.add(label);
		frame.add(name);
		frame.add(password);
		frame.add(nameField);
		frame.add(passwordField);
		frame.add(button);
		frame.getContentPane().setBackground(new Color(0xbde0fe));	
	}

	

}
