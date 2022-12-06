package secondHomeworkText;

public class firstProblem {
	public static void main(String[] args) {
		
	}
	
	public int [] searchAccount( int[] number ) {
		number = new int[15];
		for (int i = 0; i < number.length; i++ )
		number[i] = number[i-1] + number[i+1];
		return number;
		}

}
