package lesson1;

public class Methods8 {
public static void main(String[] args) {
	 System.out.println("Methods");
	 int arr2[] = {10,15,-56,94,65}; 
	 int max = Max(new int[]{10,15,-56,94,65});
	 System.out.println(Max(arr2));
	  System.out.println(max);
	  Printmax(arr2);
	  
	  
}


static int  Max(int[] arr) {
	//Variable Scope
	int max = arr[0];
	for (int i = 0; i<arr.length;i++) {
		if (max<arr[i]) {
			max = arr[i];
		}
		
	}
	
	if (max>0) {
		return max;
	}
	else {
		return 0;
	}
	
}
static void  Printmax(int[] arr) {
	int max = arr[0];
	for (int i = 0; i<arr.length;i++) {
		if (max<arr[i]) {
			max = arr[i];
		}
		
	}
	System.out.println(max);
}

}

