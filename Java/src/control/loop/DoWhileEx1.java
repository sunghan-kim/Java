package control.loop;

public class DoWhileEx1 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * do-while ��
		 * 
		 *   - ���� ���๮�� �����ϰ� ���� üũ
		 *   - �ѹ� �̻� ���๮�� ����Ǿ�� �ϴ� ��� ���
		 *   
		 *   - �ݺ��� �߿� ��� �󵵰� ���� ����
		 * 
		 */
		
		int num = 1;
		int sum = 0;
		
		do {
			
			sum += num;
			num++;
			
		} while (num <= 10);
		
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
		
	}
	
}
