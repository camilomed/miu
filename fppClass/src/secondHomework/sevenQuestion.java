package secondHomework;

import java.security.SecureRandom;
import java.util.Random;

public class sevenQuestion {
	
	public static void main(String[] args) {
		
		int [] days = new int [365];
		for(int i=0; i<365;i++) {
			Random r = new SecureRandom();
			days[i] = r.nextInt(70) - 20;
		}
		printTemperatures(days);
		
//		for (int m=0; m<days.length;m++)System.out.println(days[m]);
	}
	
	static void printTemperatures(int [] arr) {
		int max=arr[0],min=arr[0];
		for (int i =0;i <arr.length-1;i++) {
			if(max<arr[i+1]) {
				max=arr[i+1];
			}
			if(min>arr[i+1]) {
				min=arr[i+1];
			}
		}
		System.out.println("max: "+ max);
		System.out.println("min: "+ min);
		
	}

}
