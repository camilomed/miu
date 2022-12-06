package Lesson6;

import lesson1.main;

public class Programmer extends Employee {

	

	
	float Bonus = 0;//Bonus
	
	public void setBonus(float bonus) {
		Bonus = bonus;
	}
	public float getBonus() {
		return Bonus;
	}
	
	private int weeklyhours = 50;
	
	public void setWeeklyhours(int weeklyhours) {
		this.weeklyhours = weeklyhours;
	}
	public int getWeeklyhours() {
		return weeklyhours;
	}
	
	public float TotalSalary() {
		
		return this.Bonus + super.getSalary();
		
		
	}
	
public float TotalSalary(int Bonus) {
		
		return Bonus + super.getSalary();
		
		
	}


	public float TotalSalary(float taxrate) {
		
		float totalsal = this.Bonus + super.getSalary();
		float taxvalue = totalsal*taxrate;
		return totalsal-taxvalue;
		
	}
public float TotalSalary(int Bonus,float taxrate) {
		
		float totalsal = Bonus + super.getSalary();
		float taxvalue = totalsal*taxrate;
		return totalsal-taxvalue;
		
	}
	
	
	@Override
	public  void PrintInfo()
	{
		float sal = this.Bonus + super.getSalary();
		
		System.out.println("Your name is " + super.getName() + ", your total salary is "+ sal + "$");
		
	}
	
	// YOU CANNOT OVERRIDE FINAL METHODS
	
	
	  //@Override public void PrintInfoWithTax() { tax = BasicSalary * 0.25f;
	  //System.out.println("Your name is " + Name + ", your salary is "+ BasicSalary
	  //+ "$, you sould pay "+ tax + " as taxes");
	  
	  //}
	 
}


