package Java0521;

public class StaticMethodMain {

	public static void main(String[] args) {
		// StaticMethod.memMethod1();
		StaticMethod st = new StaticMethod();
		
		//static메소드랑 
		st.memVar =0;
		
		st.memMethod1();
		
		st.staticVar = 0;
		st.staticMethod1();
		
		StaticMethod.staticVar = 0;
		
//		StaticMethod.staticMethod2();
//		staticMethod2();
//		int local = staticVar;
		// local = memVar
	}

}
