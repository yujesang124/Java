package Java0528_02;

public class ComputerMain {
	// Computer, DeskTop, NoteBook, MyNoteBook 객체 선언
	
	public static void main(String[] args) {
		/*
		 * 1. 추상클래스는 객체(인스턴스)를 생성하지 못한다.
		 * 2. 추상클래스는 단순힌 상속만을 하기 위해 만든 클래스다.
		 * 3. 하위클래스가 어떤 클래스냐에 따라 구현코드를 다르게 한다.
		 */
		// Computer cp = new Computer(); // 추상클래스여서 객체선언 안된다.
		DeskTop dt = new DeskTop();
		// NoteBook nb = new NoteBook(); //추상클래스여서 객체선언 안된다.
		MyNoteBook mnb = new MyNoteBook();
		
		//3가지 방법으로 객체선정, 자동형변환, 유틸클래스 만들어서 갖고와서 만드는방법으로
		// display(), typing() 호출
		
		dt.display();
		dt.typing();
		mnb.display();
		mnb.typing();
		System.out.println("첫번째 : 객체생성");
		
		Computer cp = null;
		cp = new DeskTop();
		cp.typing();
		cp.display();
		cp = new MyNoteBook();
		cp.typing();
		cp.display();
		
		System.out.println("두번째 : 자동타입변환");
		
		ComputerInfo compinfo = new ComputerInfo();
		compinfo.compinfo(dt);
		compinfo.compinfo(mnb);
		System.out.println("세번째 : 다형성(유틸클래스)");
		
		
	}
	
}
