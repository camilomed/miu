package sixClassPets;

public class Cats  extends Pets{
	
	public String color;
	public Cats(String name, String type) {
		super(name, type);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "name : "+name + "   type : "+ type+ " Colo: "+color;
	}

}
