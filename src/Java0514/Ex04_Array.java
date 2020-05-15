/*
	Date : 20.05.14
	Author : JasonYu
	Description : Array
	Version : 1.0 
	
 */
package Java0514;

public class Ex04_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열(Array) : 같은 (변수타입)의 데이터를 하나의 변수에 저장하는 구조
		---------------------------------------
		// 배열 선언
		// (1번째방법) 타입[] 배열이름;
//					 int[] num1;
		// (2번째방법) 타입 배열이름[];
		// 			 int num2[]2;
		
		// 변수 선언
		// int i = 0;
		// (변수타입) (변수명) = (변수값);
		
		----------------------------------------
		// 배열 초기화
//		num1 = new int[] {10,20}; // 배열은 new 라는 것을 붙여서 값을 넣는다.
//		System.out.println("첫번째 집 : " + num1[0]);
//		System.out.println("두번째 집 : " + num1[1]);
		
		// 변수 초기화
		// i = 0;
		-------------------------------------------
		// 배열 선언 초기화
		
		int num3[] = {10 , 11, 12, 13};
		System.out.println("첫번째 집 : " + num3[0]);
		System.out.println("두번째 집 : " + num3[1);
		System.out.println("세번째 집 : " + num3[2]);
		System.out.println("네번째 집 : " + num3[3]);
		// 변수 선언 초기화
		// int j = 0;
		
		// int k=0;
		// System.out.println(k);
		
		//Char ch = '';
		//String str = "";
		
		// int[] a = null;
		// int b[] = {};
		
		// 배열 값 입력 시 타입을 맞춰서 입력!
		char[] ch1 = {'훈','지'};
		String[] str1 = {"인덱스0", "인덱스1", "인덱스2"};
		System.out.println("String 타입str1에서 2번째 집에 저장된 값 : ");
		System.out.println(str1[1]);
		
		// length : 배열의 길이를 나타낸다.
		int lNum3 = num3.length;
		
		System.out.println("num3[]의 길이 : " + lNum3);
		
		//for문을 사용해서 num3배열에 저장된 값을 모두 출력하시오.
		for(int i=0; i<num3.length; i++) {
			System.out.println("num3["+i +"] =" +num3[i]);
			
			// 국어 영어 수학 점수를 젖아하고
			// 배열변수에 저장된 모든 값의 총점과 평균을 구해라.
			int[] numbers = {90,80,85};
			
			
			int sum =0;
			
			
			for(int i=0; i<numbers.length; i++) {
				System.out.println("numbers[" + i +"] : " + numbers);
				sum += numbers[i];
			}
			double avg = (double)sum / numbers.length;
			System.out.println("numbers[] 총점 : " + sum);
			System.out.println("numbers[] 평균 : " + avg);
			// 이번엔 잘보세요!!!
		}
		
	}

}
