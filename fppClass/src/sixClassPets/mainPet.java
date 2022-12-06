package sixClassPets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class mainPet {
	static ArrayList<Pets> listPets = new ArrayList<Pets>();
	static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {
			listPets();
			modifyList();
		}
		
	
	
	public static void listPets() {
		
		Pets  mascota ;
		Dogs dog;
		Cats cat;
		
		ArrayList<Dogs> listDogs = new ArrayList<Dogs>();
		
		String petType="";
		String petName="";
		String color ="";
		double weight;
		
		while(!petType.equals("stop")) {
			System.out.println("write cat or dog to list the pets and write stop to stop the program");
			petType=sc.nextLine();
			
			switch (petType) {
			case "cat": {
				System.out.println("write the name of the pet");
				petName=sc.nextLine();
				System.out.println("write the color of the cat ");
				color=sc.nextLine();
				cat = new Cats(petName, "d");
				cat.setColor(color);
				listPets.add(cat);
				break;
			}
			case "dog":{
				System.out.println("write the name of the pet");
				petName=sc.nextLine();
				System.out.println("write the weight of the dog");
				weight=sc.nextDouble();
				
				 dog = new Dogs(petName, "c");
				  dog.setWeight(45);
				  
					listPets.add(dog);
				break;
			}
			case "stop":{
				
				break;
			}
			default:
//				System.out.println("the kind of dog its not a valid value please try again");
			}
			
		
			
		}
		for(int i=0;i<listPets.size();i++) {
			
			System.out.println("name : "+listPets.get(i).toString());
			if(listDogs.get(i).type.equals("d")) {
				
				listDogs.add((Dogs) listPets.get(i));
				
			}
			
		}
		
		
		Collections.sort(listPets);
		
	}
	
	public static void modifyList() {
		int input=5;
		String name ="";
		while (input!=0) {
			System.out.println("1. add cat, 2 add dogg , 3 remove cat , 4 remove dog,0 quit");
			input=sc.nextInt();
			
			switch (input) {
			case 0: {
				break;
			}
			case 1: {
				System.out.println("add name of cat");
				name=sc.nextLine();
				addCat(name);
				break;
			}
			case 2: {
				System.out.println("add name of dog");
				name=sc.nextLine();
				addDog(name);
				break;
			}
			case 3: {
				System.out.println("add name of cat");
				name=sc.nextLine();
				deleteCat(name);
				break;
			}
			case 4: {
				System.out.println("add name of dog");
				name=sc.nextLine();
				deleteDog(name);
				break;
			}
			}
			
		}
		
	}
	public static void addCat(String name) {
		Cats cat = new Cats(name, "c");
		listPets.add(cat);
		
	}
	public static void addDog(String name) {
		Dogs dog = new Dogs(name, "c");
		listPets.add(dog);
	}
	public static void deleteCat(String name) {
		for (int i =0; i<listPets.size();i++) {
			if(listPets.get(i).type.equals("c") && listPets.get(i).name.equals(name)) {
				listPets.remove(i);
			}
		}
		
	}
	public static void deleteDog(String name) {
		for (int i =0; i<listPets.size();i++) {
			if(listPets.get(i).type.equals("d") && listPets.get(i).name.equals(name)) {
				listPets.remove(i);
			}
		}
		
	}
	
	public double average(ArrayList<Dogs> listDogs) {
		
		double sum=0;
		int counter=0;
		for(int i=0;i<listDogs.size();i++) {
		sum+=	listDogs.get(i).getWeight();
		counter++;
			
		}
		return sum/counter;
	}
	public double minimum(ArrayList<Dogs> listDogs) {
	double min=	listDogs.get(0).getWeight();
	for(int i=0;i<listDogs.size();i++) {
		if(min>listDogs.get(i).getWeight()) {
			min= listDogs.get(i).getWeight();
		}
		
	}
		return min;
	}
	public double max(ArrayList<Dogs> listDogs) {
		double max=	listDogs.get(0).getWeight();
		for(int i=0;i<listDogs.size();i++) {
			if(max<listDogs.get(i).getWeight()) {
				max= listDogs.get(i).getWeight();
			}
			
		}
			return max;
	}

}
