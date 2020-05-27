package Ex0527;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member("황인철","inchoriya");
		
		member.password = "12345";
		
		boolean rsl = member.login("inchoriya", "12345");
		
		if(rsl) {
			System.out.println("로그인 성공!");
			member.logout("inchoriya");
		}else {
			System.out.println("id 또는 password가 올바르지않습니다.");
		}
	}

}
