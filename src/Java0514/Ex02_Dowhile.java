package Java0514;

public class Ex02_Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// do-while
		
		/*
		 	do{
		 		반복할 내용
		 	}while(조건식);
		 */
		int i =11;
		do {
			System.out.println("do-while에서의 i 값 " + i);
			i++;
		}while(i <=10);
		
//		while(i<=10) {
//			System.out.println("while에서의 i 값 " + i);
//			i++;
		 //	while 문은 실행하기 앞서서 조건식을 확인하고 do-while은 sysout 창을 먼저 실행하고 그 다음에 조건식을 실행하기 때문에
		 // 조건식이 맞지않아도 일단 do-while 에서의 i값을 출력한다.(무조건 반복문 1번은 실행된다.)
//		}
		
	}

}
