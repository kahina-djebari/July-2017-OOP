package polymorphism;

public class House1 extends House {
	
	public String location(String street, String city, String state){
		System.out.println(street + ", " + city + ", " + state + ", USA");
		return street;
	}

}
