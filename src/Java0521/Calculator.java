package Java0521;
public class Calculator {

	// 메소드
	int add(int x, int y) {

		// x + y
		// 첫번째방법
		int result = x + y;
		return result;

		// 두번쨰방법
		// return x+y;
	}

	double avg(int x, int y) {
		double sum = add(x, y);
		double result = sum / 2;
		return result;
	}

	void excute(int x, int y) {
		double result = avg(x, y);
		System.out.println("실행결과 : " + result);
	}
	// return을 입력하게 되면
	// return 이후에 문장들은 오류가 나타남

}