package sevenClass2;

public class mainShape {
	
	public static void main(String[] args) {
		Circle cr = new Circle(4);
		Rectangle rc = new Rectangle(4, 3);
		ShowArea(cr);
		ShowArea(rc);
	}
	
	
	public static void ShowArea(Shape s) {
		
		double area = s.area();
		System.out.println(area);
		
	}

}
