package sixClass;

public class Manager extends Employee {


	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(int employeeID, String name, String department, String designation, double salary) {
		super(employeeID, name, department, designation, salary);
	}

	@Override
	public double addBonus() {
		
		salary+=300*12;
		return salary;
	}

}
