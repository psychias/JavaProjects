package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import main.Main;
import model.ExceptionHandling;
import model.Individual;

public class Customer extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textEmail;
	private JTextField textAdress;
	private JTextField textNationality;
	private JTextField textCategory;
	private JButton btnSubmit;
	private JTable table;
	private DefaultTableModel model;
	private JScrollPane scrollPane =  new JScrollPane();


	public Customer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 761, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(6, 21, 61, 16);
		contentPane.add(lblName);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(6, 52, 61, 16);
		contentPane.add(lblEmail);
		
		JLabel lblAdress = new JLabel("Adress");
		lblAdress.setBounds(6, 80, 61, 16);
		contentPane.add(lblAdress);
		
		JLabel lblNationality = new JLabel("Nationality");
		lblNationality.setBounds(6, 112, 102, 16);
		contentPane.add(lblNationality);
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setBounds(6, 146, 61, 16);
		contentPane.add(lblCategory);
		
		textName = new JTextField();
		textName.setBounds(161, 16, 130, 26);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setBounds(161, 47, 130, 26);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		textAdress = new JTextField();
		textAdress.setBounds(161, 75, 130, 26);
		contentPane.add(textAdress);
		textAdress.setColumns(10);
		
		textNationality = new JTextField();
		textNationality.setBounds(161, 107, 130, 26);
		contentPane.add(textNationality);
		textNationality.setColumns(10);
		
		textCategory = new JTextField();
		textCategory.setBounds(161, 141, 130, 26);
		contentPane.add(textCategory);
		textCategory.setColumns(10);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(61, 194, 117, 29);
		btnSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addCustomer();
				
			}
			
		});
		contentPane.add(btnSubmit);
		
		table = new JTable();
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setBounds(349, 194, 330, -172);
		
		
		
		String colNames[] = {"Name","Email","Adress","Nationality","Category"};
		model = new DefaultTableModel(colNames,0);
		for(Individual i: main.Main.lista) {
			Object obj[] = {i.getName(),i.getEmail(),i.getAdress(),i.getNationality(),i.getCategory()};	
			model.addRow(obj);
		}
		
		table.setModel(model);
		table.setEnabled(true);
		scrollPane.setBounds(335, 6, 409, 303);
		contentPane.add(scrollPane);

		scrollPane.setViewportView(table);

				
		setVisible(true);
		setEnabled(true);
	}
	
	
	private void addCustomer() {
		String name = textName.getText();
		String email = textEmail.getText();
		String adress = textAdress.getText();
		String nationality = textNationality.getText();
		String category = textCategory.getText();
		
		Individual customer;
		try {
			customer =  new Individual(name, email, adress, nationality, category);
			Main.lista.add(customer);
			Object obj[] = {customer.getName(),customer.getEmail(),customer.getAdress(),customer.getNationality()
					,customer.getCategory()};
			model.addRow(obj);
			repaint();
			
		} catch (ExceptionHandling e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		}
	}
		
		
	

