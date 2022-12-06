package sixClass;

public class Clerk extends Employee{
	
	
	public Clerk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Clerk(int employeeID, String name, String department, String designation, double salary) {
		super(employeeID, name, department, designation, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double addBonus() {
		
		salary+=100*12;
		return salary;
	}

}
