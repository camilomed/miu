package secondHomework;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class eightProblem {
	
	
	public static void main(String[] args) {
		
		ArrayList<String> fortune = new ArrayList<>();
		fortune.add("You will get 4.0 GPA this semester.");
		fortune.add("Happiness is programming.");
		fortune.add("Satisfaction follows hard work");
		fortune.add("Patience is virtue");
		printFortune(fortune);
		
	}
	
	static void printFortune(ArrayList<String> fortune) {
		String answer ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Fortune (Y/N)?");
		answer= sc.nextLine();
		while (answer.equals("Y")) {
			Random r = new Random();
			int random = r.nextInt(4) ;
			System.out.println(fortune.get(random));
			System.out.println("Fortune (Y/N)?");
			answer= sc.nextLine();
		}
		
		
	}

}
