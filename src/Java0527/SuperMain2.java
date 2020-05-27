package Java0527;

public class SuperMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salesman2 sales2 = new Salesman2("유제상","인사개발팀", 300, 100);
				
		System.out.println("getEmployeeInfo()");
		System.out.println(sales2.getEmployeeInfo());
		
		System.out.println("salesEmployeeInfo()");
		System.out.println(sales2.getSalesmanInfo());
	}

}
