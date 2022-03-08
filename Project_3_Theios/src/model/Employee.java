package model;

import javax.swing.JOptionPane;

import exception.MyException;

public class Employee {
	
	private String name,text;
	private AdressInfo workAdress = new AdressInfo();
	private AdressInfo homeAdress = new AdressInfo();
	private int debt;
	private int reminder;
	
	public Employee(String name, AdressInfo workAdress, AdressInfo homeAdress, int debt) throws MyException{
		this.name = name;
		this.workAdress = workAdress;
		this.homeAdress = homeAdress;
		this.debt = debt;
		reminder = 0;
	}
	
	public Employee(String name, String home_adress, String home_town, int home_zipCode, String home_country,
					String home_phone, String work_adress, String work_town,int work_zipCode ,String work_country,
					String work_phone, int debt) throws MyException
	{
		if (name.isEmpty()) {
			throw new MyException("SYmplirose to onoma einai keno");
		}
		else if (home_adress.isEmpty()) {
			JOptionPane.showMessageDialog(null,  "home adress field is empty ");
			return;
		}
		else if (home_town.isEmpty()) {
			JOptionPane.showMessageDialog(null,  "home zip code field is empty ");
			return;
		}
		else if (home_zipCode == 0) {
			JOptionPane.showMessageDialog(null,  "home town field is empty ");
			return;
		}
		else if (home_country.isEmpty()) {
			JOptionPane.showMessageDialog(null,  "home country field is empty ");
			return;
		}
		else if (home_phone.isEmpty()) {
			JOptionPane.showMessageDialog(null,  "home phone number field is empty ");
			return;
		}
		
		else if (work_adress.isEmpty()) {
			JOptionPane.showMessageDialog(null,  "work adress field is empty ");
			return;
		}
		else if (work_town.isEmpty()) {
			JOptionPane.showMessageDialog(null,  "work town field is empty ");
			return;
		}
		else if (work_zipCode == 0) {
			JOptionPane.showMessageDialog(null,  "work country is empty ");
			return;
		}
		else if (work_country.isEmpty()) {
			JOptionPane.showMessageDialog(null,  "work zip code field is empty ");
			return;
		}
		else if (work_phone.isEmpty()) {
			JOptionPane.showMessageDialog(null,  "work phone number field is empty ");
			return;
		}
		
		else if (debt == 0) {
			JOptionPane.showMessageDialog(null,  "work phone number field is empty ");
			return;
		}
		else {

		this.name = name;
		homeAdress.setAdress(home_adress);
		homeAdress.setTown(home_town);
		homeAdress.setZipCode(home_zipCode);
		homeAdress.setCountry(home_country);
		homeAdress.setPhone(home_phone);
		
		workAdress.setAdress(work_adress);
		workAdress.setTown(work_town);
		workAdress.setZipCode(work_zipCode);
		workAdress.setCountry(work_country);
		workAdress.setPhone(work_phone);
		
		this.debt = debt;
		reminder = 0;
		}
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public AdressInfo getWorkAdress() {
		return workAdress;
	}

	public void setWorkAdress(AdressInfo workAdress) {
		this.workAdress = workAdress;
	}

	public AdressInfo getHomeAdress() {
		return homeAdress;
	}

	public void setHomeAdress(AdressInfo homeAdress) {
		this.homeAdress = homeAdress;
	}

	public int getDebt() {
		return debt;
	}

	public void setDebt(int debt) {
		this.debt = debt;
	}

	public int getReminder() {
		return reminder;
	}

	public void setReminder(int reminder) {
		this.reminder = reminder;
	}

	public void pay(int amount) {
		this.debt = this.debt - amount;
	}
	
	//setter for reminder
	public void reminderChecker() {
		if(reminder>0) {
			reminder++;
			
		}else {reminder = 0;}
	}
	
	public void receipt(int amount) {
		
		System.out.println("------------------- Receipt ------------------------");
		System.out.println(name + " paid " + (amount - debt));
		homeAdress.getFullAdress();
		System.out.println("The rest is " + debt + " euro");
		
	}
	
	public void payment(int amount) {
		pay(amount);
		receipt(debt);
	}
	
	public void message(AdressInfo adress) {
		System.out.println("------------------- Remind "+ reminder + "------------------------");
		System.out.println(name);
		adress.getFullAdress();
		System.out.println("Please pay " + debt +" euro by the end of the month" );
		//reminder ++;
		
	}
	
	public void RecordedMessage(AdressInfo adress) {
		System.out.println("------------------- Recorder Message ------------------------");
		System.out.println("------------------- Remind "+ reminder + "------------------------");
		System.out.println("I am calling " + adress.getPhone());
		System.out.println(name);
		System.out.println("Please pay " + debt + " euro by the end of the month");
		//reminder ++;
	}
	
	public void Reminder() {
		if(debt>0 && reminder ==0) {
			message(workAdress);
			reminder ++;
		}
		if(debt>0 && reminder ==1) {
			message(homeAdress);
			reminder ++;
		}
		if(debt>0 && reminder ==2) {
			RecordedMessage(workAdress);
			reminder ++;
		}
		if(debt>0 && reminder == 3) {
			RecordedMessage(homeAdress);
			reminder ++;
		}else {
			RecordedMessage(homeAdress);
			text+="-------------- IMPORTANT NOTICE --------------------";
			System.out.println("Your debt will be subtracted from your salary ");
		}
		
				
	}  

	

}
