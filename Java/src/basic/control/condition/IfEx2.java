package basic.control.condition;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		
		/*
		 * ����� ����
		 */
		
		Scanner sc = new Scanner(System.in); // System.in : �Է¿� ��Ʈ��
		
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
		
		System.out.println("���� : " + age);
		System.out.println("��� : " + change);
		
		sc.close();
		
	}
	
}
