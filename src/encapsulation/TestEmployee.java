package encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		emp1.setEmpName("Kahina");
		emp1.setEmpID(113);
		emp1.setEmpDep("IT");
		emp1.setEmpSalary(100000);
		System.out.println(emp1.getEmpName()+" "+emp1.getEmpID()+" "+emp1.getEmpDep()+" "+emp1.getEmpSalary());
	    
		
		
		
		

	}

}
