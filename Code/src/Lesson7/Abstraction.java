package Lesson7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Abstraction {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		c.setColor("Red");
		
		//Shape sh = new Shape();// ERROR
		
		
	
		
		Shape s= new Circle();//In a real scenario, object is provided through method, e.g., getShape() method  
		s.draw(); 
		
		
		//s.color=";";
		
		Rectangle r = new Rectangle();
		r.draw();
		
		
		
		
		//setting values for the abstract class
		
		c.setColor("Red");
		
		
		s.setColor("Blue");
		
		r.setColor("Green");
		System.out.println(c.getColor());
		System.out.println(s.getColor());
		System.out.println(r.getColor());
		
		
		
		//System.out.println(Shape.Area()) ;
	
		
		//Interface is 100% Abstraction
		
		Triangle t = new Triangle();
		t.setColor("Red");
		t.draw();
		
		
		
		System.out.println(t.getIsRightTriangle());
		Triangle t1 = new Triangle();
		
		
		t1.setColor("Green");
		t1.draw();
		System.out.println(t1.getIsRightTriangle());
		
		
		
		
		//Upcasting an interface
		Drawable t2 = new Triangle();
		t2.setColor("Yellow");
		t2.draw();
		//System.out.println(t2.getIsRightTriangle());//Error
		
		
		//Downcasting
		Triangle t3 = (Triangle) t2;
		t3.setIsRightTriangle(true);
		System.out.println(t3.getIsRightTriangle());
		
		
		
		//Implementing multiple interfaces 
		Square sq = new Square();
		sq.setColor("Blue");
		sq.draw();
		sq.print();
		
		
		//Extending a class and implementing multiple interfaces 
		//and extending an interface
		Hexagon h = new Hexagon();
		h.setColor("red");
		h.draw();
		h.print();
		h.coloredprint();
		
		
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
		
		
		Collections.sort(lstd, new StudentComparator()); 
		
		
		for(Student st: lstd) {
		System.out.println(st.getStdName());
		}
		//How to make it sort the values in reverse order?
		
	}

}
