package sixClass;


public class Employee {
	
	public int employeeID;
	public String name ;
	public String department;
	public String designation;
	public double salary;
	
	
	
	public Employee() {
	}
	public Employee(int employeeID, String name, String department, String designation, double salary) {
		super();
		this.employeeID = employeeID;
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public  String toString() {
		return this.name + " Salary:  " +
	this.salary ;
	
	}	
	
	@Override
	public final boolean equals(Object otherObject)
	{
		if(otherObject == null)
	    return false;
	  else if(getClass( ) != otherObject.getClass( ))
	    return false;
	  else
	  {
	    Employee otherEmployee = (Employee)otherObject;
	    return (name.equals(otherEmployee.getName())   );
	  }
		
	}
	
	public double addBonus() {
		salary+=200*12;
		return salary;
	}
	

}
