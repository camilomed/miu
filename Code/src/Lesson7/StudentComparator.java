package Lesson7;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{
	@Override
	public final int compare(Student std, Student other) {
		
		
		
		
		if (!(std.getClass().equals(other.getClass()))) {
			throw new ClassCastException("The objects don't belong to the same class");
			
		}
	else if (std.getStdID()< other.getStdID() ) {
			return -1;
			
		}
		else if (std.getStdID()==other.getStdID()) {
			return 0;
		}
		else if (std.getStdID()>other.getStdID()) {
			return 1;
		}
		
		return -1;
	}
	
}
