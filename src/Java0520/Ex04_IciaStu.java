package Java0520;

public class Ex04_IciaStu {

	// ICIA 교육원에 다니는 JS반 훈련생에 대한 클래스 만들고 메인 클래스에서 각자
	// 같은 조원들에 대한 객체를 각각 선언해서 출력

	// 이름,나이, 취미, 주소, 생년월일

	// 그사람 정보를 모두 출력하는 메소드 생성
	// 호출 시 나이를 한살 추가하도록 하는 메소드 생성


	// ICIA 교육원에 다니는 JS반 훈련생에 대한 클래스 만들고
	 // 메인 클래스에서 각자 같은 조원들에 대한
	 // 객체를 각각 선언해서 출력!
	 
	 // 이름, 나이, 취미, 주소, 생년월일
	 String name;
	 int age;
	 String habit;
	 String address;
	 String birth;
	 
	 
	 Ex04_IciaStu(String name, int age, String habit,
	   String address, String birth){
	  this.name = name;
	  this.age = age;
	  this.habit = habit;
	  this.address = address;
	  this.birth = birth;
	  
	 }
	 
	 
	 void showGroupInfo() {
	  System.out.println("name : " + name + "\nage : " + 
	 age + "\nhabit : " + habit + "\naddress : " + address + 
	 "\nbirth : " + birth + "\n");
	 }
	 
	 int age() {
	  int result = age--;
	  return result;
	 }
	 

	 // 그 사람 정보를 모두 출력하는 메소드 생성
	 
	 // 호출시 나이를 한살 추가하도록 하는 메소드 생성
	 // void 말고 다른 데이터타입 사용!

}
