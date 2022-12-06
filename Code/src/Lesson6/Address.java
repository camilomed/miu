package Lesson6;



public class Address {
	static String city,state,country;  
	 //String city1,state1,country1;  
	public Address(String city, String state, String country) {  
	    this.city = city;  
	    this.state = state;  
	    this.country = country;  
	    
	    //this.city1 = city;  
	    //this.state1 = state;  
	    //this.country1 = country; 
	    
	}  
	public static String StaticAddress() {
		return city + " " + state+ " " + country;
		
	}
	//public String ObjAddress() {
		//return city1 + " " + state1+ " " + country1;
		
	//}
}
