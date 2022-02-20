package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Student;
import model.Utils;
import main.Main;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.Main;
import model.Student;

public class StudentGui extends JFrame {
	
	private JPanel contentPane;
	private JTextField textId;
	private JTextField textName;
	private JTextField textGpa;
	
	public StudentGui() {
		getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("id");
		lblId.setBounds(43, 44, 61, 16);
		getContentPane().add(lblId);
		
		JLabel lblName = new JLabel("name");
		lblName.setBounds(43, 72, 61, 16);
		getContentPane().add(lblName);
		
		JLabel lblGpa = new JLabel("gpa");
		lblGpa.setBounds(43, 100, 46, 16);
		getContentPane().add(lblGpa);
		
		textId = new JTextField();
		textId.enable(false);
		textId.setBounds(128, 44, 130, 26);
		getContentPane().add(textId);
		textId.setColumns(10);
		
		textName = new JTextField();
		textName.setBounds(128, 67, 130, 26);
		getContentPane().add(textName);
		textName.setColumns(10);
		
		textGpa = new JTextField();
		textGpa.setBounds(128, 95, 130, 26);
		getContentPane().add(textGpa);
		textGpa.setColumns(10);
		
		JButton btnAppend = new JButton("Append");
		btnAppend.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				appendClient();
				
			}
			
		});
		btnAppend.setBounds(6, 171, 117, 29);
		getContentPane().add(btnAppend);
		
		
		this.setVisible(true);
		this.setEnabled(true);
	}
	
	private void appendClient() {
		try {
			double gpa = Double.parseDouble(textGpa.getText());
			if(gpa < 0 || gpa > 10 ) {
				JOptionPane.showMessageDialog(null, "the grade has to be between 0 - 10", "Error GPA", JOptionPane.ERROR_MESSAGE);
				return;
			}
			int id = main.Main.students.size()+1;
			Student s = new Student(id, textName.getText(), gpa);
			Main.students.add(s);
			System.out.println("===============================");
			for(Student st: Main.students) {System.out.println(st);}
			
			
			}catch(NumberFormatException e) {
				System.out.println("Invalid Number");
			}
	}


}
