package Java0528_01;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 추상메소드는 객체를 생성할 수 없다.
		//Animal an = new Animal();
		
		System.out.println("첫번째 : 객체생성");
		Dog dg = new Dog();
		Cat ct = new Cat();
		dg.breath();
		dg.sound();
		ct.breath();
		ct.sound();
		
		System.out.println("두번째 : 자동타입변환");
		
		Animal an = null;
		an = new Dog();
		an.sound();
		an = new Cat();
		an.sound();
		
		System.out.println("세번째 : 다형성(유틸클래스");
		
		AnimalInfo aninfo = new AnimalInfo();
		aninfo.animalSound(dg);
		aninfo.animalSound(ct);
		//객체 생성 이후 사용 가능
		
	}

}

