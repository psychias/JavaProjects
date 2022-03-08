package main;

import java.util.ArrayList;

import gui.Customer;
import model.ExceptionHandling;
import model.Individual;

public class Main {
	
	
	public static ArrayList<Individual> lista = new ArrayList<Individual>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			lista.add(new Individual("Takis","kostas@gmail.com","Athsn","Greek","Business"));
			lista.add(new Individual("Makis","kostas@gmail.com","Athsn","Greek","Business"));
			lista.add(new Individual("Lakis","kostas@gmail.com","Athsn","Greek","Business"));
		} catch (ExceptionHandling e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		new Customer();
	}

}
