package Java0522;

import java.util.Scanner;

public class SearchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Search sm = new Search();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("검색할 회원의 이름은? : ");
			String name = sc.next();
			
			boolean searchRsl = sm.searchMember(name);
			if(searchRsl) {
				break;
			}System.out.println("해당 회원이 없습니다.");
		}while(true);
		
		
	}

}
