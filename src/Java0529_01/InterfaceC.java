package Java0529_01;

public interface InterfaceC extends InterfaceA, InterfaceB{
	// interface를 상속받을 때는 class를 상속받는것과 다르게 다중 Interface 상속이 가능하다.
	// interface <-> interface를 상속받을 때는 class <-> class 상속받는 것처럼 extends를 사용한다.
	public void methodC();
	
}
