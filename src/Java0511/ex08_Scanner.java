/*
 	Date : 20.05.11
 	Author : JasonYu
 	Description : ex_08 입력(Scanner)
 	Version : 1.0
 */
package Java0511;

import java.util.Scanner;
// 두번째
// Scanner 클래스는 java.util 패키지에 있는 입력 클래스이다.

public class ex08_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 첫번째 
		// 스캐너라는 객체를 선언.
		Scanner sc = new Scanner(System.in);
		
		String name;
		String address;
		int age;
		
		// pirnt 와 println의 차이점 확인.
				System.out.println("print");
				System.out.println("println");
				System.out.println("두개 차이점 확인하기");
				
		
		
		
		System.out.println("이름을 입력하세요 : ");
		name = sc.next();
		// 세번째 
		// 변수에 입력된 값을 담는다.
		
		System.out.println("주소를 입력하세요 : ");
		address = sc.next().trim();
		// trim() : 앞뒤 공백을 제거해준다.
		// next 는 스페이스바를 입력하면 그 전까지 출력되는데 nextLine은 스페이스바 
		// 유무와 상관없이 한 줄이 출력되기 때문에 유용하다.
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		System.out.println();
		System.out.println("=== 출력내용 ===");
		System.out.println("입력한 이름 : " + name);
		System.out.println("입력한 주소 : " + address);
		System.out.println("입력한 나이 : " + age);
		
		
		
		
		
	}

}
