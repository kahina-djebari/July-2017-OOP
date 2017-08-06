package abstraction1;

public class TestMyPhone {

	public static void main(String[] args) {
		
		MyPhone myPhone = new MyPhone();
		myPhone.camera();
		myPhone.games();
		
		SmartPhone smartPhone = new MyPhone();
		smartPhone.screen();
		
		PhoneProperties pro = new MyPhone();
		pro.ring();
		
		PhoneFunctions function = new MyPhone();
		function.call();

	}

}
