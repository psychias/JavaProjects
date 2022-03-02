package model;

import java.util.ArrayList;

public class DBCd {
	
	public static ArrayList<Cd> lista = new ArrayList<Cd>();
	
	DBCd(){};
	
	public void storeCd(Cd cd) {
		lista.add(cd);
	}
	public ArrayList<Cd> getList(){
		return lista;
	}
	
	public ArrayList<Cd> offeringCds(){
		ArrayList<Cd> offLista = new ArrayList<Cd>();
		for(Cd cd:lista) {
			if(cd.isOffering() == true) {
				offLista.add(cd);
			}
		}
		return offLista;
	}
	
	public ArrayList<Cd> monthCds(int month){
		ArrayList<Cd> monthsCd = new ArrayList<Cd>();
		for(Cd cd:lista) {
			if(cd.getReleaseDate().substring(3,6).equals(month)) {
				monthsCd.add(cd);
			}
		}
		return monthsCd;
	}
	
	
	public double CdsMeanPrice() {
		double sum = 0.0;
		for(Cd cd:lista) {
			sum += cd.getPrice();
		}
		return sum/lista.size();
	}
	
	public String findCd(String title) {
		String s ="";
		
		for(Cd cd:lista) {
			if(cd.getTitle().equals(title)) {
				s += cd.print();
			}else {
				s += "The cd "+cd.getTitle() + " does not belong to the collection" + "/n "
						+ "The cd "+ cd.getTitle() +" does not belong to the collection";
			}
		}
		return s;
	}
	
	public String showCds(ArrayList<Cd> alist) {
		
		String s = "";
		
		for(Cd cd:alist) {
			s += cd.print();
		}
		return s;
	}
	

}
