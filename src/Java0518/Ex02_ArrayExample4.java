package Java0518;

import java.util.Scanner;

/*
		Date : 20.05.18
		Author : JasonYu
		Description : 배열 구구단
		Version : 1.0
	 */
public class Ex02_ArrayExample4 {
	public static void main(String arg[]) {
		int multi[][] = new int[9][8];
		System.out.println("multi.length : " + multi.length);
		
		for(int i=0; i<multi.length; i++) {
			for(int j = 0; j<multi.length; j++) {
				
				multi[i][j] = (i+1)*(j+2);
				System.out.print(j+2 + "x" + (i+1) + "=" + multi[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("multi[0][0] : " + multi[0][0]);
	}
}
