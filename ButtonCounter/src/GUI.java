import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {
	
	
	public GUI(){
		JFrame frame = new JFrame(); // window
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(400,400,400,400));
		panel.setLayout(new GridLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("to proto GUI");
		frame.pack();
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI();
	}

}
