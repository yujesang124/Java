/*
	Date : 20.05.12
	Author : JasonYu
	Description : randomMethod
	Version : 1.0
 */
package Java0512;

public class ex02_randomMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 랜덤메소드 : 특정 범위 내에서 숫자 하나를 출력해주는 메소드.
		// Math.random() ==>> 0보다 크거나 같고, 1보다 작은
		// 숫자를 무작위로 발생 
		
		double ranNum = Math.random();
		System.out.println("ranNum : " + ranNum);
		
		// 1~10 사이의 숫자 출력
		ranNum = (int)(Math.random()*10) + 1;
		System.out.println("ranNum 정수 :" + (int)ranNum);
		
		double dice = Math.random();
		dice = (int)(Math.random()* 6) + 1;
		System.out.println("주사위" + (int)dice);
		
		// 로또변호 만들기
		
		double lotto = Math.random();
		lotto = (int)(Math.random() * 45) + 1;
		System.out.println("로또번호는" + (int)lotto);
		
		
	}

}
