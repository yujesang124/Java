/*
 Date : 20.05.08
 Author : JasonYu
 Description : ex02_day01 
 Version : 1.0
 */

package Java0508;

public class ex02_day01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String birth;
		int age;
		String address;
		String phone;
		String email;
		String hobby;
		String speciality;
		String member1;

		name = "유제상";
		birth = "94.12.04";
		age = 27;
		address = "인천시 계양구 행복동";
		phone = "010-1234-5678";
		email = "yujesang124@gamil.com";
		hobby = "배드민턴";
		speciality = "Youtube 관리";
		member1 = "황인철";

		System.out.println(
				"제 이름은 " + name + "입니다. 제 생년월일은" + birth + "입니다. 제 나이는" + age + "세 입니다. 제 주소는 " + address + "입니다. ");
		System.out.println("제 휴대폰 번호는 " + phone + "입니다. 제 이메일 주소는" + email + "입니다." + " 제 취미는 " + hobby + "입니다. 특기는"
				+ speciality + "입니다.");
		System.out.println("제 선생님의 성함은 " + member1 + "입니다. 끝");

	}

}
