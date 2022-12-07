package sevenClass3;

public class Student implements Comparable<Student> {
	
	private int IDNumber;
	private String lastName;
	

	public int getIDNumber() {
		return IDNumber;
	}


	public void setIDNumber(int iDNumber) {
		IDNumber = iDNumber;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
	        return ( lastName + ", " + IDNumber );
	    }

	/**
	 * @param iDNumber
	 * @param lastName
	 */
	public Student(int iDNumber, String lastName) {
		super();
		IDNumber = iDNumber;
		this.lastName = lastName;
	}


	@Override
	public int compareTo(Student o) {
//			if(IDNumber== o.IDNumber) 
//			
//			return 0;
//		else if(IDNumber>o.IDNumber)return 1;
//		return -1;
		return toString().compareTo(o.toString());

	}

}
