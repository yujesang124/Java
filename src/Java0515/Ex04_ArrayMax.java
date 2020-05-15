package Java0515;

import java.util.Scanner;

public class Ex04_ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 5열짜리 1차원 배열을 선언
		// 스캐너를 이용하여 값 5개를 입력
		// 입력한 값중 가장 큰 값을 구하시오.
		
		int arr[] = new int[5]; //1. 5열짜리 1차원 배열을 선언
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int num; //저장할 입력받을 점수
		
		System.out.print("정수 " + arr.length + "개를 입력해주세요. : ");
		
		for(int i=0; i<arr.length; i++) {
			num = sc.nextInt();
			arr[i] = num;
			
			if(arr[i] > max) {
				max = arr[i];
			}
//			
//			System.out.println("입력받은 정수는 arr[" + i + "] = " + arr[i] );
			
//			max = (arr[i] > max) ? arr[i] : max;
			
			
		}
		System.out.println("가장 큰 값은 = " + max + "입니다.");
		
		
	}

}
