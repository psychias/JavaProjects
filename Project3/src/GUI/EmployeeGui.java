package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import main.Main;
import model.Employee;


public class EmployeeGui extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textHomeAdress;
	private JTextField textHomeTown;
	private JTextField textHomeZip;
	private JTextField textHCountry;
	private JTextField textHPhone;
	private JTextField textWAdress;
	private JTextField textWTown;
	private JTextField textWZipCode;
	private JTextField textWCountry;
	private JTextField textWPhone;
	private JTextField textAmount;
	private JButton btnSubmit;

	public  EmployeeGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(6, 34, 61, 16);
		contentPane.add(lblName);
		
		JLabel lblHomeAdress = new JLabel("Home Adress");
		lblHomeAdress.setBounds(6, 62, 94, 16);
		contentPane.add(lblHomeAdress);
		
		JLabel lblHomeTown = new JLabel("Home Town");
		lblHomeTown.setBounds(6, 90, 94, 16);
		contentPane.add(lblHomeTown);
		
		JLabel lblHomeZip = new JLabel("Home Zip Code");
		lblHomeZip.setBounds(6, 115, 118, 16);
		contentPane.add(lblHomeZip);
		
		JLabel lblHomeCountry = new JLabel("Home Country");
		lblHomeCountry.setBounds(6, 143, 94, 16);
		contentPane.add(lblHomeCountry);
		
		JLabel lblHomePhone = new JLabel("Home Phone");
		lblHomePhone.setBounds(6, 168, 94, 16);
		contentPane.add(lblHomePhone);
		
		JLabel lblWorkAdress = new JLabel("Work Adress");
		lblWorkAdress.setBounds(6, 196, 94, 16);
		contentPane.add(lblWorkAdress);
		
		JLabel lblWorkTown = new JLabel("Work Town");
		lblWorkTown.setBounds(6, 224, 94, 16);
		contentPane.add(lblWorkTown);
		
		JLabel lblWorkZipCode = new JLabel("Work Zip Code");
		lblWorkZipCode.setBounds(6, 248, 118, 16);
		contentPane.add(lblWorkZipCode);
		
		JLabel lblWorkCountry = new JLabel("Work Country");
		lblWorkCountry.setBounds(6, 276, 94, 16);
		contentPane.add(lblWorkCountry);
		
		JLabel lblWorkPhone = new JLabel("Work Phone");
		lblWorkPhone.setBounds(6, 304, 94, 16);
		contentPane.add(lblWorkPhone);
		
		JLabel lblNewLabel = new JLabel("Amount to Pay");
		lblNewLabel.setBounds(6, 346, 118, 16);
		contentPane.add(lblNewLabel);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(199, 29, 130, 26);
		contentPane.add(textFieldName);
		textFieldName.setColumns(10);
		
		textHomeAdress = new JTextField();
		textHomeAdress.setBounds(199, 57, 130, 26);
		contentPane.add(textHomeAdress);
		textHomeAdress.setColumns(10);
		
		textHomeTown = new JTextField();
		textHomeTown.setBounds(199, 85, 130, 26);
		contentPane.add(textHomeTown);
		textHomeTown.setColumns(10);
		
		textHomeZip = new JTextField();
		textHomeZip.setBounds(199, 115, 130, 26);
		contentPane.add(textHomeZip);
		textHomeZip.setColumns(10);
		
		textHCountry = new JTextField();
		textHCountry.setBounds(199, 138, 130, 26);
		contentPane.add(textHCountry);
		textHCountry.setColumns(10);
		
		textHPhone = new JTextField();
		textHPhone.setBounds(199, 163, 130, 26);
		contentPane.add(textHPhone);
		textHPhone.setColumns(10);
		
		textWAdress = new JTextField();
		textWAdress.setBounds(199, 191, 130, 26);
		contentPane.add(textWAdress);
		textWAdress.setColumns(10);
		
		textWTown = new JTextField();
		textWTown.setBounds(199, 219, 130, 26);
		contentPane.add(textWTown);
		textWTown.setColumns(10);
		
		textWZipCode = new JTextField();
		textWZipCode.setBounds(199, 243, 130, 26);
		contentPane.add(textWZipCode);
		textWZipCode.setColumns(10);
		
		textWCountry = new JTextField();
		textWCountry.setBounds(199, 271, 130, 26);
		contentPane.add(textWCountry);
		textWCountry.setColumns(10);
		
		textWPhone = new JTextField();
		textWPhone.setBounds(199, 299, 130, 26);
		contentPane.add(textWPhone);
		textWPhone.setColumns(10);
		
		textAmount = new JTextField();
		textAmount.setBounds(199, 341, 130, 26);
		contentPane.add(textAmount);
		textAmount.setColumns(10);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				addEmployee();
               String text =  textFieldName.getText()+" "+textHomeAdress.getText();			
				messageShow message = new messageShow(text);
								
				
			}		
		});

		btnSubmit.setBounds(6, 405, 117, 29);
		contentPane.add(btnSubmit);
		

		setVisible(true);
		setEnabled(true);
				
		
		
	}
	
	
	private void addEmployee() {
		
		String name = textFieldName.getText();
		String homeAdress = textHomeAdress.getText();
		String homeTown =textHomeTown.getText();
		int homeZipCode = Integer.valueOf(textHomeZip.getText());
		String homeCountry = textHCountry.getText();
		String homePhone = textHPhone.getText();
		
		String workAdress = textWAdress.getText();
		String workTown = textWTown.getText();
		int workZipCode = Integer.valueOf(textWZipCode.getText());
		String workCountry = textWCountry.getText();
		String workPhone =  textWPhone.getText();
		int debt = Integer.valueOf(textAmount.getText());

		
		
		
		Employee emp =  new Employee(name,homeAdress,homeTown,homeZipCode,homeCountry,homePhone,workAdress,
				workTown, workZipCode,workCountry,workPhone,debt);
		
		Main.employees.add(emp);
		for (Employee e : Main.employees) {
			e.Reminder();
			
		}

	}}



