package Lesson7;

public class Square implements Drawable,Printable{

	String color = "";
	final int x=0;
	public Square() {
		
	}

	@Override
	public void draw() {
		System.out.println("Drawing a " + this.color + " Square");
		
	}

	@Override
	public void setColor(String c) {
	this.color = c;
		
	}

	@Override
	public String getColor() {
		
		return this.color;
	}
	
	@Override
	public void print() {
		System.out.println("Prting the " + color + " square");
		
	}
	
	
	
}
