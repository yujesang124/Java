package Java0527_02;

public class IciaStudent extends IciaPerson{
	String classroom;
	int grade;
	
	@Override
	public void finish() {
		System.out.println("교육생은 4시50분에 퇴실한다.");
	}
	
}
