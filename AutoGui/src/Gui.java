import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui extends JFrame {
	private JLabel apantisi = new JLabel("");
	private JPanel mousamas =new JPanel();
	private JTextField pedio = new JTextField();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
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
	public Gui() {
		


		
		JLabel lblNewLabel = new JLabel("Dose to onoma sou");
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblNewLabel.setBounds(37, 27, 174, 25);
		
		apantisi.setVisible(false);
		apantisi.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		apantisi.setBounds(76, 144, 599, 50);
		mousamas.add(apantisi);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 504);
		
		mousamas.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mousamas);
		mousamas.setLayout(null);
		mousamas.add(lblNewLabel);
		
	
		pedio.setBounds(230, 27, 222, 26);
		mousamas.add(pedio);
		pedio.setColumns(10);
		
		JButton koumpi = new JButton("Press");
		
		       // BHMA IV         //BHMA III         // BHMA I 
		koumpi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			// step II
				apantisi.setText("Kalos irthes sto programma file "+pedio.getText());
				apantisi.setVisible(true);			
			
			}
		});
		koumpi.setBounds(280, 98, 117, 29);
		mousamas.add(koumpi);
		
		
	}
	
	
}
