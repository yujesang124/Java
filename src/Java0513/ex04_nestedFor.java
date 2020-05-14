/*
	Date : 20.05.13
	Author : jasonYu
	Description : nestedFor
	Version : 1.0
 */
package Java0513;

public class ex04_nestedFor {
	public static void main(String arg[]) {
		// 중첩 For문
		
		/*
			for(초기화식;조건식;증감식){
				for(초기화식;조건식;증감식){
					실행할 반복문
				}
			}
		 */
//		for(int i=1; i<=2; i++) {
//			for(int j=1; j<=3; j++) {
//				System.out.print("i값  = " + i);
//				System.out.println("j값  = " + j);
//			}
//			System.out.println("=====");
//		}
		
		for(int i=1; i<=9; i++) { // i 를 
			for(int j=1; j<=9; j++) {
				
				if(j%2 ==1) {
					
					System.out.print(j+"*"+i + "=" + j*i);
					System.out.print("\t");
					continue;
				}
			}
			System.out.println("");
		}
	}
}
