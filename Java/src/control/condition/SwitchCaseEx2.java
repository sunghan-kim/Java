package control.condition;

import java.util.Scanner;

public class SwitchCaseEx2 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * switch-case 문 문제
		 * 
		 *   각 월에 따른 한달 날짜 수를 day 변수 값으로 출력 (2월은 28일로 한다.)
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력 : ");
		
		int month = sc.nextInt();
		
		int dayCnt = 0;
		
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: // 여러 조건이 동일한 값을 가질 때는 이와 같이 쓸 수 있다.
				dayCnt = 31;
				break;
			case 2:
				dayCnt = 28;
				break;
			case 4: case 6: case 9: case 11:
				dayCnt = 30;
				break;			
			default:
				System.out.println("Error");
				
		}
		
		System.out.println(month + "월은 " + dayCnt + "일 입니다.");
		
		sc.close();
		
		
	}
	
}
