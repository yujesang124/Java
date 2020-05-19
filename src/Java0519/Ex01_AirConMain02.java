package Java0519;

public class Ex01_AirConMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex01_AirCon airCon1 = new Ex01_AirCon();
		Ex01_AirCon airCon2 = new Ex01_AirCon();
		
		airCon1.color = "Black";
		airCon2.color = "White";
		System.out.println("airCon1.color : " + airCon1.color);
		System.out.println("airCon2.color : " + airCon2.color);
		//한 클래스에서는 여러개의 개체가 사용가능하다.
		// airCon1 필드값 초기화 + 메소드 호출
		String company;
		String color;
		int price;
		int size;
		int temp;
		
		System.out.println("==필드값 선언, 메소드 호출 ==");
		
		airCon1.downTemp();
		airCon1.upTemp();
		airCon1.onPower();
		airCon1.offPower();
		
		airCon1.size = 100;
		airCon2.size = 80;
		
		airCon1.price = 1234567;
		airCon2.price = 7654321;
		
		airCon1.temp = 23;
		airCon2.temp = 23;
		airCon1.downTemp();
		airCon2.upTemp();
		
		airCon1.company = "SamSung";
		airCon2.company = "LG";
		System.out.println("에어컨1  가격은: " + airCon1.price);
		System.out.println("에어컨1  색깔은: " + airCon1.color);
		System.out.println("에어컨1  사이즈: " + airCon1.size);
		System.out.println("에어컨1  온도는: " + airCon1.temp);
		System.out.println("에어컨1  회사는: " + airCon1.company);
		System.out.println();
		System.out.println("에어컨2  가격은: " + airCon2.price);
		System.out.println("에어컨2  색깔은: " + airCon2.color);
		System.out.println("에어컨2  사이즈: " + airCon2.size);
		System.out.println("에어컨2  온도는: " + airCon2.temp);
		System.out.println("에어컨2  회사는: " + airCon2.company);
		
		airCon2 = airCon1;
		System.out.println("===== airCon2 = aircon1  ======");
		System.out.println("에어컨2  가격은: " + airCon2.price);
		System.out.println("에어컨2  색깔은: " + airCon2.color);
		System.out.println("에어컨2  사이즈: " + airCon2.size);
		System.out.println("에어컨2  온도는: " + airCon2.temp);
		System.out.println("에어컨2  회사는: " + airCon2.company);
		
		
		
	}

}
