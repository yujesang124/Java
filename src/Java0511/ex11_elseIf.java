/*
	Date : 20.05.11
	Author : JasonYu
	Description : ex11_elseIf
	Version : 1.0
 */
package Java0511;

public class ex11_elseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5;
		int num2 = 5;
		/*
		if(num1 > num2) {
			System.out.println("num1이 크다.");
		}else {
			System.out.println("num2가 크다.");
		}
		*/
		
		if(num1 > num2) {
			System.out.println("num1이 크다");
		}else if(num1 < num2) {
			System.out.println("num2가 크다");
		}else {
			System.out.println("num1과 num2 가 같다.");
		}
		/*
			if(조건식1){
				조건식1이 참일때 실행
			} else if(조건식2) {
				조건식2가 참일때 실행
			} else {
				조건식1과 2가 모두 거짓일때 실행
			}
		 */
	}
}
