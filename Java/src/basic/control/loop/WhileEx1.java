package basic.control.loop;

public class WhileEx1 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * while ��
		 * 
		 *   - ������ ���� ���� ���๮�� �ݺ��ؼ� ���� �� 
		 * 
		 */
		
		int num = 1;
		int sum = 0;
		
		while ( num <= 10) { // num <= 10 ��� true �� ����ϸ� ���� �ݺ�
			sum += num;
			num++; // 11
		}
		
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
		
		
	}
	
}
