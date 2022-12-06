package lesson1;

import java.util.Scanner;

public class Input3 {
public static void main(String[] args) {
	
	System.out.println("***************");
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("What is your name?");
	
	
	String name =sc.nextLine();
	
	
	System.out.println("Hi " + name);
	
	System.out.println("Enter your age");
	int age=sc.nextInt();
	
	
	System.out.println("You are " + age + " years old.");
	
	
	System.out.println("Enter your salary");
	float salary=sc.nextFloat();
	
	
	System.out.println("Your salary is " +  salary);
	
}
}
