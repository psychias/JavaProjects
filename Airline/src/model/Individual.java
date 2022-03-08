package model;

public class Individual {
	
	private String name;
	private String email;
	private String adress;
	private String nationality;
	private String category;
	
	
	public Individual(String name,String email, String adress, String nationality, String category) throws ExceptionHandling {
		
		if(name.isEmpty()) {
			new ExceptionHandling("Please enter your name");	
		}
		else if(name.length() < 1) {
			new ExceptionHandling("Please enter your full name");
		}
		else if (email.isEmpty()) {new ExceptionHandling("Please enter your email ");}
		else if (!email.contains("@")) {new ExceptionHandling("Please enter a valid email adress ");}
		else if(adress.isEmpty()) {new ExceptionHandling("Please enter an email Adress");}
		else if(adress.length() < 5) {new ExceptionHandling("Please enter an email Adress");}
		else if(nationality.length() < 5) {new ExceptionHandling("Please enter avalid nationality");}
		else if(nationality.isEmpty()) {new ExceptionHandling("Please enter a nationality");}
		else if(!category.equals("Business") || !category.equals("Individuall")) {
			new ExceptionHandling("Please enter a valid category");
		}
		else if(category.isEmpty()) {
			new ExceptionHandling("Please enter a category");
		}
		else {
		
			this.name = name;
			this.email = email;
			this.adress= adress;
			this.nationality = nationality;
			this.category = category;
			}
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
		
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	
	
	

}
