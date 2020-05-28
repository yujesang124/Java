package Java0527;

public class Salesman3 extends Employee3{
	String name = "홍길동 친구";
	
	String getNameLocal() {
		String name = "임훈짱";
		return name;
	}
	
	String getNameThis() {
		String name = "임훈짱";
		return this.name;
	}
	
	String getNameSuper() {
		String name = "임훈짱";
		return super.name;
	}
}
