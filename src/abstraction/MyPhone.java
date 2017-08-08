package abstraction;

public class MyPhone extends SmartPhone implements PhoneFunctions,PhoneProperties{
	
	int n1;
	int n2;

	@Override
	public void screen() {
		System.out.println("Digital screen");
	}
	@Override
	public void camera() {
		System.out.println("High quatity");	
	}
	@Override
	public void ring() {
		System.out.println("The phone is ringing");	
	}
	@Override
	public void vibrate() {
		System.out.println("This phone can also vibrate");	
	}
	@Override
	public void call() {
		System.out.println("Making phone calls");	
	}
	@Override
	public void text() {
		System.out.println("Send messages");	
	}
}
