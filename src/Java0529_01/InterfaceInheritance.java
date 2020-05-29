package Java0529_01;

public class InterfaceInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationC imp = new ImplementationC();
		
		// interface iA를 출력
		InterfaceA iA = imp;
		iA.methodA();
		System.out.println();
		
		// interface iB를 출력
		InterfaceB iB = imp;
		iB.methodB();
		System.out.println();
		
		// interface iA와 iB를 상속받은 iC라는 녀석
		InterfaceC iC = imp;
		iC.methodA();
		iC.methodB();
		iC.methodC();
		System.out.println();
		
	}

}
