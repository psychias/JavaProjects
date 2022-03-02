package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



public class mainGui extends JFrame {

	private JPanel contentPane;
	private JLabel lblName;
	private JLabel lblPassword;
	private JTextField user;
	private JPasswordField password; 
	private JButton login;
	private int counter = 0;


	public mainGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblName = new JLabel("Enter your user name here -> ");
		lblName.setBounds(6, 45, 211, 25);
		contentPane.add(lblName);
		
		user = new JTextField();
		user.setBounds(229, 44, 184, 26);
		contentPane.add(user);
		user.setColumns(10);
		
		JLabel lblPassword = new JLabel("Enter your paasword here -> ");
		lblPassword.setBounds(6, 104, 184, 25);
		contentPane.add(lblPassword);
		
		password = new JPasswordField();
		password.setBounds(229, 103, 184, 26);
		contentPane.add(password);
		
		login = new JButton("Login");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userString = user.getText();
				int pwd = Integer.valueOf(password.getText());
				int limit = 3;
				String success = "";
				
				if(counter < 3) {
					counter ++;
					if(userString.equals("Takis") && pwd == 1234 ) {
						success += "Login Correct !";
						listaGui lista = new listaGui();
						
					}else {
						user.setText("");
						password.setText("");
						System.out.println("you have only " + (limit - counter)
								+ " tries !!");
				}
				}else {
					success.equals("you have no more tries");
				}System.out.println(success);
				
			}
		});
		login.setBounds(146, 204, 117, 29);
		contentPane.add(login);
		
		
		
			
		
		
		
		setVisible(true);
		enable(true);
		
	}
}
