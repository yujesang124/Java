package Java0521;

public class Field {
	// 멤버변수 
			int size = 18;
			int iNum = 1000;
			short sNum = 100;
			byte bNum = 10;
			// static변수
			static int price = 200;
			
			
			// 기본생성자
			
			//매게변수 : size
//			Field(int size){
//				this.size = size;
//			}
			// 매개변수 : bNum
			// 매개변수 : sNum
			// 매개변수 : iNum
			Field(byte bNum){
				this.bNum = bNum;
			}
			
			Field(short sNum){
				this.sNum = sNum;
			}
			
			Field(int iNum){
				this.iNum = iNum;
			}

			void showInfo() {
				System.out.println("");
				System.out.println("bNum :" + bNum);
				System.out.println("sNum :" + sNum);
				System.out.println("iNum :" + iNum);
			}


			
}
