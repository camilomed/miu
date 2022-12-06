package lesson1;

public class NonPrimitive2 {
public static void main(String[] args) {
	
	
	System.out.println("Non Primitive data type Or Wrapper Classes");
	System.out.println("user-defined data types created by programmers. These data types are used to store multiple values.");
	System.out.println("non-primitive data types, either multiple values of the same type or different type or both can be stored.");
	System.out.println("the stack memory holds a pointer to the object on the heap memory.");
	System.out.println("Examples: Clss, String, Array, Interface,Object");
	
	
	String FirstEmployee = "Peter";
	
	
	String SecondEmployee = "Peter";
	
	
	String ThirdEmployee = new String("Peter");
	
	

	
	//First and Second Employee will share the same address on heap memory 
	//Third Employee will initiate a new instance in a new address in the memory
	System.out.println(FirstEmployee);
	System.out.println(SecondEmployee);
	System.out.println(ThirdEmployee);
	
	
	//Non primitive data types might have some properties or built in function based on the data type 
	
	System.out.println(FirstEmployee.toUpperCase());
	
	System.out.println(FirstEmployee.toLowerCase());
	
	
	String str = "My name is peter";
	System.out.println(str.substring(5));
	System.out.println(str.substring(5,9));
	
	

	
	System.out.println(FirstEmployee.equals(SecondEmployee));
	System.out.println(FirstEmployee.equals(ThirdEmployee));
	System.out.println(FirstEmployee==SecondEmployee);
	System.out.println(FirstEmployee==ThirdEmployee);
	
	
}
}
