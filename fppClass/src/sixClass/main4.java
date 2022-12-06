package sixClass;

public class main4 {
	
	public static void main(String[] args) {
		Manager man = new Manager(12, "juan", "manager", "chicago", 90000);
		System.out.println(man.toString());
		man.addBonus();
		System.out.println(man.toString());
	}

}
