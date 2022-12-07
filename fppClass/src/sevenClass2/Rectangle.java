package sevenClass2;

public class Rectangle implements Shape {
	private double heigth;
	private double width;
	/**
	 * @param heigth
	 * @param width
	 */
	public Rectangle(double heigth, double width) {
		super();
		this.heigth = heigth;
		this.width = width;
	}
	public double getHeigth() {
		return heigth;
	}
	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	public double area() {
		
		return width*heigth;
	}
	
	

}
