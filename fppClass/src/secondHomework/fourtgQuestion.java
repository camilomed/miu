package secondHomework;

public class fourtgQuestion {
	
	public static void main(String[] args) {
		int [] arr = {10,1,5,2,52,3,22};
		printMaxMIn(arr);
	}
	
	static void printMaxMIn(int [] arr) {
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
