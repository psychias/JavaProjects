package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import model.Cd;
import model.DBCd;

public class listaGui extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model;

	//add clear button
	//add delete button
	
	
	
	public listaGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(67, 208, 299, -160);
		String[] colNames = {"Title","Singer","Play Time","Tracks","Release day",
				"Price","Offering"};
		model = new DefaultTableModel(colNames,0);
		for(Cd cd:DBCd.lista) {
			Object[] cds = {cd.getTitle(),cd.getSinger(),cd.getPlayingTime()
					,cd.getTracks(),cd.getReleaseDate(),cd.getPrice(),cd.getOffering()};
		}
		table.setModel(model);
		contentPane.add(table);
		
		setVisible(true);
		enable(true);
		
	}
}
