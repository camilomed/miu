package sevenClass2;
import static java.lang.Math.*;

public class Circle implements Shape{
	
	
	private double radius;
	
	

	/**
	 * @param radius
	 */
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	



	public double getRadius() {
		return radius;
	}





	public void setRadius(double radius) {
		this.radius = radius;
	}





	@Override
	public double area() {
		
		return PI*radius*radius;
	}

}
