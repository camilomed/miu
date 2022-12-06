package Lesson7;

public class Triangle implements Drawable{

	
	
	
	String color = "";
	boolean IsRightTriangle = false;
	
	@Override
	public	void draw() {
		System.out.println("Drawing a " + this.color +" Triangle");
	}
	@Override
	public void setColor(String c) {
		this.color = c;

	
	}
	@Override
public String getColor() {
	return this.color;
	
}
	public void setIsRightTriangle(boolean isRightTriangle) {
		IsRightTriangle = isRightTriangle;
	}
	public boolean getIsRightTriangle() {
		return this.IsRightTriangle;
		

	}


}
