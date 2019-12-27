package control;

import java.util.Scanner;

public class ControlQuestion3 {

	/*
	 * 
	 * 제어문 문제 2
	 * 
	 *   - 다음 다이아몬드를 출력
	 *   
	 *      *
	 *     ***
	 *    *****
	 *   *******
	 *    *****
	 *     ***
	 *      *
	 * 
	 */

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("홀수값을 입력하세요 : ");
	
		int lineCnt = sc.nextInt();
		int spaceCnt = lineCnt / 2;
		int starCnt = 1;
		
		for (int i=0; i < lineCnt; i++) {
			
			for (int j=0; j < spaceCnt; j++) {
				System.out.print(" ");
			}
			
			for (int j=0; j < starCnt; j++) {
				System.out.print("*");
			}
			
			if (i < lineCnt / 2) {
				
				spaceCnt -= 1;
				starCnt += 2;
				
			} else {
				
				spaceCnt += 1;
				starCnt -= 2;
				
			}
			
			System.out.println();
			
		}
		
		
		
		
		
		
	}
	
}
