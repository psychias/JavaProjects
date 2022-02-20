import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Employee {
	
	//4 labels
	//3 fields
	//1 buton
	
	//Employ
	//name
	//salary
	//expences
	
	//money -> salary - expenses
	
	private static JFrame frame;
	private static JPanel panel;
	private static JButton button;
	private static JLabel label;
	
	
	

	public static void main(String[] args) {
		
		
		frame = new JFrame();
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		frame.add(panel);
		
		JLabel titel = new JLabel("Employee");
		titel.setBounds(10,20,80,25);
		
		//Labels and fields 
		
		//name
		//salary
		//expences
		
		JLabel name = new JLabel("User Name ");
		name.setBounds(10,30,80,25);
		JTextField userName = new JTextField();
		userName.setBounds(100,30,80,25);
		
		
		JLabel salary = new JLabel("Salary ");
		salary.setBounds(10,40,80,25);
		JTextField userSalary = new JTextField();
		
		JLabel expenses = new JLabel("Expenses ");
		JTextField userExpenses = new JTextField();
		
		
		
		
		
		panel.add(titel);
		panel.add(name);
		panel.add(userName);
		panel.add(salary);
		panel.add(userSalary);
		panel.add(expenses);
		panel.add(userExpenses);
		
		frame.setVisible(true);
		
		

	}

}
