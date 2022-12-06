package sixClass;

public class Asset  implements Comparable<Asset>{
	
	public int serialNumber;
	public String category;
	
	
	public Asset() {
		super();
	}
	public Asset(int serialNumber, String category) {
		super();
		this.serialNumber = serialNumber;
		this.category = category;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public String getCategory() {
		return category;
	}
	@Override
	public int compareTo(Asset o) {
		return category.compareTo(category);
	}
	

}
