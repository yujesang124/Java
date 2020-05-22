package Java0522;

public class Search {

	Member[] members = new Member[4];
	public Search() {
		members[0] = new Member("가", 30, 100, "인천시 원미구");
		members[1] = new Member("나", 32, 150, "인천시 남동구");
		members[2] = new Member("다", 34, 155, "인천시 남미구");
		members[3] = new Member("라", 36, 160, "인천시 동구");
		// Member 클래스에서 넘어옴
	}
	boolean searchMember(String name) {
		
		boolean boolRsl = false;
		for(int i=0; i<members.length; i++) {
			if(members[i].getName().equals(name)) {
				printInfo(members[i]);
				boolRsl = true;
			}
		}
		
		return boolRsl;
	}
	private void printInfo(Member member) {
		// TODO Auto-generated method stub
		System.out.println(member.getName() + "으로 찾은 결과!");
		System.out.println( "나이" + member.getAge() );
		System.out.println("키" + member.getHeight() );
		System.out.println("주소" + member.getAddr() );
	}
}
