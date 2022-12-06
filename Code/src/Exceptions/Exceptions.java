package Exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {
public static void main(String[] args) throws FileNotFoundException  {
	//error();
	//tryException();
	//tryArithException();
	//tryNullPointerException();
	
	//tryStringIndexOutOfBoundsException();
	//tryFileNotFoundException();
	//tryArrayIndexOutOfBoundsException();
	//Mulipletry();
	//Nestedtry();
	//tryFinally();
	
	methodThrows();
	
	try {
		//validate(13);
	
	}
	catch (ArithmeticException e) {
		System.out.println(e);
	}
	
	//methodThrows();
	
	UserExcp(-1);
}



public static void error() {
	  int data=50/0; //may throw exception   
      
      System.out.println("rest of the code");  
        
}



public static void tryException() {
	try {
		
		   
		int data=50/0; //may throw exception   
		   
	} catch (Exception e) {
		System.out.println(e);
	}  
	System.out.println("rest of the code");  
	
 
      
}
public static void tryArithException() {
	try {
		//It is thrown when an exceptional condition has occurred in an arithmetic operation.
		int data=50/0; //may throw exception  
		 System.out.println("Some code");  
   
	} catch (ArithmeticException e) {
		System.out.println(e);
	}  
	 
    System.out.println("rest of the code");  
      
}

public static void tryNullPointerException() {
	//This exception is raised when referring to the members of a null object. Null represents nothing
	try {
		
        String a = null; //null value
        System.out.println(a.charAt(0));
    } catch(NullPointerException e) {
        System.out.println("NullPointerException..");
    }
    
}

public static void tryStringIndexOutOfBoundsException() {
	//It is thrown by String class methods to indicate that an index is either negative or greater than the size of the string
	try {
        String a = "This is like chipping "; // length is 22
        char c = a.charAt(24); // accessing 25th element
        System.out.println(c);
    }
    catch(StringIndexOutOfBoundsException e) {
        System.out.println(e);
    }
    
}


public static void tryFileNotFoundException() {
	//This Exception is raised when a file is not accessible or does not open.
	 try {
		 
         // Following file does not exist
         File file = new File("E://file.txt");

         FileReader fr = new FileReader(file);
     } catch (FileNotFoundException e) {
        System.out.println("File does not exist");
     } 
}
public static void tryArrayIndexOutOfBoundsException() {
	
	//It is thrown to indicate that an array has been accessed with an illegal index. The index is either negative or greater than or equal to the size of the array
	try{
        int a[] = new int[5];
        a[6] = 9; // accessing 7th element in an array of
                  // size 5
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println ("Array Index is Out Of Bounds");
    }
    
}
public static void Mulipletry() {
	try{    
        int a[]=new int[5];    
        a[3]=307; 
        String ab = null; //null value
        System.out.println(ab.charAt(0));
       }    
       catch(ArithmeticException e)  
          {  
           System.out.println("Arithmetic Exception occurs");  
          }    
       catch(ArrayIndexOutOfBoundsException e)  
          {  
           System.out.println("ArrayIndexOutOfBounds Exception occurs");  
          }    
       catch(Exception e)  
          {  
           System.out.println("Parent Exception occurs");  
          }             
       System.out.println("rest of the code");    
}  
   
public static void Nestedtry() {
    try {  
        
        //inner try block 1   
        try {  

            // inner try block 2  
            try {  
                int arr[] = { 1, 2, 3, 4 };  

                //printing the array element out of its bounds  
                System.out.println(arr[10]);  
            }  

            // to handles ArithmeticException  
            catch (ArithmeticException e) {  
                System.out.println("Arithmetic exception");  
                System.out.println(" inner try block 2");  
            }  
        }  

        // to handle ArithmeticException   
        catch (ArithmeticException e) {  
            System.out.println("Arithmetic exception");  
            System.out.println("inner try block 1");  
        }  
    }  

    // to handle ArrayIndexOutOfBoundsException   
    catch (ArrayIndexOutOfBoundsException e4) {  
        System.out.print(e4);  
        System.out.println(" outer (main) try block");  
    }  
    catch (Exception e5) {  
        System.out.print("Exception");  
        System.out.println(" handled in main try-block");  
    }  	
    
}
 
 
 public static void tryFinally (){
	 try{    
		//below code do not throw any exception  
		   int data=25/0;    
		   System.out.println(data);    
		  }    
		//catch won't be executed  
		  catch(NullPointerException e){  
		System.out.println(e);  
		}    
		//executed regardless of exception occurred or not  
		 finally { 
			 System.out.println("finally block is always executed");  
		}    
		    
		System.out.println("rest of phe code...");     
 }
 
 public static void validate(int age) {  
     if(age<18) {  
         //throw Arithmetic exception if not eligible to vote  
         throw new ArithmeticException("Person is not eligible to vote");    
     }  
     else {  
         System.out.println("Person is eligible to vote!!");  
     }  
 }  

 public static void methodThrows() throws FileNotFoundException,ArithmeticException {  
	  
     FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");  
     BufferedReader fileInput = new BufferedReader(file);  

   
     throw new FileNotFoundException();  
   
 }  
 
 public static void UserExcp(int x) {
	  try  
      {  
          // throw an object of user defined exception 
		  if (x<0) {
          throw new UserDefinedException("This is user-defined exception");
		  }
		  System.out.println("Pass");
      }  
      catch (UserDefinedException ude)  
      {  
          System.out.println("Caught the exception");  
          // Print the message from MyException object  
          System.out.println(ude);  
      }  
 }
 
 
}
class UserDefinedException extends Exception  
{  
    public UserDefinedException(String str)  
    {  
        // Calling constructor of parent Exception  
        super(str);  
    }  
} 

