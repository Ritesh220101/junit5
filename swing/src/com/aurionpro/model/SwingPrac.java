package com.aurionpro.model;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class SwingPrac {

	public static void main(String[] args) {
		
		ImageIcon image = new ImageIcon("asuna.jpg"); //creating an icon
		Border border = BorderFactory.createLineBorder(Color.white,5);
		JLabel label = new JLabel(); //creates a label
		label.setText("What is up, what is up!!");
//		label.setIcon(image);
//		label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER,RIGHT of image
//		label.setVerticalTextPosition(JLabel.TOP); //set text TOP,BOTTOM of image
		label.setForeground(Color.WHITE); //set color of text
		label.setFont(new Font("",Font.ITALIC,20)); //set font of text
		label.setBackground(Color.black); //set bg color
		label.setOpaque(true); //display bg color
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.TOP); //set vertical position of text within the label
		label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of text within the label
		label.setBounds(0, 0, 250, 250);
		
		
		JFrame frame = new JFrame(); //creates a frame
		frame.setTitle("Swing Practice"); //sets title to frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits out of application
//		frame.setResizable(false); //prevent frame from being resized
		frame.setSize(500, 500); //sets the length and height of frame
		frame.setVisible(true); //make frame visible
		frame.setLayout(null);
		frame.add(label);
//		frame.pack();
		
		frame.setIconImage(image.getImage()); //change icon of frame
//		frame.getContentPane().setBackground(Color.black); //changes bg color by default colors
//		frame.getContentPane().setBackground(new Color(0,200,0)); //changes bg color by rgb values
		frame.getContentPane().setBackground(new Color(0xbde0fe)); //changes bg color by hex values
		
		
	}

}
