package Java0522;

public class PrChMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child(); // child클래스에서 가져온 child객체
		System.out.println(child.ParentVar);
		System.out.println(child.childVar);
		
		child.parentMethod();
		child.childMethod();
		
		//child class 가 parent class 를 상속받았기 때문에 Main class 에서
		//child class 를 가져오면 자동으로 parent class도 가져온다.
		
		
	}

}
