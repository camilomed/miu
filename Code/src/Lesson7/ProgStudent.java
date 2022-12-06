package Lesson7;

import java.util.ArrayList;
import java.util.Collections;

public class ProgStudent extends Student {
public static void main(String[] args) {

	
	// Implementing Comparator

	Student std1 = new Student();
	std1.setStdID(10);
	std1.setStdName("Peter");
	
	Student std2 = new Student();
	std2.setStdID(1);
	std2.setStdName("Sarah");
	ArrayList <Student> lstd = new ArrayList();
	lstd.add(std1);
	lstd.add(std2);
	
	
	boolean found = false;
	//<Sami,Sara,Peter>
	//Sara
	

	
	for(Student st: lstd) {
		System.out.println(st.getStdName());
		}
	
	System.out.println("***********");
	
	
	
	
	Collections.sort(lstd, new StudentComparator()); 
	
	
	for(Student st: lstd) {
	System.out.println(st.getStdName());
	}
}
	
	
}
