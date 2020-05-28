package Java0527_04;

public class Employee2 {
	String name; // 이름
	String dept; // 부서
	int salary; // 급여
	
	String getEmployeeInfo() {
		return "이름 : " + name + "부서 : " + dept + "급여 : " + salary; 
	}
	//기본생성자
//	public Employee2() {
//		
//	}
	//매개변수생성자
	public Employee2(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	
}
