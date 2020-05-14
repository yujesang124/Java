package Java0513;

public class ex09_reverseStarEX {
	public static void main(String args[]) {
		
//		for(int i=1; i<=5; i++){
//			for(int j=5; j>=i;j--){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for(int i=1; i<=4; i++) { //줄 1-2-3-4
			System.out.println(" ");
			for (int j=1; j<=4-i; j++) { // 공백 
			System.out.print(" ");
			}
			for (int k=1; k<=2*i-1; k++) { // 
			System.out.print("*");	
			}
		}
		
	}	
		
}

