package quiz.application;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
public class Rules extends JFrame {
	Rules(){
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		
		JLabel heading = new JLabel("Simple Minds");
		heading.setBounds(50, 20, 700, 30);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,36 ));
		heading.setForeground(new Color(32,132,0));
		add(heading);
		
		setSize(800,650);
		setLocation(350,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Rules();
	}
}
