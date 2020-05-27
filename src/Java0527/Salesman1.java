package Java0527;

public class Salesman1 extends Employee1 {
	int commission; // 수당
	int salary = 100;
	
	// 직원정보 메소드
	String getEmployeeInfo() {
		return super.getEmployeeInfo() + ", 수당 : " + commission;
	}
	// super.getEmployeeInfo 니까 employee의 급여를 가져온 거니까 현재클래서의 New salary 인 100이 반영이 안된다.
	// 하지만 아래의 salrary는 상속받아 온 것도 아니라서 New class인 salesman1의 클래스에서의 salary의 값인 100이 반영되서 출력이 된다,
	
	String getSalesmanInfo() {
		return "이름 : " + name + "부서 : " + dept + "급여 : " + salary + ", 수당 : " + commission;
	
	}
	
}
