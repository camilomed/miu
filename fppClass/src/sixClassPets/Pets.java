package sixClassPets;

import java.util.Collections;

import sixClass.Asset;

public class Pets  implements Comparable<Pets>{
	
	String name;
	String type;
	public Pets(String name, String type) {
		this.name = name;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public int compareTo(Pets o) {
		return type.compareTo(type);
	}
	
	@Override
	public String toString() {
		return "name : "+name + "   type : "+ type;
	}

}
