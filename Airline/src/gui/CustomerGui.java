package gui;

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

public class CustomerGui extends JFrame {

	private JFrame frame;
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
	


	/**
	 * @wbp.parser.entryPoint
	 */
	private void CustomerGui() {
		frame = new JFrame();
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
		frame.getContentPane().add(lblNationality);
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setBounds(6, 146, 61, 16);
		frame.getContentPane().add(lblCategory);
		
		textName = new JTextField();
		textName.setBounds(161, 16, 130, 26);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setBounds(161, 47, 130, 26);
		frame.getContentPane().add(textEmail);
		textEmail.setColumns(10);
		
		textAdress = new JTextField();
		textAdress.setBounds(161, 75, 130, 26);
		frame.getContentPane().add(textAdress);
		textAdress.setColumns(10);
		
		textNationality = new JTextField();
		textNationality.setBounds(161, 107, 130, 26);
		frame.getContentPane().add(textNationality);
		textNationality.setColumns(10);
		
		textCategory = new JTextField();
		textCategory.setBounds(161, 141, 130, 26);
		frame.getContentPane().add(textCategory);
		textCategory.setColumns(10);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(61, 194, 117, 29);
		btnSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addCustomer();
				
			}
			
		});
		frame.getContentPane().add(btnSubmit);
		
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
		scrollPane.setBounds(303, 20, 396, 380);
		frame.getContentPane().add(scrollPane);

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
		
		
		try {
			Individual customer =  new Individual(name, email, adress, nationality, category);
			Main.lista.add(customer);
		} catch (ExceptionHandling e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
