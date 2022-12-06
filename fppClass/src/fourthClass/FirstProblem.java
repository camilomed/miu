package fourthClass;

public class FirstProblem {
	
	public static void main(String[] args) {
		System.out.println(power(5, 5));
	}
	
	static double power(double x, int n) {
		if (n>0) {
		return x*power(x, n-1);
		}
		return 1;
		}

}
