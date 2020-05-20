package Java0520;

public class EX04_IciaStuMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Ex04_IciaStu infoAll1 = new Ex04_IciaStu("유제상",27, 
				"youtube관리하기", "인천시 계양구", "1994-12-04");
		infoAll1.age();
		infoAll1.showGroupInfo();
		Ex04_IciaStu infoAll2 = new Ex04_IciaStu("이은솔", 25,
				"드라마 시청하기", "인천시 미추홀구", "1996-06-18" );
		infoAll2.age();
		infoAll2.showGroupInfo();
		Ex04_IciaStu infoAll3 = new Ex04_IciaStu("강지수", 27,
				"youtube 시청", "인천시 서구", "1994-04-27");
		infoAll3.age();
		infoAll3.showGroupInfo();

//			  stu3.age(); // 메소드 age를 먼저 호출해야 나이 변함
//			  stu3.showInfo();
		
		
		
	}

}
