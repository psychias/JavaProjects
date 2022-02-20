import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class GUI implements ActionListener {

	
	int counter = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	//private JButton button;
	
	public GUI(){
		
		frame = new JFrame();
		frame.setSize(800,800);
		panel = new JPanel();
		JButton button = new JButton("Click me !");
		label = new JLabel("Number of clicks : 0");
		
		button.addActionListener(this);
		
		
		frame.setTitle("First GUI");
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(label);
		panel.setBorder(new TitledBorder("The title of the border"));
		frame.add(panel,BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		
		//The pack method sizes the frame so that all its contents are 
		//at or above their preferred sizes. 
//		An alternative to pack is to establish a frame size explicitly by calling
//		setSize or setBounds (which also sets the frame location). 
//		In general, using pack is preferable to calling setSize, 
//		since pack leaves the frame layout manager in charge of the frame size, 
//		and layout managers are good at adjusting to platform dependencies 
//		and other factors that affect component size.
		
		frame.setVisible(true);
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(counter < 15) {
			counter ++;
			label.setText("Number of clicks: " + counter);}
		else {label.setText("your clicks are over!");}
		}

}
