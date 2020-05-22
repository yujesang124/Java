package Java0522;

public class MyDate {

	/*
	 * 
	 * 1. MyDate, MyDateMain 클래스 생성
	 * 
	 * 
	 * 
	 * 
	 * 6. MyDateMain클래서에서 생성한 MyDate날짜가 유효한지 확인
	 * 
	 */
	// 2. day, month,year변수는 private으로 선언
	private int year;
	private int month;
	private int day;
	boolean isValid = true;

	private MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		// 3. 각 변수의 get,set 메소드를 public 으로 생성
	}

	public MyDate() {
		// TODO Auto-generated constructor stub
	}

	public int getYear() {
		System.out.println("getYear : " + year);
		System.out.println("getMonth isValid : " + isValid);
		return year;
	}

	public void setYear(int year) {
		if (year < 0) {
			isValid = false;
		} else {
			this.year = year;
		}

	}

	public int getMonth() {
		System.out.println("getMonth : " + month);
		System.out.println("getMonth isValid : " + isValid);
		return month;
	}

	public void setMonth(int month) {
		if (month > 0 && month <= 12) {
			this.month = month;
		} else {
			isValid = false;
		}
	}

	public int getDay() {
		System.out.println("getDay : " + day);
		System.out.println("getDay isValid : " + isValid);
		return day;
	}

	public void setDay(int day) {

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (day > 0 && day <= 31) {
				this.day = day;
			} else {
				isValid = false;
			}
		case 4:
		case 6:
		case 9:
		case 11:
			if (day > 0 && day <= 30) {
				this.day = day;
			} else {
				isValid = false;
			}
			break;
		case 2:
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				if (day > 0 && day <= 29) {
					this.day = day;
				} else {
					isValid = false;
				}
			} else {
				if (day > 0 && year <= 28) {
					this.day = day;
				} else {
					isValid = false;
				}
			}
			break;
		default:
			isValid = false;

		}
		this.day = day;
	}

	public String isValid() {
		if (isValid) {
			return "유효한 날짜입니다.";
		} else {
			return "유효하지 않은 날짜입니다.";
		}

	}

	// 4. MyDate(int day, int month, int year) 생성자 만들기
	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	// 5. public boolean isValid() 메소드로 날짜가 유효한지 확인

}
