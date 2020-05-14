/*
 	Date : 20.05.13
 	Author : JasonYu
 	Description : forSnumToLnum
 	Version : 1.1
 */
package Java0513;

import java.util.Scanner;

public class ex02_forSnumToLnum {
	public static void main(String args[]) {
		// for문을 사용해서 두개의 정수(시작값, 끝나는 값)를 입력받아
		// 총합을 궇는 프로그램을 만들어보시오.
		int i ;
		int sum = 0;
		int startNum = 0;
		int endNum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시작값은 : " );
		startNum = sc.nextInt();
		System.out.print("끝값은 : ");
		endNum = sc.nextInt();
		for(i=startNum;i<=endNum;i++) {
			sum = sum +i;
			if(i>=startNum && i<endNum) {
				System.out.print(i + "+" );	
			}else {
				System.out.println(i + "=" + sum);
			}			
		}
		System.out.println(startNum + "부터" + endNum + "까지의 합은"
				+ sum + "입니다.");
	}
}

/*
  if(i<endNum){
  		system.out.print(" + ");
  	} else {
  		system.out.print;n(" = ");
  		}
*/