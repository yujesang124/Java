package Java0522;

import java.util.Scanner;

public class MyDateMain  {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		MyDate md = new MyDate();
		
		System.out.println("년도를 입력하세요. :");
		int year = sc.nextInt();
		md.setYear(year);
		System.out.println("월을 입력하세요. :");
		int month = sc.nextInt();
		md.setMonth(month);
		System.out.println("일을 입력하세요. :");
		int day = sc.nextInt();
		md.setDay(day);
		
		System.out.println("확인중" + md.toString());
		System.out.println(md.getYear() + "년" + md.getMonth() + "월" 
		+ md.getDay() + "일" );
		System.out.println(md.isValid());
		
		
	}
}
