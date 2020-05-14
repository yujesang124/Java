package Java0508;

public class ex02_CompareOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5;
		int num2 = 3;

		boolean rsl;
		rsl = num1 > num2;
		System.out.println("num1이 num2 보다 크냐? " + rsl);
		System.out.println(num1 + " > " + num2 + " : " + rsl);

		rsl = num1 < num2;
		System.out.println("num2이 num1 보다 크냐? " + rsl);
		System.out.println(num1 + " < " + num2 + " : " + rsl);

		// 문제1. num1과 num2 이 같다. 라는 것을 표현해보시오.

		rsl = num1 == num2;
		System.out.println("num1이 num2 랑 같냐? " + rsl);
		System.out.println(num1 + " = " + num2 + " : " + rsl);

		rsl = num1 != num2;
		System.out.println("num1과 num2 가 다르냐? " + rsl);

		// 문자열 같은지 비교 ★중요!

		String str1 = "Java";
		String str2 = "Java";
		String str3 = "java";

		rsl = str1.equals(str2);
		System.out.println(rsl);
		System.out.println("str1이 str2와 같느냐? " + rsl);
		System.out.println(str1 + " = " + str2 + " : " + rsl);
		// 문자열 비교할 땐 비교기준이 되는 변수 뒤에 . 을 붙이고 equals를 찾는다 그리고 대상이 되는
		// str2를 (str2) 이렇게 괄호에 넣고 syso rsl를 해서 돌려본다.
		rsl = str1.equals(str3);
		System.out.println("str1이 str3과 같느냐?" + rsl);
		System.out.println(str1 + " == " + str3 + " : " + rsl);
	}

}
