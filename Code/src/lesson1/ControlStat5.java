package lesson1;

import java.util.Scanner;

public class ControlStat5 {
public static void main(String[] args) {

	
	
	System.out.println("Control Statements");
	Scanner sc2=new Scanner(System.in);
	
	System.out.println("Enter num1");
	int num1 =sc2.nextInt();
	
	
	System.out.println("Enter num2");
	int num2 =sc2.nextInt();
	
	
	if (num1>num2) {
		System.out.println("Num 1 is greater than num 2");
	}
	
	
	
	
	
	if (num1> num2) {
		System.out.println("Num 1 is greater than num 2");
	}
	else
	{
		System.out.println("Num 2 is greater than num 1");
		
	}
	
	
	
	if (num1>num2) {
		System.out.println("Num 1 is greater than num 2");
		
		
		
	}
	else if(num1 < num2) {
		System.out.println("Num 2 is greater than num 1");
	}
	else {
		System.out.println("Num 1 and num 2 are equal");
	}
	
	
	
	
  
//Exercise: Find the max number among 3 numbers
System.out.println("Switch");
 int number=50;  
    //Switch expression  
    switch(number){  
    //Case statements  
    case 10: System.out.println("10");  
    break;  
    case 20: System.out.println("20");  
    break;  
    case 30: System.out.println("30");  
    break;  
    //Default case statement  
    default:System.out.println("Not in 10, 20 or 30");  
    }  
    
    
}
}
