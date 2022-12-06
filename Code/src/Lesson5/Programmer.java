package Lesson5;

import Lesson6.Employee;
import lesson1.main;

public class Programmer extends Employee {

	public Programmer() {
		
	}
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
	
}


