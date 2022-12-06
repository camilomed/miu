package Lesson5;



public class Address {
	static String city,state,country;  
	 String city1,state1,country1;  
	public Address(String city, String state, String country) {  
	    this.city = city;  
	    this.state = state;  
	    this.country = country;  
	    
	    this.city1 = city;  
	    this.state1 = state;  
	    this.country1 = country; 
	    
	}  
	public   String StaticAddress() {
		return city1 + " " + state1+ " " + country1;
		
	}
	//public String ObjAddress() {
		//return city1 + " " + state1+ " " + country1;
		
	//}
}
