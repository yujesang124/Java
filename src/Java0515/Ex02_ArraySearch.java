package Java0515;

import java.util.Scanner;

public class Ex02_ArraySearch {

	public static void main(String args[]) {
		int num[] = {8, 2, 3, 5,6}; // num라는 변수안에 1~10까지의 수를 무작위로 10개를 놓는다
		
		int value; // 여기서 value는 우리가 input할 숫자 변수
		int index = 0; // index는 0부터 시작한다. index는 몇번째라고 우리가 출력할 값
		
		Scanner sc =new Scanner(System.in); //scanner를 이용해서 입력할 다리를 만든다.
		
		System.out.print("1~10사이 숫자입력 :"); // 1부터 10까지 숫자중 입력할 포트창
		
		value = sc.nextInt(); // value와 scanner를 이어주는 nextInt를 넣어준다.
		
		for(int i=0; i<num.length; i++) { // 
			if(value ==num[i]) { //
				index = i+1; // array는 0번쨰부터 시작하는데 우리가 숫자 세는건 1번째니까 +1을 해준다.
			}
		}
		System.out.println(value + "는 " + index + "번째 있다.");
	}
}
