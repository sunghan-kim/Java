package basic.control.condition;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		
		/*
		 * 입장료 계산기
		 */
		
		Scanner sc = new Scanner(System.in); // System.in : 입력용 스트림
		
		int age = sc.nextInt();
		
		int change = 0;
		
		if (age < 8) {
			change = 1000;
		} else if (age < 14) {
		 	change = 1500;
		} else if (age < 20) {
		 	change = 2000;
		} else {
			change = 3000;
		}
		
		System.out.println("나이 : " + age);
		System.out.println("요금 : " + change);
		
		sc.close();
		
	}
	
}
