package sevenClass1;

public class City implements Comparable<City> {
	
	private String cityName;
	private double temperature;
	
	
	/**
	 * @param cityName
	 * @param temperature
	 */
	public City(String cityName, double temperature) {
		super();
		this.cityName = cityName;
		this.temperature = temperature;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	@Override
	public String toString() {
	        return ( cityName + ", " + temperature );
	    }
	@Override
	public int compareTo(City o) {
		
		if(temperature== o.temperature) 
			
			return 0;
		else if(temperature>o.temperature)return 1;
		return -1;
	} 

}
