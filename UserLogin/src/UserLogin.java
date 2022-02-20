import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UserLogin {

	// frame
	// 2 panel -> usernname , password
	//
	// 1 button
	/// 3 labels
	// textfield

	private  JFrame frame;
	private  JPanel panel;
	private  JButton button;
	private  JTextField user;
	private  JPasswordField password;
	private  JLabel userText;
	private  JLabel passwordText;
	private  JLabel success;
//	private static JButton clickCounter;
	private int counter = 0;
	private  JLabel tries;

	public UserLogin() {

//		frame = new JFrame();
//		frame.setSize(300, 300);
		frame = new JFrame();
		frame.setSize(300, 300);
		// setBounds is used to define the bounding rectangle of a component.
		// This includes it's position and size

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();

		// fields
		user = new JTextField(20);
		user.setBounds(100, 20, 165, 25);
		password = new JPasswordField();
		password.setBounds(100, 40, 165, 25);

		// labels
		userText = new JLabel("User");
		userText.setBounds(10, 20, 80, 25);
		passwordText = new JLabel("Password");
		passwordText.setBounds(10, 40, 80, 25);

		// button label + button
		button = new JButton("Log in");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				
				String userName = user.getText();
				String passwd = password.getText();
				int limit = 3;
				if (counter < 3) {
					counter++;
					if (userName.equals("Takis") && passwd.equals("12345")) {
						success.setText("This is the correct password !!");

					} else {
						user.setText(null);
						password.setText(null);
						tries.setText("You have:  " + (limit - counter) + " tries left");
					}
				} else {
					success.setText("You have no more tries ... :");
				}
				System.out.println(success);
			}

		});

		success = new JLabel();
		success.setBounds(10, 110, 300, 25);

		tries = new JLabel("Number of tries: 0");
		tries.setBounds(10, 140, 300, 25);

		frame.getContentPane().add(panel);
		panel.setLayout(null);

		panel.add(userText);
		panel.add(user);
		panel.add(passwordText);
		panel.add(password);
		panel.add(button);
		panel.add(success);
		panel.add(tries);
		
		JButton btnNewButton = new JButton("New button");
		// clasPoyAntdra(btnNewButton)
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Clients();
			}
		});
		btnNewButton.setBounds(166, 203, 117, 29);
		panel.add(btnNewButton);
		frame.setVisible(true);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UserLogin();
	}
}
