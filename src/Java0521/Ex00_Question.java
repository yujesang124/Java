package Java0521;

public class Ex00_Question {
	// 필드 선언
	String company;
	
	// 생성자
	Ex00_Question(){
		
	}
	
	
	//메소드
	void showInfo() {
		System.out.println("정보출력");
		return; // void도 포함해서 모든 함수에는 리턴함수가 존재한다. 짝이 맞지만 void는 리턴값이 없다.
	}
	
	
	int add(int x, int y) {
		
		return x+y;
	}
	
	public static void main(String[] args) {
		Ex00_Question sc = new Ex00_Question();
		// 초기화
		sc.company = "Samsung";
		System.out.println(sc.company);
		
		// 호출
		
		sc.showInfo();
		
		// return 값을 확인
		// sc.add(x, y);
		// sc.add(10, 5);
		// System.out.println(sc.add(10, 5));
		
		int mul = sc.add(2,3) * 10;
		System.out.println("mul : " + mul);
	}
	
}
