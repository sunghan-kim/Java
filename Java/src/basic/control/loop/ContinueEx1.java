package basic.control.loop;

public class ContinueEx1 {

	public static void main(String[] args) {
		
		
		/*
		 * 
		 * continue ��
		 * 
		 *   - �ݺ��� ���� �� ���ǹ��� ������ �´� ��� ���� ��� ������ �ٸ� ���๮�� �������� ����
		 * 
		 */
		
		/*
		 * 1~100 �� 3�� ����� ����ϴ� ���� ����
		 * 
		 */
		
		for (int num = 1; num <= 100; num++) {
			
			if (num % 3 == 0) {
				System.out.println(num);
			}
			
		}
		
		System.out.println();
		
		for (int num = 1; num <= 100; num++) {
			
			if (num % 3 != 0) continue; // continue ���
			
			System.out.println(num);
			
		}
		
		
		
	}
	
}
