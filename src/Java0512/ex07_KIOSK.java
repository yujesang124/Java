package Java0512;

import java.util.Scanner;

public class ex07_KIOSK {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		// 떡볶이 3000원 순대 2500원 튀김 2000원 김밥 1500원 
		
		int num1,num2;
		int price1, price2, price3, price4, price5, price6, price7, price8 = 0;
		
		String menu = "";
		
		System.out.println("ICIA 분식집에 오신것을 환영합니다.");
		System.out.println("주문을 도와드리겠습니다.");
		
		
		
		
		System.out.print("1번 입력 : 단품주문 \t 2번입력 : 세트주문 : ");
		
		num1 = sc.nextInt();
		
		if(num1 == 1) {
			switch(num1) {
			case 1 :
				menu = "떡볶이";
				price1 = 3000;
				break;
			case 2 :
				menu = "순대";
				price2 = 2500;
				break;
			case 3 : 
				menu = "튀김";
				price3 = 2000;
				break;
			case 4 :
				menu = "김밥";
				price4 = 1500;
				break;
				default :
					System.out.println("해당 메뉴는 존재하지않습니다.");
			}
			System.out.println("떡볶이 3000원 / 순대 2500원 / 모듬튀김 2000원 / 김밥 1500원");
			System.out.println("단품메뉴란입니다. ");
		}
		
		if(num1 == 2) {
			
			switch(num1) {
			case 1 :
				menu = "세트메뉴 1번";
				price5 = 5000;
				break;
			case 2 :
				menu = "세트메뉴 2번";
				price6 = 4500;
				break;
			case 3 : 
				menu = "세트메뉴 3번";
				price7 = 4000;
				break;
			case 4 :
				menu = "세트메뉴 4번";
				price8 = 3000;
				break;
				default :
				System.out.println("해당 메뉴는 존재하지않습니다.");
			}
			System.out.println("세트메뉴란입니다. ");
			System.out.println("세트1번 떡볶이+순대 5000원  / 세트2번 떡볶이+튀김 4500원");
			System.out.println("세트3번 순대 +튀김 4000원 / 세트4번 김밥+튀김 3000원");
			
		}
		
		
		
	}
}
