//package Lesson5;
//
//import java.util.ArrayList;
//
//public class Inheretance {
//	public static void main(String[] args) {
//		
//		//Is A Relationship
//		
//		
//		
//		
//		Prog programmer = new Prog();
//		
//		programmer.setName("Peter");
//		
//		Prog programmer2 = new Prog("Sara",2000);
//		//System.out.println(programmer2.getName());
//		
//		
//		
//		
//		
//		Programmer Prog = new Programmer();
//		
//		
//		Prog.setName("Ali");
//		
//		
//		Prog.setSalary(1000);
//		
//		
//		
//		Prog.setBonus(2000);
//		
//		
//		Prog.PrintInfo();
//		
//		
//		System.out.println(Prog.getName() + "'s total salary =  " + (Prog.getSalary() + Prog.getBonus()));
//		
//		
//		
//		System.out.println(Prog.getName() + "'s total salary =  " + Prog.TotalSalary());
//		
//		
//		System.out.println("You should work " + Prog.getWeeklyhours()+ " hours a week");
//		
//		
//		WebDeveloper web =new WebDeveloper();
//		
//		
//		web.setName("Peter");
//		
//		web.setCanWorkOnline(false);
//		
//		web.CanWorkOnline();
//		
//		
//		System.out.println(web.getName() + " total salary = " +  web.TotalSalary());
//		
//		
//		
//		
//		// Has A Relationship (Aggregation)
//		Address add  = new Address("Fairfeild", "Iowa", "USA");
//		
//		
//		Address add1  = new Address("Iowa City", "Iowa", "USA");
//		
//		
//		FullStackDev FSD = new FullStackDev();
//		FSD.setName("Sarah");		
//		
//		
//		FSD.setAddress(add);
//		
//		
//		FSD.EmpAddress();
//		
//		
//		//ArrayList of Object
//		
//		
//		ArrayList <Programmer> ProgArr = new ArrayList();
//		ProgArr.add(web);
//		ProgArr.add(FSD);
//		ProgArr.add(Prog);
//		Employee emp = new Employee();
//		
//		String sss = String.valueOf(ProgArr);
//		System.out.println("ddddddd");
//		System.out.println(sss);
//		
//		ProgArr.add(emp);//ERROR
//		
//		Programmer progArr [ ] = new Programmer[4];
//		
//		
//		progArr[0]=web;
//		progArr[1]=FSD;
//		progArr[2]=Prog;
//		//progArr[3]=emp;
//		
//		
//		Print(Prog);
//		Print(web);
//		Print(FSD);
//		
//		
//				
//	}
//	
//	static void Print(Employee emp) {
//		System.out.println(emp.getName());
//	}
//	
//
//
//}
//
//
//
//
//
//
//
