package Java0527_04;

public class SuperMain3 {
	
	
	public static void main(String[] args) {
		Salesman3 sales3 = new Salesman3();
		System.out.println("local.name : " + sales3.getNameLocal()); // salesman3 메소드 안의 내용
		System.out.println("this.name : " + sales3.getNameThis()); // salesman3에는 클래스 내에서 지정해준 필드값
		System.out.println("super.name : " + sales3.getNameSuper()); // Employee3에 있는 상속받은 값이 출력된다.
	}
	
}
