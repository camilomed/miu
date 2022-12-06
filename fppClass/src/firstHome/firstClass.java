package firstHome;

import java.util.Scanner;

public class firstClass {

	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7};
		
		//1 
		System.out.println("problem 1");
		System.out.println(arrayAvarage(arr));
		
		// 2
		System.out.println("problem 2");

		System.out.println(oddEven(arr)[0]);
		System.out.println(oddEven(arr)[1]);
		
		//3
		System.out.println("problem 3");

		int counterEven=CountEven(arr);
		int countOdd=arr.length- counterEven;
		System.out.println("odd count "+countOdd);
		System.out.println("even count "+counterEven);
		// 4
		System.out.println("problem 4");

		String [] arrString = {"hola","adios"};
		System.out.println(similarString(arrString));
		//5 
		System.out.println("problem 5");

		int a=227;
		int b=210;
		int c=2220;
		System.out.println(max(a, b, c));
		//6
		System.out.println("problem 6");

		reverseString();
	}
//	PROBLEM 1
	
	static double arrayAvarage(int [] arr) {
		double sumTotal=0;
		for (int i =0;i<arr.length; i++) {
			sumTotal+= arr[i];
		}
		double avegare = sumTotal/arr.length;
		
		return avegare;
	}
//	PROBLEM 2
	
	static int [] oddEven(int [] arr) {
		int[] arrReturn = new int[2];
		int sumEven=0;
		int sumOdd=0;
		for (int i=0;i<arr.length;i++) {
			
			if (arr[i]%2==0) {
				sumEven+=arr[i];
			}else {
				sumOdd+=arr[i];
			}
		}
		arrReturn[0]=sumEven;
		arrReturn[1]=sumOdd;
		return arrReturn;
	}
//	PROBLEM 3
	
	static int  CountEven(int [] arr) {
		int[] arrReturn = new int[2];
		int sumEven=0;
		int sumOdd=0;
		int counterEven=0;
		for (int i=0;i<arr.length;i++) {
			
			if (arr[i]%2==0) {
				sumEven+=arr[i];
				counterEven++;
			}else {
				sumOdd+=arr[i];
			}
		}
		
		return counterEven;
	}
	
	//PROBLEM 4
	
	static boolean similarString(String [] arr) {
		
		String stringCompare ="hola";
		
		for (int i=0;i<arr.length;i++) {
			if (arr[i].equals(stringCompare)) {
				return true;
			}
		}
		return false;
	}
	
	// PROBLEM 5
	
	static int max(int a, int b, int c) {
		int max=a;
		if (b>a) {
			max =b;
		}
		if(c>max) {
			max=c;
		}
		
		
		return max;
	}
	
	
	// PROBLEM 6
	
	static void reverseString() {
		Scanner sc = new Scanner(System.in);
		String [] strArr= new String[2];
		  StringBuilder input1 = new StringBuilder();
		for (int i =0;i<2;i++) {
			System.out.println("digit a word");
			strArr[i]=sc.nextLine();
			
		}
		
		for(int y=0;y<2;y++){	
				
			strArr[y]= reverseFunction(strArr[y]);
		
			}
		
		for(int m=0;m<2;m++) {
			
			System.out.println(strArr[m]);
		}
		}
	
	static String reverseFunction(String a) {
		
		char reverseConst;
		String result="";
		for (int i=0;i<a.length();i++) {
			reverseConst=a.charAt(a.length()-i-1);
			result+=reverseConst;
			
		}
		return result;
		
		
	}
	
}
