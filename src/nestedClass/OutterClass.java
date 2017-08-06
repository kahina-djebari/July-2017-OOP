package nestedClass;

public class OutterClass {
	
	InnerA innerA = new InnerA();
	InnerB innerB = new InnerB();
	
	public void outterMethod(){
		System.out.println("This is from outter Method");
		innerA.innerAMethod();
		innerB.innerBMethod();
	}
	
	private class InnerA{
		private void innerAMethod(){
			System.out.println("This is from Inner A Method");
		}
	}
	private class InnerB{
		private void innerBMethod(){
			System.out.println("This is from Inner B method");	
	    }
	}
}
