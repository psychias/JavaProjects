package main;

import java.util.ArrayList;

import GUI.EmployeeGui;
import model.Employee;

public class Main {

	
	public static ArrayList<Employee> employees = new ArrayList<Employee>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employees.add(new Employee("Makis","papa 18","athens",13642,"Greece","210894545","Seari 2","brussels",34234,"Belgium","3333333",1200));
		employees.add(new Employee("Kakis","Kapa 18","athens",13642,"Greece","210894545","Seari 2","brussels",34234,"Belgium","3333333",1200));
		employees.add(new Employee("Lakis","Lapa 18","athens",13642,"Greece","210894545","Seari 2","brussels",34234,"Belgium","3333333",1200));
		employees.add(new Employee("Sakis","Xapa 18","athens",13642,"Greece","210894545","Seari 2","brussels",34234,"Belgium","3333333",1200));
//		public Employee(String name, String home_adress, String home_town, int home_zipCode, String home_country,
//				String home_phone, String work_adress, String work_town,int work_zipCode ,String work_country,
//				String work_phone, int debt) 
//{
		new EmployeeGui();
		

	}

}
