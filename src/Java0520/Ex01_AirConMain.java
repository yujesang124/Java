package Java0520;

import java.util.Scanner;

import Java0519_1.Ex01_AirCon1;
// import 패키지명.클래스명;
// 같은 패키지일 경우 따로 import 하지 않아도 된다.

public class Ex01_AirConMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		num = 10;
		//Ex01_Aircon airCon;			//필드선언
		//airCon = new Ex01_Aircon(); //객체생성
		// int num = 10; 
		Ex00_AirCon airCon = new Ex00_AirCon("삼성");
	  //Ex00_AirCon airCon
	  //클래스명         객체명       =  new 클래스명();
//		Scanner sc = new Scanner(System.in);
//		Ex01_AirCon1 airCon1 = new Ex01_AirCon1();
		//Ex00_AirCon ac = new Ex00_AirCon(19);
		//변수 초기화
		// 객체 멤버(필드)에 접근방법 ㅣ .(도트연산자) 사용
		
		
		airCon.color = "Gray";
		airCon.temp = 20;
		airCon.price = 160;
		System.out.println("airCon.company : " + airCon.company );
		System.out.println("airCon.color : " + airCon.color);
		System.out.println("airCon.temp : " + airCon.temp);
		System.out.println("airCon.price : " + airCon.price);
		System.out.println();
		// 메소드 호출
		// 객체의 멤버(메소드)에 접근방법 : .(도트연산자) 사용
		
		airCon.onPower();
		airCon.offPower();
		
		System.out.println("==============================");
		
		airCon.downTemp();
		System.out.println("현재온도 (down) :" + airCon.temp);
		
		airCon.upTemp();
		System.out.println("현재온도 (up : " + airCon.temp);
		
		
		
		
	}

}

class Ex01_AirConmain2{
	// 클래스는 한 파일에 두개 이상도 선언이 가능
	// 파일당 하나의 클래스만 선언
	
}