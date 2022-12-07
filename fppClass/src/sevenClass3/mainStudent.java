package sevenClass3;

import java.util.Arrays;
import java.util.Comparator;


public class mainStudent  {
	
	public static void main(String[] args) {
		listStudent();
	}

	private static void listStudent() {
		Student [] st= new Student[4];
		 st[0] = new Student(1234, "medina"); 
		 st[3] = new Student(1237, "lizcano"); 
		 st[1] = new Student(1235, "sarmient"); 
		 st[2] = new Student(1236, "rubiano"); 
		 
			Arrays.sort(st,new Comparator<Student>() {

				@Override
				public int compare(Student o1, Student o2) {
					return o1.compareTo(o2);
				}
			});
		
			for (int i=0; i<st.length;i++)
			    System.out.println(Arrays.asList(st[i].toString()));
	}


}
