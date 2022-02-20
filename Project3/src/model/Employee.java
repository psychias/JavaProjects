package model;

public class Employee {
	
	private String name;
	private AdressInfo workAdress = new AdressInfo();
	private AdressInfo homeAdress = new AdressInfo();
	private int debt;
	private int reminder;
	
	public Employee(String name, AdressInfo workAdress, AdressInfo homeAdress, int debt) {
		super();
		this.name = name;
		this.workAdress = workAdress;
		this.homeAdress = homeAdress;
		this.debt = debt;
		reminder = 0;
	}
	
	public Employee(String name, String home_adress, String home_town, int home_zipCode, String home_country,
					String home_phone, String work_adress, String work_town,int work_zipCode ,String work_country,
					String work_phone, int debt) 
	{
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
			System.out.println("-------------- IMPORTANT NOTICE --------------------");
			System.out.println("Your debt will be subtracted from your salary ");
		}
		
				
	}  

	

}
