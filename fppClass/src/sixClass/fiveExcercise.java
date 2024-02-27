package sixClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class fiveExcercise {
	
		
		public static void main(String[] args) {
			listPets();
		}
		
	
	
	public static void listPets() {
		
		Pets  mascota ;
		ArrayList<Pets> listPets = new ArrayList<Pets>();
		String petType="";
		String petName="";
		Scanner sc = new Scanner(System.in);
		while(!"stop".equals(petType)) {
			System.out.println("write cat or dog to list the pets and write stop to stop the program");
			petType=sc.nextLine();
			
			switch (petType) {
			case "cat": {
				System.out.println("write the name of the pet");
				petName=sc.nextLine();
				
				  mascota = new Pets(petName, "c");
				
				break;
			}
			case "dog":{
				System.out.println("write the name of the pet");
				petName=sc.nextLine();
				
				mascota = new Pets(petName, "d");
				break;
			}
			case "stop":{
				
				break;
			}
			default:
				System.out.println("the kind of dog its not a valid value please try again");
			}
			
			
			
		}
		for(int i=0;i<listPets.size();i++) {
			
			System.out.println("name : "+listPets.get(i).name + "   type : "+ listPets.get(i).type);
		}
		
		
	}

}
