package secondHomework;

public class fiveProblem {
	
	public static void main(String[] args) {
	int[] 	Array1 = {1,3,5,6,6,7};
	int[] 	Array2 = {1,3,5,6,6,7} ;
	
	System.out.println(isEqualArray(Array1, Array2));
	}
	
	
	static boolean isEqualArray(int []arr1 , int [] arr2) {
		if (arr1.length!=arr2.length) return false;
		for (int i =0; i<arr1.length;i++) {
			if (arr1[i]!=arr2[i]) {
				return false;
			}
			
		}
		
		return true;
	}

}
