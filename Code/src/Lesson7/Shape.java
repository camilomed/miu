package Lesson7;

public abstract class Shape {

	
	
	public   abstract  void draw();
	
	
	int x=0;
	
	
	
	
	// Abstract classes can have constructors and methods with bodies;
	public  int Area() {
		return 0;
		
	}
	
	public Shape() {
		System.out.println("A shape is created");
	}
	
	
	private String color = "";
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
}
