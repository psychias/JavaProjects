import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
                 // BHMA I
public class Gui extends JFrame{
	
	// BHMA II
	JPanel mousama = new JPanel();
	JLabel etiteta = new JLabel("those to onoma");
	JLabel apantisi = new JLabel();
	JTextField pedio = new JTextField(30);
	JButton koumpi = new JButton("ok");
	
	
	
	
	public Gui(){
		// BHMA III
		mousama.add(etiteta);
		mousama.add(pedio);
		mousama.add(koumpi);
		mousama.add(apantisi);
		apantisi.setVisible(false);
		// BHMA 4
		this.setContentPane(mousama);
		// ----------------  STEP III DIMIOURGO ENA ANTIKEIMENO TIS CLASS Afti
		Afti roufianos = new Afti();
		
		// ----------------  STEP IV SYNDEO TO GRAFIKO ANTIKEIMENO POU THA 
		//                   AKROASTO ME TON ROYFIANO 
		koumpi.addActionListener(roufianos);
		
		this.setTitle("To parathiro");
		this.setSize(400, 400);
		this.setEnabled(true);
		this.setVisible(true);
	}

//--------------------------------------	STEP I  DIMIOYRGO TIN CLASS AFTI
	class Afti implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// --------------------------    STEP II GRAFO TON KODIKA ANTIDRASIS
			// System.out.println("ox ponesa");
			apantisi.setText("Kalos irthes sto programma file "+pedio.getText());
			apantisi.setVisible(true);
		}
		
	}
	
}
