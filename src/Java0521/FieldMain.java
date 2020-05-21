package Java0521;

public class FieldMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. 멤버변수(field) : 객체가 생성될 때 각 객체별로 초기화
		 * 					: 선언시 초기화 하지 않으면 초기값 설정
		 * 2. static변수 : 객체를 생성하지 않아도 참조 가능
		 * 3. 로컬변수 : 클래스영역이 아닌 부분에서 선언되는 변수
		 *  		: 메소드나 초기화 블록에 선언되는 변수
		 * 
		 * 
		 */
		
		//로컬변수
		int temp =0;
		
		
		//Field fd = new Field();
		
		//System.out.println("fd.size = " + fd.size);
		//System.out.println("fd.price = " + fd.price);
		
		System.out.println("Field.price = " + Field.price ); //객체 선언하지 않고 class자체에서 price값 가져오기
															 // <- int 앞에 static이 붙는조건
		Field fd2 = new Field(99); // int size = 99 인 객체
		System.out.println("fd2.size = " + fd2.size);
		// 필드값이 어떻게 순서가 정해지는지.
		// 1. Field 에서 넣어준 값 size 18
		// 2. 위에서 Field(99)를 넣어준 것
		// 3. 아래에 13을 넣어준 것.
		fd2.size = 13;
		System.out.println("fd2.size = " + fd2.size);
		// 로컬변수 temp 출력
		System.out.println("temp = " + temp);
		
		Field numbers = new Field(15);
		// 데이터 범위가 가장 큰 변수타입으로 나온다.
		// 만약 short 나 byte를 불티고 싶으면 객체 생성에서 new Field((btye)15); 이렇게 바꿔주면 그 타입의 값에 출력이 가능하다.
		numbers.showInfo();
		
		
		}
		
	}
	


