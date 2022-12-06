package Lesson7C;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class DeptEmployeeData {

	public static DeptEmployee[] getDeptData() {
		Professor p0 = new Professor("Joe",45000, LocalDate.of(1999,12,24));
		Professor p1 = new Professor("Bob",35000,LocalDate.of(1979,1,2));
		Professor p2 = new Professor("Anna",23000,LocalDate.of(2000,5,21));
		
		Secretary s0 = new Secretary("Joan",500.45,LocalDate.of(1987,2,15),10.0);
		Secretary s1 = new Secretary("Janet",400.56,LocalDate.of(1995,4,22),15.0);
		DeptEmployee[]  department = {p0,p1,p2,s0,s1};
		return department;

	}
	public static void main(String args[]) {
		DeptEmployee[] data = DeptEmployeeData.getDeptData();
		DeptEmployeeData  ob = new DeptEmployeeData();
		ob.mysort(data);
		System.out.println("Comparator as Local Inner class sorted by salary reversed");
		for(DeptEmployee e : data) {
			System.out.println(e);
		}
	}
	private void mysort(DeptEmployee[] persons) {
		class SalaryComparator implements Comparator<DeptEmployee>{
			@Override
			public int compare(DeptEmployee p1, DeptEmployee p2) {
				return Double.compare(p2.getSalary(), p1.getSalary());
			}
		}
		Arrays.sort(persons, new SalaryComparator());
	}
	
}
