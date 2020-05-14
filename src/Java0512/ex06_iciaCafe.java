package Java0512;

import java.util.Scanner;

public class ex06_iciaCafe {

	public static void main(String args[]) {
		//키오스크 : 무인결제 시스템
		// 아메리카노 : 1500원
		// 바닐라라떼 : 2500원
		// 복숭아아이스티 : 2000원
		// 바닐라초코칩모카 : 3000원
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int price = 0;
		String menu = "";
		
		
		System.out.println("Cafe에 오신것을 환영합니다.");
		System.out.println("주문을 도와드리겠습니다. \n");
		
		System.out.println("1.아메리카노 주문\t\t2.바닐라라떼");
		System.out.println("3.복숭아아이스티 주문\t\t4.바닐라초코칩모카");
		// \t\t = tab2번
		System.out.print("메뉴를 선택해주세요 : ");
		
		num = sc.nextInt(); //메뉴를 선택할 숫자를 받아옴.
		
		switch(num) {
		case 1:
			menu = "아메리카노";
			price = 1500;
			break;
		case 2:
			menu = "바닐라라떼";
			price = 2500;
			break;
		case 3:
			menu = "복숭아아이스티";
			price = 2000;
			break;
		case 4:
			menu = "바닐라초코칩모카";
			price = 3000;
			break;
			default:
				System.out.println("해당 메뉴는 존재하지 않습니다.");
				break;
		}
		if(num >= 1 && num<=4) {
			System.out.println("\n주문하신 메뉴는 "+ menu +" 입니다.\n" + price  
					+ "원 결제 도와드리겠습니다."  );
		}
	}
}
