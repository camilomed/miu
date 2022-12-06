package lesson1;

public class ForLoop6 {
public static void main(String[] args) {

    System.out.println("For loop");
    
    for (int i  =0 ; i < 10   ;i++) {
    	
    	System.out.println(i);
    	
    }
    
    
    
    int arr2[] = {10,15,-56,94,65};
    
    
    int i=0;
    for (;i<arr2.length;i++) {
    	
    	arr2[i]+= 10;
    	
    	
    	System.out.println(arr2[i]);
    }
    
    
    
    //For Each
    
    for (int item  :  arr2) {
    	item+=2;
    	System.out.println(item);
    	
    }
   
    
    
}
}
