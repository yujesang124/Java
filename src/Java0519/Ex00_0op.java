package Java0519;

public class Ex00_0op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체지향프로그래밍
		//OOP(object-oriented-programming)
		// 프로그래밍 하기 위해 단위(각체)로 잘게 나눠서 코딩
		// 다시 이것들을 조립해서 복잡한 프로그램을 만드는 것
		
		// 절차지향 프로그램 vs 객체지향 프로그램
		// 절차지향 프로그램 : 순서대로 진행되는 프로그램
		// 		ex) 급식소에서 줄을 서서 밥을 먹는 것
		//				  맞춤옷 : 원하는 형태로 만들어서 입는 것
		// 객제치향 프로그램 : 객체(클래스)라는 작은 단위로 프로그래밍 하는 것을 말합니다.
		// 		ex) 뷔페에서 내가 원하는 음식을 가져야 먹는 것
		//				 기성옷 : 내 몸에 맞는 것을 골라 입는 것
		// 		단점 : 불필요한 메모리가 생길 수 있음.
		
		// 객체 모델링(Object Modeling)
		// 현실 세계의 객체를 소프트웨어 객체로 설계하는 것.
		
		// 클래스 vs 객체 비교
		// 클래스 : 설계도
		// 객체를 정의해 놓은 것, 객체를 만들기 위한 것
		// 커피머신, 토스트 설계도, 스마트폰 설계도
		
		
		// 객체 : 실제로 존재하는 사물이나 개념
		// 클래스 모양 그대로 생성된 실체
		// 커피, 토스트, 스마트폰
		
		// 객체(Object) : 다른 것과 식별이 가능한 것
		// 자신만의 고유한 특성과 행동을 가지며, 다른 객체들과 상호작용을 한다.
		// 클래스에서는 인스턴스(instance)라고 불린다.
		
		//객체 특성 3가지
		// (1)캡슐화(Encapsulation) : 정보은닉
		// (2)상속(Inheritance) : 부모-자식 상속
		// (3)다형성(Polymorphism) : 상속에서 사용, 같은코드 - 다른출력
		
		// 클래스의 3요소
		/*
		 * (접근제어자) class 클래스명{
		 * 		필드 정의;
		 * 		생성자 정의;
		 * 		메소드 정의;
		 * }
		 */
		
		// (1)필드(field) : 속성,상태,특성
		// -> 명사형
		// -> 멤버변수라고도 함.
		// -> 값의 상태를 관리
		// -> 데이터를 저장하는 공간
		// -> int size =6;
		
		// (2) 메소드(method) : 동작, 행동, 기능
		// -> 동사형으로 사용
		// -> 특정기능을 정의한 블록
		// -> 메소드가 호출되면 자신이 가지고 있는 기능을 수행
		// -> 기능 수행이 끝나면 리턴값 존재.
		
		// (3) 생성자(constructor) 
		// -> 객체를 만들 때 따라야 하는 규칙정의
		// -> 객체 생성을 도와주는 블록
		// -> 생성자 이름은 클래스이름과 동일
	}

}