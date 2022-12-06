package lesson1;

import java.util.Scanner;

public class main {
	

	public static void main(String[] args) {
		
		//Single line comment
		/*Multi 
		 * line 
		 * comment
		 */
	
	    System.out.println("This is my first program");
	    System.out.println("*******************");
		
	    
	    int a = 10;
		int b = 20;
		int c = a+b;
		
		
		
		
		
		
		
		System.out.println(c);
		
		System.out.println("Primitive data types");
		System.out.println("primitive data types are system defined");
		System.out.println("In primitive data type, variables can store only one value at a time");
		System.out.println("All the data for primitive type variables are stored on the stack memory");
		
		
		boolean IsOkay = true; //1 bit
		
		
		System.out.println(IsOkay);
		byte mybyte = 15;// 1 byte of integers max 127 min -128
		
		
		
		System.out.println(mybyte);
		char mychar = 's'; //2 bytes, "a" will give an error
		
		
		
		System.out.println(mychar);
		
		short myshort = 127;//2 bytes from -2^15 to 2^15 -1
		
		
		
		System.out.println(myshort);
		int myint = 500; // 4 bytes from -2^31 to 2^31 -1
		
		
		System.out.println(myint);
		long mylong = -256500; //8 bytes from -2^63 to 2^63 -1
		
		
		
		System.out.println(mylong);
		float myfloat = 500.654f; // 4 bytes from -2^31 to 2^31 -1 MUST CAST USING f
		
	
		
		
		System.out.println(myfloat);
		double mydouble = -2565000.545; //8 bytes from -2^63 to 2^63 -1
		
		System.out.println(mydouble);	
		//Choose carefully to make your app more efficient
		System.out.println("*******************");
		//Widening: Converting a lower data type to a higher data type
		//it's done automatically. WHY?
		float f=a;  
		System.out.println(a);  
		System.out.println(f); 
		
		//Narrowing (Typecasting): Converting a higher data type to a lower data type 
		float fnum=10.5f;  
		//int a=f;//Compile time error  
		
		
		int anum=(int)fnum;  
		System.out.println(fnum);  
		System.out.println(anum);  
		
	
	  

	    
}}
	
