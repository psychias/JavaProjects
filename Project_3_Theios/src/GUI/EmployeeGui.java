package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

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
	private JButton btnDelete;
	private JButton btnClear;
	private JButton btnEdit;
	private JTable table = new JTable();;
	private JScrollPane scrollPane = new JScrollPane();
	private DefaultTableModel model;

	public EmployeeGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1003, 591);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// model pinaka
		String colNames[] = { "Name", "Debth", "Home Phone", "Work Phone", "Rem" };
		model = new DefaultTableModel(colNames, 0); // Ttitloi = kefalides pinaka 
		//							Object[] columnNames, int rowCount
		for (Employee e : Main.employees) {
			Object[] objs = { e.getName(), e.getDebt(), e.getHomeAdress().getPhone(), e.getWorkAdress().getPhone(),
					e.getReminder() };
			model.addRow(objs);
		}
		table.setModel(model);

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

		btnSubmit = new JButton("Append");
		btnSubmit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
	
				if (textFieldName.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,  "name field is empty ");
					return;
				}
				else if (textHomeAdress.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,  "home adress field is empty ");
					return;
				}
				else if (textHomeZip.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,  "home zip code field is empty ");
					return;
				}
				else if (textHomeTown.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,  "home town field is empty ");
					return;
				}
				else if (textHCountry.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,  "home country field is empty ");
					return;
				}
				else if (textHPhone.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,  "home phone number field is empty ");
					return;
				}
				
				else if (textWAdress.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,  "work adress field is empty ");
					return;
				}
				else if (textWTown.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,  "work town field is empty ");
					return;
				}
				else if (textWCountry.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,  "work country is empty ");
					return;
				}
				else if (textWZipCode.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,  "work zip code field is empty ");
					return;
				}
				else if (textWPhone.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,  "work phone number field is empty ");
					return;
				}
				
				else if (textWPhone.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,  "work phone number field is empty ");
					return;
				}
				else if (textAmount.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,  "the amount field is empty ");
					return;
				}else {

					addEmployee();
	//				String text = textFieldName.getText() + " " + textHomeAdress.getText();
	//				messageShow message = new messageShow(text);
					}

			}
		});

		btnSubmit.setBounds(6, 405, 117, 29);
		contentPane.add(btnSubmit);

		scrollPane.setBounds(413, 28, 562, 499);
		contentPane.add(scrollPane);

		scrollPane.setViewportView(table);

		btnEdit = new JButton("Edit");
		btnEdit.setBounds(131, 405, 117, 29);
		contentPane.add(btnEdit);

		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				delete();
			}
		});
		btnDelete.setBounds(258, 405, 117, 29);
		contentPane.add(btnDelete);

		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearText();
			}
		});
		
		btnClear.setBounds(7, 446, 368, 26);
		contentPane.add(btnClear);

		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int row = table.rowAtPoint(e.getPoint());
				textFieldName.setText(Main.employees.get(row).getName());
				textHomeAdress.setText(Main.employees.get(row).getHomeAdress().getAdress());
				textHomeTown.setText(Main.employees.get(row).getHomeAdress().getTown());
				textHomeZip.setText(Main.employees.get(row).getHomeAdress().getCountry());
				textHomeZip.setText(Main.employees.get(row).getHomeAdress().getPhone());
				textHomeZip.setText(Main.employees.get(row).getWorkAdress().getAdress());
				textHomeZip.setText(Main.employees.get(row).getWorkAdress().getTown());
				textHomeZip.setText(Integer.toString(Main.employees.get(row).getWorkAdress().getZipCode()));
				textHomeZip.setText(Main.employees.get(row).getWorkAdress().getCountry());
				textHomeZip.setText(Main.employees.get(row).getWorkAdress().getPhone());
				textHomeZip.setText(Integer.toString(Main.employees.get(row).getDebt()));

			}
		});

		setVisible(true);
		setEnabled(true);

	}// end of constructor

	protected void clearText() {
		textFieldName.setText("");
		textHomeAdress.setText("");
		textHomeTown.setText("");
		textHomeZip.setText("");
		textHCountry.setText("");
		textHPhone.setText("");
		textWZipCode.setText("");
		textWPhone.setText("");
		textWCountry.setText("");
		textAmount.setText("");

	}

	private void addEmployee() {

		String name = textFieldName.getText();
		String homeAdress = textHomeAdress.getText();
		String homeTown = textHomeTown.getText();
		int homeZipCode = Integer.valueOf(textHomeZip.getText());
		String homeCountry = textHCountry.getText();
		String homePhone = textHPhone.getText();

		String workAdress = textWAdress.getText();
		String workTown = textWTown.getText();
		int workZipCode = Integer.valueOf(textWZipCode.getText());
		String workCountry = textWCountry.getText();
		String workPhone = textWPhone.getText();
		int debt = Integer.valueOf(textAmount.getText());

		for (Employee e : Main.employees) {
			if (e.getName().equals(name)) {// && e.getHomeAdress().getPhone().equals(homePhone)) {
				JOptionPane.showMessageDialog(btnSubmit,"Dublicate Employee Name","Error",JOptionPane.ERROR_MESSAGE);
				return;
			}
		}

		Employee emp = new Employee(name, homeAdress, homeTown, homeZipCode, homeCountry, homePhone, workAdress,
				workTown, workZipCode, workCountry, workPhone, debt);

		Main.employees.add(emp);
		for (Employee e : Main.employees) {
			e.Reminder();

		}

	}
	
	protected void delete(){
		
		//get table model 
		//DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		
		//delete row
		if(table.getRowCount() == 1) {
			model.removeRow(table.getSelectedRow());
			
		}else {
			if(table.getRowCount() == 0) {
				JOptionPane.showMessageDialog(this, "Table is empty");
			
		}else {
			JOptionPane.showMessageDialog(this, "choose a single row to delete");
			}
		}

	}
}
