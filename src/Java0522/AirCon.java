package Java0522;

public class AirCon {

	/*
	 * 1. get, set 설정
	 * 2. 매개변수 생성자
	 * 3. 기본생성자
	 * 4. toString()
	 * 
	 */
	
	String company;
	int size;
	String color;
	int price;
	int temp;
	//1. get, set 설정
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	// 2.매개변수 생성자 만들기.
	public AirCon(String company, int size, String color, int price, int temp) {
		super();
		this.company = company;
		this.size = size;
		this.color = color;
		this.price = price;
		this.temp = temp;
	}
	// 3.기본생성자 만들기
	public AirCon() {
		super(); // 상속받는다면 super(); 를 쓰고 상속받지않는다면 super();를 지워도 된다.
	}
	//toString
	@Override
	public String toString() {
		return "AriCon [company=" + company + ", size=" + size + ", color=" + color + ", price=" + price + ", temp="
				+ temp + "]";
	}
	
	// 파라미터에 변수 타입과 매개변수를 넣는다.
	
	
	
	
	
}
