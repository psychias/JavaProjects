import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Employee extends JFrame {

	private JPanel contentPane;
	
	private String name;
	private int id;
	private int balance;
	
	private ArrayList<Employee> lista = new ArrayList<Employee>();
	
	private JPanel mousamas = new JPanel();
	private JLabel apantisi = new JLabel();
	private JTextField pedio = new JTextField();
	
	
	
	
	
	
	Employee(String name, int id, int balance){
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
	
	//setters 
	
	public void setnewName(String name){
		this.name = name;
		
	}
	void setId(int id) {
		this.id = id;
		
	}
	void setBalance(int balance) {
		this.balance = balance;
		
	}
	
	//getters
	
	public String getNAme() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public int getBalance() {
		return balance;
	}
	
	
	public void addEmployee(Employee e) {
		lista.add(e);
	}
	
	public void getEmployee() {
		for(Employee em: lista) {
			System.out.println(em);
		}
	}
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee frame = new Employee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Employee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JLabel FirstLabel = new JLabel("Please write down your name ");
		
		
		
//		JLabel lblNewLabel = new JLabel("Dose to onoma sou");
//		lblNewLabel.setForeground(Color.MAGENTA);
//		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
//		lblNewLabel.setBounds(37, 27, 174, 25);
//		
//		apantisi.setVisible(false);
//		apantisi.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
//		apantisi.setBounds(76, 144, 599, 50);
//		mousamas.add(apantisi);
//		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 772, 504);
//		
//		mousamas.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(mousamas);
//		mousamas.setLayout(null);
//		mousamas.add(lblNewLabel);
//		
//	
//		pedio.setBounds(230, 27, 222, 26);
//		mousamas.add(pedio);
//		pedio.setColumns(10);
//		
//		JButton koumpi = new JButton("Press");
		
	}

}
