package Lesson5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Employee {

	
	//Constructor
		public Employee() {
			System.out.println("You have created an object from the Employee Class");
		}
		
		public Employee(String name) {
			System.out.println("This is "+name);
			this.Name = name;
			
			
		}
		
		public Employee(String name,float salary) {
			this.Name = name;
			this.BasicSalary = salary;
			
			
		}
		//Global variables can be accessed by any method in the class
		private String Name = "";
		private float BasicSalary = 0f;
		public static float tax = 0f;
		private int weeklyhours = 40;
		
		
		protected Address address;
		
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");

	
		
	
		
		public void setName(String _Name) {
			Name = _Name;
		}
		public String getName() {
			return Name;
		}
		
		public void setSalary(float _Salary) {
			BasicSalary = _Salary;
		}
		public float getSalary() {
			return BasicSalary;
		
		}
		
		
		public void setAddress(Address address) {
			this.address = address;
		}
		public Address getAddress() {
			return address;
		}
		
		
		
		public void setWeeklyhours(int weeklyhours) {
			this.weeklyhours = weeklyhours;
		}
		public int getWeeklyhours() {
			return weeklyhours;
		}
		
		
		public void PrintInfo() {
			//you only have to do changes once using OOP 
			System.out.println("Your name is " + Name + ", your salary is "+ BasicSalary + "$");
			
		}
		
		public void PrintInfoWithTax() {
			float tax=0;
			tax = BasicSalary * 0.25f;
			
			
			System.out.println("Your name is " + Name + ", your salary is "+ BasicSalary + "$, you sould pay "+ tax + " as taxes");
			
		}


		public  Period calculateAge(LocalDate birthday) {
			LocalDate today = LocalDate.now();
			return Period.between(birthday, today); // Return periods as Year, Month and Days
		}

		public  LocalDate getBirthday() {
			Scanner scanner = new Scanner(System.in);
			LocalDate birthday;
			while (true) {
				System.out.println("Please enter your birthday " + "in yyyy-MM-dd format (e.g. 1980-9-28): ");
				String input = scanner.nextLine();
				try {
					birthday = LocalDate.parse(input, formatter);

					return birthday;

				} catch (DateTimeParseException e) {
					System.out.println("Error! Please try again");
				}
			}
		}
	
	public void EmpAddress() {
		
		System.out.println(this.Name + " lives in " + address.StaticAddress());
		//System.out.println(this.Name + " lives in " + address.ObjAddress());
		
		
	}
	
	
}

