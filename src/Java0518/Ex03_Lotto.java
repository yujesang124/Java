package Java0518;

public class Ex03_Lotto {
	public static void main(String args[]) {
		// 배열을 사용해서 로또만들기
		int lotto[] = new int[7];
		System.out.println("lotto.length : " + lotto.length);
		
		System.out.println("이번주 당점번호는");
		
		
		for(int i=0; i<lotto.length; i++) {
			
			lotto[i] = (int)(Math.random()*45) +1;
			
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}// 중복 값 제거를 위한 반복문
			}
			
			
		}
		for(int k=0; k<lotto.length; k++) {
			if(k<lotto.length-1) {
				System.out.print(lotto[k] +  " ");
			}else {
				System.out.println("보너스 번호" + lotto[k]);
			}
			
			
			
		}
		
	}
}
