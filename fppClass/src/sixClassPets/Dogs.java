package sixClassPets;

public class Dogs extends Pets{
	
	public Dogs(String name, String type) {
		super(name, type);
	}

	public double weight;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "name : "+name + "   type : "+ type+" Weight: "+weight;
	}

}
