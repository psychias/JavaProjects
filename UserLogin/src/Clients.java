import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Clients extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Clients() {
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Clients Handle");
		lblNewLabel.setBounds(75, 23, 271, 34);
		contentPane.add(lblNewLabel);
		setVisible(true);
		setEnabled(true);
	}
}
