package Lesson6;


public class Polymorphism {

public static void main(String[] args) {
			
	Employee emp = new Employee();
	emp.setName("Sarah");
	emp.setSalary(2000);
	emp.PrintInfo();
	
	Programmer prog = new Programmer();
	prog.setName("Peter");
	prog.setSalary(1000);
	prog.setBonus(2000);
	prog.PrintInfo();
	
	
	FullStackDev FSD = new FullStackDev();
	FSD.setName("Ali");
	FSD.setSalary(1000);
	FSD.setBonus(3000);
	//Inheriting an overridden method
	FSD.PrintInfo();
	
	//Overloading
	System.out.println(prog.TotalSalary());
	System.out.println(prog.TotalSalary(0.2f));
	System.out.println(prog.TotalSalary(1000));
	System.out.println(prog.TotalSalary(1000,0.25f));
	
	
	
	
	//Upcasting OR DYNAMIC BINDING
	//It is a way to write general methods so the parent class can access overridden implementations from the child class
	
	
	Employee emp2  = new Employee();
	
	
	
	emp2.setName("John");
	
	emp2.PrintInfo();
	
	
	emp2.setSalary(2340);
	
	Programmer prog2 = new Programmer();
	
	prog2.TotalSalary();
	
	Employee emp3 = new Programmer();
	emp3.PrintInfo();
	Programmer prog4=(Programmer) emp2;
	
	
	
	System.out.println(emp3.equals(emp2));
	
	
	
	
	
	
	
	emp3.setName("Peter");
	emp3.setSalary(2000);
	
	
	EmpSal(emp2);
	
	
	
	
	EmpSal(emp3);
	
	
	EmpSal(prog);
	
	
	
	WebDeveloper web = new WebDeveloper();
	web.setName("Sara");
	web.setSalary(3500);
	EmpSal(web);
	
	
	//.toString() returns a string representation of the object
	// we need to override toString() method
	System.out.println(emp.toString());
	
	
	//Overriding equals
	
	System.out.println(emp.equals(web));
	
}

public static  void EmpSal(Employee emp) {
	
	emp.PrintInfo();

	
	//Error
	
	
	//System.out.println(emp.TotalSalary());
	
	
	
	
	
	
	//we need to downcast 
	//but it will give an exception if we didn't pass a Programmer object
	
	Programmer prog1 = (Programmer) emp;
		
		
		
	System.out.println(prog1.TotalSalary());
	
	emp.setName("Peter");
	
	//so we need to check if it is a Programmer object first
	if (emp instanceof Programmer) {
	System.out.println("You have performed downcasting here");
	
	
	Programmer prog = (Programmer) emp;
	
	Programmer prog2 = new Programmer();
	
	
	
	prog.setName("Sara");
	System.out.println(prog.TotalSalary());
	System.out.println(emp.getName());
	
	}
	
	
	if (emp instanceof WebDeveloper) {
		System.out.println("Downcasting to WebDeveloper");
		WebDeveloper web = (WebDeveloper) emp;
		
		web.CanWorkOnline();
		
	}
	
}


}
