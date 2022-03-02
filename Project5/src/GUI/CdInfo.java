package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Cd;
import model.DBCd;

public class CdInfo extends JFrame {

	private JPanel contentPane;
	
	private JLabel lblTitle;
	private JLabel lblSinger;
	private JLabel lblPlayTime;
	private JLabel lblTracks;
	private JLabel lblReleaseDay;
	private JLabel lblPrice;
	private JLabel lblOffering;
	
	
	private JTextField txtTitle;
	private JTextField txtSinger;
	private JTextField txtPlayTime;
	private JTextField txtTracks;
	private JTextField txtReleaseDay;
	private JTextField txtPrice;
	private JTextField txtOffering;
	
	private JButton append;
	private JButton btnshowList;
	private JButton btnExit;
	
	
	
	public CdInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setBounds(17, 39, 61, 16);
		contentPane.add(lblTitle);
		
		JLabel lblSinger = new JLabel("Singer");
		lblSinger.setBounds(17, 67, 61, 16);
		contentPane.add(lblSinger);
		
		JLabel lblPlayTime = new JLabel("PlayTime");
		lblPlayTime.setBounds(17, 95, 61, 16);
		contentPane.add(lblPlayTime);
		
		JLabel lblTracks = new JLabel("Tracks");
		lblTracks.setBounds(17, 123, 61, 16);
		contentPane.add(lblTracks);
		
		JLabel lblReleaseDay = new JLabel("ReleaseDay");
		lblReleaseDay.setBounds(17, 151, 61, 16);
		contentPane.add(lblReleaseDay);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(17, 179, 61, 16);
		contentPane.add(lblPrice);
		
		JLabel lblOffering = new JLabel("Offering");
		lblOffering.setBounds(17, 208, 61, 16);
		contentPane.add(lblOffering);
		
		txtTitle = new JTextField();
		txtTitle.setBounds(90, 34, 130, 26);
		contentPane.add(txtTitle);
		txtTitle.setColumns(10);
		
		txtSinger = new JTextField();
		txtSinger.setBounds(90, 62, 130, 26);
		contentPane.add(txtSinger);
		txtSinger.setColumns(10);
		
		txtPlayTime = new JTextField();
		txtPlayTime.setBounds(90, 90, 130, 26);
		contentPane.add(txtPlayTime);
		txtPlayTime.setColumns(10);
		
		txtTracks = new JTextField();
		txtTracks.setBounds(90, 118, 130, 26);
		contentPane.add(txtTracks);
		txtTracks.setColumns(10);
		
		txtReleaseDay = new JTextField();
		txtReleaseDay.setBounds(90, 146, 130, 26);
		contentPane.add(txtReleaseDay);
		txtReleaseDay.setColumns(10);
		
		txtPrice = new JTextField();
		txtPrice.setBounds(90, 174, 130, 26);
		contentPane.add(txtPrice);
		txtPrice.setColumns(10);
		
		txtOffering = new JTextField();
		txtOffering.setBounds(90, 203, 130, 26);
		contentPane.add(txtOffering);
		txtOffering.setColumns(10);
		

		
		append = new JButton("Append");
		contentPane.add(append);
		append.setBounds(232, 39, 194, 26);
		
		btnshowList = new JButton("Show list ");
		btnshowList.setBounds(232, 138, 187, 29);
		btnshowList.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				listaGui lista= new listaGui();
				
			}});
		contentPane.add(btnshowList);
		
		btnExit = new JButton("Exit");
		btnExit.setBounds(309, 223, 117, 29);
		contentPane.add(btnExit);
		append.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addCd();
				
			}});
		setVisible(true);
		enable(true);
	}
	
	
	 private void addCd() {
		
		 String title =  txtTitle.getText();
		 String singer =  txtSinger.getText();
		 int playTime =  Integer.valueOf(txtPlayTime.getText());
		 int tracks =  Integer.valueOf(txtTracks.getText());
		 String releaseDay =  txtReleaseDay.getText();
		 int price =  Integer.valueOf(txtPrice.getText());
		 boolean offering = Boolean.valueOf(txtOffering.getText());
		 
		 
		 Cd cd = new Cd(title,singer,playTime,tracks,releaseDay,price);
		 
		 for(Cd cds: DBCd.lista) {
			 DBCd.lista.add(cds);
		 }
		
	}
}
