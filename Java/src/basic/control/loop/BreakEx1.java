package basic.control.loop;

public class BreakEx1 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * break ��
		 * 
		 *   - ���ΰ� �ִ� ���(�ݺ���)�� ��� ���������� ���
		 *   - ��ø �ݺ����� ��� ���� �ݺ��� �ȿ��� break�� ����ϸ� ���� �ݺ����� �������´�.
		 * 
		 */
		
		/*
		 * 
		 * 1���� 1�� ������ ���� ��� ���� ��(1 + 2 + 3 + ...) �հ� ���� 100�� ���� ���� ���� ���
		 * 
		 */
		
		int num = 1;
		int sum = 0;
		
		boolean b = true;
		
		while (b) {
			
			sum += num;
			
			if (sum > 100) {
				System.out.println("num : " + num);
				System.out.println("sum : " + sum);
				break;
			}
			
			num++;
			
		}
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println();
		
		int num2 = 1;
		int sum2 = 0;
		
		
		for (num2=1; sum2 <= 100; num2++) { //  num2++ ������ ���� �ݺ��� ���� �� num2 �� ���� 1 ������ ���� (14 -> 15)
			sum2 += num2;
		}
			
		System.out.println("num2 : " + num2);
		System.out.println("sum2 : " + sum2);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println();
		
		int num3 = 1;
		int sum3 = 0;
		
		for (num3=1; sum3 <= 100; num3++) {
			
			sum3 += num3;
			if (sum3 > 100) break; // break �� ����Ͽ� �ݺ����� ����� �� num3++ �� ���� num3 ���� 1 �����ϴ� ���� ���� �� for���� �����.
			
		}
		
		System.out.println("num3 : " + num3);
		System.out.println("sum3 : " + sum3);
		
	}
	
}
