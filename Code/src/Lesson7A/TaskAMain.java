package Lesson7A;

import java.util.Arrays;
public class TaskAMain {
	public static void main(String[] args) {
		DeptEmployee[] data = DeptEmployeeData.getDeptData();
		Arrays.sort(data, new NameComparator());
		System.out.println("Comparator outside by name");
		for(DeptEmployee e : data) {
			System.out.println(e);
		}
	}

}
