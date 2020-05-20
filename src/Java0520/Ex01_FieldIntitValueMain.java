package Java0520;

public class Ex01_FieldIntitValueMain {

	
	public static void main(String[] args) {
		
		Ex01_FieldIntitValue FieldV = new Ex01_FieldIntitValue(); 
		// 정수형 초기값 확인
		System.out.println("\n 정수형 초기값 확인");
		System.out.println("byteField : " + FieldV.byteField);
		System.out.println("shortField : " + FieldV.shortField);
		System.out.println("intField : " + FieldV.intField);
		System.out.println("longField : " + FieldV.longField);
		
		// 실수형 초기값 확인
		System.out.println("\n 실수형 초기값 확인");
		System.out.println("floatField : " + FieldV.floatField);
		System.out.println("doubleField : " + FieldV.doubleField);
		System.out.println();
		//문자형 초기값 확인
		System.out.println("\n 문자형 초기값 확인");
		System.out.println("charField : " + FieldV.charField);
		System.out.println();
		// 논리형 초기값 확인
		System.out.println("\n 논리형 초기값 확인");
		System.out.println("booleanField : " + FieldV.booleanField);
		System.out.println();
		// 배열 초기값 확인
		System.out.println("\n 배열 초기값 확인");
		System.out.println("arrField : " + FieldV.arrField);
		System.out.println();
		// 참조형 초기값 확인
		System.out.println("\n 참조형 초기값 확인");
		System.out.println("referenceField : " + FieldV.refrenceField);
		
		
		
	}
}
