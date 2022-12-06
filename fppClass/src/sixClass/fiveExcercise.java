package sixClass;

import java.util.ArrayList;
import java.util.Scanner;

public class fiveExcercise {
	
	public static void main(String[] args) {
		
		listPets();
		
	}
	
	
	
	public static void listPets() {
		
		ArrayList<String[] > pets = new ArrayList<String[]>();
		String petType="";
		String petName="";
		Scanner sc = new Scanner(System.in);
		while(!petType.equals("stop")) {
			System.out.println("write cat or dog to list the pets and write stop to stop the program");
			petType=sc.nextLine();
			String[] nameType = new  String[2];
			
			switch (petType) {
			case "cat": {
				System.out.println("write the name of the pet");
				petName=sc.nextLine();
				
				nameType[0]= petName;
				nameType[1]= "c";
				pets.add(nameType);
				
				break;
			}
			case "dog":{
				System.out.println("write the name of the pet");
				petName=sc.nextLine();
				
				nameType[0]= petName;
				nameType[1]= "d";
				pets.add(nameType);
				break;
			}
			case "stop":{
				
				break;
			}
			default:
				System.out.println("the kind of dog its not a valid value please try again");
			}
			
			
			
		}
		for(int i=0;i<pets.size();i++) {
			
			System.out.println("name : "+pets.get(i)[0] + "   type : "+ pets.get(i)[1]);
		}
		
		
	}

}
