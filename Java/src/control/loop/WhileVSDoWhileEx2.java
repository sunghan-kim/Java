package control.loop;

import java.util.Scanner;

public class WhileVSDoWhileEx2 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * while�� vs do-while ��
		 * 
		 *   - �Է� ���� ������ ��� �����ش�.
		 *   - �Էµ� ������ 0�̸� �ݺ����� ���� ���ɴϴ�.
		 * 
		 */
		
		// while �� ����Ͽ� ����
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int sum = 0;
		
		while(input != 0) {
			
			sum += input;
			
			input = sc.nextInt(); // input�� �ٽ� �޾ƾ� �Ѵ�.
			
		}
		
		System.out.println("sum : " + sum);
		
		sc.close();
		
	}
	
}
