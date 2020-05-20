/*
 	Date : 20.05.20
 	Author : JasonYu
 	Description :  
 	Version : 1.0
 */
package Java0520;

public class Ex03_AirConMain {
	public static void main(String[] args) {
	// 필드
//		String company;
//		String color;
//		int size;
//		int temp;
//		int price;
//	// 메소드 -> 메소드명 뒤에는 () 를 해준다. 또한 메소드 앞의 void 는 리턴타입을 뜻한다.
//		 void onPower(){
//			System.out.println("Power On!");
//		}
//		 void offPower(){
//		 System.out.println("Power Off!");
//		}
//		 int upTemp(){
//		  temp++;
//		  return temp;
//		 System.out.println("Temperature Up!");
//		 }
//		 void downTemp(){
//		 temp--;
//		 System.out.println("Temperature Down!");

//		// void 는 리턴값이 없다.
		
		// Java의 컴파일러가 다른 생성자가 없을 경우 자동 생성
		
		Ex03_AirCon airCon = new Ex03_AirCon();
		//기본생성자
		
		Ex03_AirCon ac = new Ex03_AirCon(17);
		//매개변수(int s)
		// int s = 17;
		System.out.println("ac.size = " + ac.size);
		
		
		// Ex03_AirCon cp = new Ex03_AirCon("brown", "현대");
		Ex03_AirCon all = new Ex03_AirCon("삼성", "red", 10, 21,10000);
		all.showInfo();
		
		airCon.showInfo();
		ac.showInfo();
		
		
	}
}
