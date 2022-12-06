package fourthClass;

import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int[] arr = {1,5,2,7,4,1,8,6,3,5};
		int searchValue = 5;
		Arrays.sort(arr);
		int left = arr[0];
		int right = arr[arr.length-1];
		
	System.out.println(	binarySearch(arr,left, right,searchValue));
		
	}
	
	static int binarySearch(int arg[],int left, int right , int searchValue) {
		
	

	
	
	if (right>=1) {
		int middle =left+(right-left)/2;
		if (arg==null)return -1; 
		else if(arg[middle]==searchValue)
				return middle;
				
			else if(searchValue<arg[middle]) 
				return  binarySearch(arg,left, middle-1,  searchValue);
			else 
				return  binarySearch(arg, middle+1,right,  searchValue);
				}
	return -1;
	}

}
