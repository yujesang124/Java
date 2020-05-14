package Java0513;

public class ex10_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * while(반복조건){ 실행 내용
		 * 
		 * 
		 * }
		 * 
		 */

		int i = 1;
		int sum = 0;
		while (i <= 10) {
			System.out.println(i + "");
			i++;
			sum = sum + i;
			
			//system.out.print(i + "");
		}
		System.out.println("합쳐진 값은 = " + sum);
			// for(초기화식 ; 조건식; 증감식;)
			// 초기화식
			// while(조건식){
			//		증감식
			// 	}
			
	}

}
