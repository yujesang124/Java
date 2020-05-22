package Java0522;

import java.util.Calendar;

public class ExDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// JAva를 통해서 날짜를 출력하는 함수를 만든다.
		
		Calendar cal = Calendar.getInstance();
				
		// 날짜를 구하기 
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH); 
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int day1 = cal.get(Calendar.DATE);
		int A = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("year = " +  year);
		System.out.println("month = " + month) ;
		System.out.println("day =" + day);
		System.out.println("day1 = " + day1);
		System.out.println("A =  " + A);		
		System.out.println(year + "년" + month + "월" + day+ "일");
		
		//시간구하기
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int hour1 = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println("hour = " + hour);
		System.out.println("hour1 = " + hour1);
		System.out.println("minute = " + minute);
		System.out.println("second = " + second);
		
		System.out.println("지금 시간은 " + hour +"시 " + minute + "분" + second + "초" );
		
		//요일구하기
		String []DAY = {"일", "월", "화", "수", "목", "금", "토"};
		
		String today = DAY[cal.get(Calendar.DAY_OF_WEEK)-1];
		
		System.out.println("오늘은 " + today + "요일입니다.");
		
		//특정날짜 설정하기
		System.out.println("특정날짜 설정 ");
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2020,9 , 20, 16, 50);
		System.out.println(cal2.getTime());
		
		//날짜변경하기
		
//		System.out.println("====7일=====");
//		cal2.add(day1, 7); //
//		System.out.println(cal2.getTime());
//		cal2.add(month, -6);
//		System.out.println(cal2.getTime());

		
		
		Calendar myBirth = Calendar.getInstance();
		
		myBirth.set(1994, 11, 04, 02, 05);
		System.out.println(myBirth.getTime());
		
		myBirth.set(1994, 11, 04, 6, 02, 05);
		System.out.println(myBirth.getTime());
		
		
		
		
		
	}

}
