package Java0520;

public class Ex03_AirCon {

	

		
		String company;
		String color;
		int size;
		int temp;
		int price;
		
		
		// 생성자 오버로딩 : 각각 다른 매개변수로 생성자를 여러개 만드는 것
		
		
		
		
		
		//기본생성자
		Ex03_AirCon(){
			
		}
		// 매게변수 (int size)
		Ex03_AirCon(int Size){
			this.size = Size;
		}
		
//		// 매개변수(String company, String color)
//		Ex03_AirCon(String color, String company){
//			this.color = color;
//			this.company = company;
//		}
		// 매개변수 순서만 바꿔서 사용 할 수 없다.
		Ex03_AirCon(String company, String color, int size, int temp, int price){
			this.company = company;
			this.color = color;
			this.size = size;
			this.temp = temp;
			this.price = price;
		}
		
		// main 클래스에서 객체 생성하기
		

		// 메소드
		void showInfo() {
			System.out.println("\ncolor : " + color +"\nsize : " + size + "\nprice : " + price + "\ntemp :" + temp);
		}
		
		void onPower() {
			System.out.println("Power on!");
		}
		
		void offPower() {
			System.out.println("Power on!");
		}
		
		
		
		
		
		
		
		
	}


