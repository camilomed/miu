package Lesson3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibo {
	static BufferedReader keyboard = new
            BufferedReader(new InputStreamReader(System.in));

   public static void main(String[] args) throws IOException
   {
  	  int firstFibNum;
  	  int secondFibNum;
  	  int nth;

  	  System.out.print("Enter the first Fibonacci number: ");
       firstFibNum = Integer.parseInt(keyboard.readLine());
 	  System.out.println();

       System.out.print("Enter the second Fibonacci number: ");
       secondFibNum = Integer.parseInt(keyboard.readLine());
       System.out.println();

    	  System.out.print("Enter the desired Fibonacci number: ");
   	  nth = Integer.parseInt(keyboard.readLine());
 	  System.out.println();

    	  System.out.println("The Fibonacci number at position "
                   + nth + " is: "
	              + rFibNum(firstFibNum, secondFibNum, nth));
    	  
    	  System.out.println(fib(8));
   }

   public  static int fib(int n) {
	   
	   if(n == 1)
			return 1;
	   	else if(n == 2)
	    	     return 2;
	   	else
	   		return fib(n-1) + fib(n-2);
   }
   
   public static int rFibNum(int a, int b, int n)
   {
 	   	if(n == 1)
			return a;
 	   	else if(n == 2)
	    	     return b;
	   	else
	   		
 	  System.out.println(n);
	      	return rFibNum(a, b, n - 1) + rFibNum(a, b, n - 2);
   }
}