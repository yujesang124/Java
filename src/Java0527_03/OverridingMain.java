package Java0527_03;

public class OverridingMain {
	//오버라이딩 상속받은 후 재정의 된 값이 나오는 것  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingChild oc = new OverridingChild();
		System.out.println("size는 17이 출력될까?(parents)");
		System.out.println("아니면 20평이 출력될까?(Child)");
		System.out.println("결과는 : " + oc.size);
		
		oc.size = "30평";
		System.out.println("결과는 : " + oc.size);
		
		System.out.println("오버라이딩 메소드 확인 !");
		System.out.println(oc.parentMethod());
		System.out.println("pM 메소드 확인 ! ");
		oc.pM();
		
	}

}
