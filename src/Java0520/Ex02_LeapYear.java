package Java0520;

public class Ex02_LeapYear {
// 책 page 97
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LeapYear = 윤년 = 2월 마지막날짜가 29일까지 있는 년
		
		int year = Integer.parseInt("2020");
		boolean leapYear = false;
		System.out.println("Integer.parsInt : " + year); // "2020" 이 parsInt로 인해서 Int타입인 2020으로 출력됨
		leapYear = (year%4==0 && year%100 !=0 || year%400==0);
		
		if(leapYear) {
			System.out.println(year + "윤년입니다.");
		}else {
			System.out.println(year + "윤년이 아닙니다.");
		}
	}
}
