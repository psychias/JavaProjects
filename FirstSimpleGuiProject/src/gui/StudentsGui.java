package gui;

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

public class StudentsGui extends JFrame {
      
	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtName;
	private JTextField txtGpa;

	public StudentsGui() {
		Utils.readTFromDisk();
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 658, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblId = new JLabel("id");
		lblId.setBounds(42, 60, 61, 16);
		contentPane.add(lblId);

		JLabel lblIName = new JLabel("Name");
		lblIName.setBounds(42, 88, 61, 16);
		contentPane.add(lblIName);

		JLabel lblGpa = new JLabel("Gpa");
		lblGpa.setBounds(42, 116, 61, 16);
		contentPane.add(lblGpa);

		txtId = new JTextField();
		txtId.setEnabled(false);
		txtId.setBounds(124, 55, 39, 26);
		contentPane.add(txtId);
		txtId.setColumns(10);

		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(124, 83, 130, 26);
		contentPane.add(txtName);

		txtGpa = new JTextField();
		txtGpa.setColumns(10);
		txtGpa.setBounds(124, 111, 130, 26);
		contentPane.add(txtGpa);

		JButton btnAppend = new JButton("Append");
		btnAppend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appendClient();
			}
		}) ;
		btnAppend.setBounds(56, 214, 117, 29);
		contentPane.add(btnAppend);
	
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				writeAndClose();
				
				
			}
		});
		btnExit.setBounds(512, 214, 117, 29);
		contentPane.add(btnExit);
		this.setVisible(true);
		this.setEnabled(true);
	}

	private void writeAndClose() {
		model.Utils.writeTodisk();
		this.dispose(); // close window but not terminate
	}
	private void appendClient() {
		try {
			
			double gpa = Double.parseDouble(txtGpa.getText());
			if(gpa<0 || gpa>10.0) {
				JOptionPane.showMessageDialog(null, "O bathmos metaxy 0 -10", "Error GPA",JOptionPane.ERROR_MESSAGE);
				return ;
			}
			int id = Main.univ.size()+1;
			
			Student s = new Student(id, txtName.getText(), gpa);
			Main.univ.add(s);
			System.out.println("---------------------------------------");
			for (Student ss : Main.univ) {
				System.out.println(ss);
			}

		} catch (NumberFormatException e) {
			System.out.println("lathos arithmos ");

		}
	}

}
