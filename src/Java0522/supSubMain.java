package Java0522;

public class supSubMain {
	public static void main(String[] args) {
		SubSub ss = new SubSub();
		
		System.out.println("ss.x : " + ss.x);
		System.out.println("ss.y :" + ss.y);
		System.out.println("ss.z :" + ss.z);
		
		ss.superMethod();
		ss.subMethod();
		ss.subSubMethod();
		
	}
	
	
	
	
	
}
