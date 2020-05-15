package Java0515;

public class Ex03_ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str1 = {"황인철, 양기두, 임훈짱"} ;
		String[] str2 = new String[3]; //지금은 아무 값도 없지만 방이 3개인 방을 만들거다. 라는 것을 선언.
		
		// str1 = 3명의 사람이 있음.
		// str2 = ㅁ ㅁ ㅁ. 빈 ㅁ  이 있음.
		
		
		// str1[0] = 황인철  str2[0] = null;
		// str1[1] = 양기두  str2[0] = null;
		// str1[2] = 임훈짱  str2[0] = null;
		
		System.arraycopy(str1, 1, str2, 0, str1.length-1);
		
		for(int i=0; i<str1.length; i++) {
			str2[i] = str1[i];
			System.out.print("str1[" + i  + "] =" + str1[i]);
			System.out.println("\t str2[" + i + "] = " + str2[i]);
			
		}
		
		System.out.println("-------------------------------------------------------------");
		// 같은 결과를 한줄로 str1 을 str2로 copy할 수 있다.
		
		
		// 				(복사할 배열명, 복사를 시작할 인덱스번호, 붙여넣기할 배열명, 붙여넣을 배열명, 불여넣기 시작할 인덱스번호, 복사 할 배열 크기) 
		
		
		
	}

}
