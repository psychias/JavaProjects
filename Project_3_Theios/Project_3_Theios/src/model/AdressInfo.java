package model;

public class AdressInfo {
	
	private String adress;
	private String town;
	private int zipCode;
	private String country;
	private String phone;
	
	

	public AdressInfo() {}
	public AdressInfo(String adress, String town, int zipCode, String country, String phone) {
		super();
		this.adress = adress;
		this.town = town;
		this.zipCode = zipCode;
		this.country = country;
		this.phone = phone;
	}
	
	public void updateAdressInfo(String adress, String town,int zipCode ,String country,String phone) {
		this.adress = adress;
		this.town = town;
		this.zipCode = zipCode;
		this.country = country;
		this.phone = phone;
		
	}
	//adress,town, country zipCode
	public String getFullAdress() {
		if(!adress.equals(null) && !town.equals(null) && !country.equals(null) && zipCode != 0 ) {
			return adress + " " + town + " " + country + " " + String.valueOf(zipCode);
		}else {return "Unkown adress";}
	}
	
	
	
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	

}
