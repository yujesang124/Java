package Java0528_02;

public abstract class Computer {
	// computer -> DeskTop ->NoteBook(여기서 display재정의) -> MyNoteBook(여기서 typing재정의 했음으로 typing과 disply 둘다 재정의 됨)
	// -> ComputerMain
	// 추상메소드
	// display(), typing()
	public abstract void display();
	public abstract void typing();
	
	// 메소드
	// turnOn(), turnOff()
	public void turnOn(){
		System.out.println("전원을 킵니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	//public void
}
