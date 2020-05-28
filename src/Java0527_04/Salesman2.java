package Java0527_04;

public class Salesman2 extends Employee2{
	int commission; // 수당
	
	
	// 직원정보 메소드
	String getEmployeeInfo() {
		return super.getEmployeeInfo() + ", 수당 : " + commission;
	}
	
	
	
	


//	public Salesman2() {
//		super();
//	}


	public Salesman2(String name, String dept, int salary, int commission) {
		
		// public Employee2(String name, String,dept, int Salary) <- 상속되는 Employee2에 있는 매개변수 생성자가 super.뒤에 옴
		super(name, dept, salary);
		this.commission = commission;
		//super.salary
	}






	String getSalesmanInfo() {
		return "이름 : " + name + "부서 : " + dept + "급여 : " + salary + ", 수당 : " + commission;
	
	}

	
}
