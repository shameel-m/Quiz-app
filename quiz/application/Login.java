package quiz.application;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
	
	JButton rules,back;
	JTextField tfname;
	Login(){
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
		JLabel image = new JLabel(i1);
		image.setBounds(0, 0, 600, 500);
		add(image);
		
		JLabel heading = new JLabel("Simple Minds");
		heading.setBounds(750, 60, 300, 45);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,36 ));
		heading.setForeground(new Color(32,132,0));
		add(heading);
		
		

		JLabel name = new JLabel("Enter your name");
		name.setBounds(810, 150, 300, 45);
		name.setFont(new Font("Sans and Serif",Font.BOLD,18 ));
		name.setForeground(new Color(0,132,0));
		add(name);
		
		
		 tfname = new JTextField();
		tfname.setBounds(735, 200, 300, 25);
		tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
		add(tfname);
		
		rules = new JButton("Rules");
		rules.setBounds(735,270,120,25);
		rules.setBackground(new Color(20,200,254));
		rules.setForeground(Color.WHITE);
		rules.addActionListener(this);
		add(rules);
		
		 back = new JButton("Back");
		back.setBounds(915,270,120,25);
		back.setBackground(new Color(20,200,254));
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);
		
		setSize(1200,500);
		setLocation(200,150);
		setVisible(true);
		
	}
	public void actionPerformed (ActionEvent ae) {
		if (ae.getSource()==rules) {
			String name =tfname.getText();
			setVisible(false);
			new Rules(name);
		}else if(ae.getSource()==back) {
			setVisible(false);
			
		}
		
	}
	public static void main(String[] args) {
		new Login();
	}
}
