package GUI;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.Main;
import model.Employee;
import javax.swing.JLabel;

public class messageShow extends JFrame {

	private JPanel contentPane;
	private static JLabel lblMessage;
	

	public messageShow() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 199);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblMessage = new JLabel("message");
		lblMessage.setBounds(23, 20, 396, 117);
		//lblMessage.setText(showEmp());
		contentPane.add(lblMessage);
		

		setVisible(true);
		setEnabled(true);

	}

	public void showEmp() {
		for (Employee e : Main.employees) {
			e.Reminder();
			//lblMessage.setText(String.valueOf(e.Reminder()));
			//lblMessage.add(e.Reminder());
		}
	}
}
