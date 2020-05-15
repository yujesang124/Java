package Java0515;

import java.util.Scanner;

public class Ex01_CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 동전 갯수를 구하는 예제
		// 어떤 금액을 입력하게 되면
		// 각 동전이 몇개씩 필요한지 출력하는 문제
		
		//ex) 2680원
		//500원 : 5개
		//100원 : 1개
		// 50원 : 5개
		
		// 배열을 이용해서 해결 / for문
		// int[] coin = {500, 100, 50, 10}
		
		int money;
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 금액 : ");
		int[] coin = {500, 100, 50, 10};
		money= sc.nextInt();
		for(int i=0; i<coin.length; i++) {
			int cCount = money / coin[i];
			System.out.println(coin[i] + "원은 " + cCount + "개");
			 // 2680 - 2500(500x5)
			money -= coin[i] *  cCount;
			System.out.println("남은금액 : " + money);
		
		}
		
		
		
		
	}

}
