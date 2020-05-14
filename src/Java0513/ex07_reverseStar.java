package Java0513;

public class ex07_reverseStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			for(int k=5; k>=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
