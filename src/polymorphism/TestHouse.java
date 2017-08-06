package polymorphism;

public class TestHouse {

	public static void main(String[] args) {
		
		House myHouse = new House();
		myHouse.location("Cherry Valley", "Rockville");
		myHouse.location("Cherry Valley", "Rockville", 20853);
		myHouse.location("Cherry Valley", "Rockville", "Maryland");
		
		House1 myHouse1 = new House1();
		myHouse1.location("Cherry Valley", "Rockville", "Maryland");
	}
}
