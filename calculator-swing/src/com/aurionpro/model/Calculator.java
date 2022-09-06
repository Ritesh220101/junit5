package com.aurionpro.model;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame;
	JTextField textField;
	JPanel panel;
	List<JButton> functionButtons = new ArrayList<>();
	List<JButton> numberButtons = new ArrayList<>();
	JButton addButton, subButton, mulButton, divButton;
	JButton decButton, equalButton, clearButton, deleteButton;
	
	double num1 = 0, num2 = 0, result = 0;
	char operator;

	public Calculator() {
		ImageIcon image = new ImageIcon("calculator-icon.png");
		
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setSize(400, 500);

		textField = new JTextField();
		textField.setBounds(45, 20, 300, 50);
		textField.setFont(new Font("Comic Sans", Font.BOLD, 30));
		textField.setEditable(false);
		textField.setBackground(Color.white);
		textField.setForeground(Color.green);

		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equalButton = new JButton("=");
		clearButton = new JButton("C");
		deleteButton = new JButton("DEL");

		functionButtons.add(addButton);
		functionButtons.add(subButton);
		functionButtons.add(mulButton);
		functionButtons.add(divButton);
		functionButtons.add(decButton);
		functionButtons.add(equalButton);
		functionButtons.add(clearButton);
		functionButtons.add(deleteButton);
		
		for (int i = 0; i < functionButtons.size(); i++) {
			functionButtons.get(i).addActionListener(this);
			functionButtons.get(i).setFocusable(false);
			functionButtons.get(i).setBackground(Color.black);
			functionButtons.get(i).setForeground(Color.white);
		}

		for (int i = 0; i < 10; i++) {
			numberButtons.add(new JButton(String.valueOf(i)));
			numberButtons.get(i).addActionListener(this);
			numberButtons.get(i).setFocusable(false);
			numberButtons.get(i).setBackground(Color.black);
			numberButtons.get(i).setForeground(Color.white);
		}

		deleteButton.setBounds(45, 405, 145, 50);
		clearButton.setBounds(200, 405, 145, 50);

		panel = new JPanel();
		panel.setBounds(45, 100, 300, 300);
		panel.setLayout(new GridLayout(4, 4, 5, 5));

		panel.add(numberButtons.get(1));
		panel.add(numberButtons.get(2));
		panel.add(numberButtons.get(3));
		panel.add(addButton);
		panel.add(numberButtons.get(4));
		panel.add(numberButtons.get(5));
		panel.add(numberButtons.get(6));
		panel.add(subButton);
		panel.add(numberButtons.get(7));
		panel.add(numberButtons.get(8));
		panel.add(numberButtons.get(9));
		panel.add(mulButton);
		panel.add(decButton);
		panel.add(numberButtons.get(0));
		panel.add(equalButton);
		panel.add(divButton);
		
		frame.setIconImage(image.getImage());
		frame.add(panel);
		frame.add(deleteButton);
		frame.add(clearButton);
		frame.add(textField);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < 10; i++) {
			if (e.getSource() == numberButtons.get(i)) {
				textField.setText(textField.getText().concat(String.valueOf(i)));
			}
		}
		if (e.getSource() == decButton) {
			textField.setText(textField.getText().concat("."));
		}
		if (e.getSource() == addButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = '+';
			textField.setText("");
		}

		if (e.getSource() == subButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = '-';
			textField.setText("");
		}
		if (e.getSource() == mulButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = '*';
			textField.setText("");
		}
		if (e.getSource() == divButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = '/';
			textField.setText("");
		}
		if (e.getSource() == equalButton) {
			num2 = Double.parseDouble(textField.getText());

			switch (operator) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			}
			textField.setText(String.valueOf(result));
			num1 = result;
		}
		if(e.getSource()==clearButton) {
			textField.setText("");
		}
		if(e.getSource()==deleteButton) {
			String str = textField.getText();
			textField.setText("");
			for(int i=0;i<str.length()-1;i++) {
				textField.setText(textField.getText()+str.charAt(i));
			}
		}
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
	}
}
