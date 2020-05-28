package Java0527_03;

public class OverridingChild extends OverridingParent{
	String size = "20평";
	
	// 메소드
	String parentMethod() {
		return "오버라이딩으로 자식메소드 재정의";
	}
	
	void pM() {
		System.out.println("pM()상속 후 호촐");
	}
}
