/*
 	Date 20.05.14
 	Author : Jasonyu
 	Description : while문을 사용한 예제2
 	Version : 1.0
 */

package Java0514;
import java.util.Scanner;
public class Ex01_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int account = 0; //통장만들었음 0원
		// boolean run = true; // while 문 사용하기 위해서 run(조건변수) 선언, true 초기화
		int menu ;
		//while문 사용
		// switch - case문사용
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------");
			System.out.println("1. 예금| 2. 출금| 3. 잔고| 4. 종료");
			System.out.println("--------------------------------");
			System.out.print("선택 : ");
			menu = sc.nextInt();	 
			switch(menu) { // menu 변수선언 , 입력
			case 1 :
				System.out.println( "예금액 : ");
				//int a = sc.nextInt();
				account += sc.nextInt(); //예금액 입력
				break;  // switch문 탈출
			case 2 :
				System.out.println( "출금액 : ");
				account -= sc.nextInt();
				break; // switch문 탈출
			case 3 :
				System.out.println( account);
				account = sc.nextInt();
				break; // switch문 탈출
			case 4 : 
				run = false;
				break;
			default :
				System.out.println("선택된 값은 잘못된 값입니다.");
			} // switch문 종료
			System.out.println();
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
