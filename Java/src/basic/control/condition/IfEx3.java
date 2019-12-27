package basic.control.condition;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		
		/*
		 * ������ ���� ���� �ο��ϱ�
		 * 
		 *   - 100 ~ 90 : A
		 *   -  89 ~ 80 : B
		 *   -  79 ~ 70 : C
		 *   -  69 ~ 60 : D
		 *   -     ~ 59 : F 
		 */
		
		Scanner sc = new Scanner(System.in); // System.in : �Է¿� ��Ʈ��
		
		int score = sc.nextInt();
		
		String grade = "";
		
		if (score <= 100 && score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		System.out.println("���� : " + score);
		System.out.println("���� : " + grade);
		
		sc.close();
		
	}
	
}
