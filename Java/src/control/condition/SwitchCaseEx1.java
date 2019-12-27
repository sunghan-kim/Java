package control.condition;

import java.util.Scanner;

public class SwitchCaseEx1 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * switch-case 문
		 * 
		 *   - 조건이 정수, 문자열 값으로 그 값에 따라 수행 결과가 달라지는 경우
		 *     if-else if-else 와 같은 의미로 수행
		 *     
		 *   - case 문 사용 시 break를 꼭 써줘야 한다.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("순위 입력 : ");
		int rank = sc.nextInt();
		String medalColor = "";
		
		
		switch(rank) {
			case 1: 
				medalColor = "G";
				break; // break를 사용하지 않으면 case 1 에 부합함에도 불구하고 case 2, case 3 이 모두 수행된다.
			case 2: 
				medalColor = "S";
				break;
			case 3: 
				medalColor = "B";
				break;
			default:
				medalColor = "A";
		}
		
		System.out.println("순위 : "  + rank);
		System.out.println("매달 색상 : "  + medalColor);
		
		sc.close();
		
		
		/*
		 * 
		 * java 7 부터는 문자열을 조건으로 사용 가능해 졌다.
		 * 
		 */
		
		 
		
	}
	
}
