package polymorphism;

public class House {
	
	String street;
	String city;
	String state;
	int zipCode;
	
	public String location(String street, String city){
		System.out.println(street + ", " + city);
		return street;
	}	
	public String location(String street, String city, String state){
		System.out.println(street + ", " + city + ", " + state);
		return street;
	}
	public String location(String street, String city, int zipCode){
		System.out.println(street + ", " + city + ", " + zipCode);
		return street;
	}
}
