package operator;

public class OperatorEx4 {

	public static void main(String[] args) {
		
		/*
		 * ����, ���� ������ (���� ������)
		 * 
		 *   ++ : ���� ���� 1�� ����
		 *   
		 *     - val = ++num; // ���� num ���� 1 ������ �� val ������ ����
		 *     - val = num++; // val ������ ���� num ���� ���� ������ �� num �� 1 ����
		 *     
		 *   -- : ���� ������ 1�� ��
		 *   
		 *     - val = --num; // ���� num ���� 1 ������ �� val ������ ����
		 *     - val = num--; // val ������ ���� num ���� ���� ������ �� num �� 1 ����
		 *   
		 *     - 
		 */
		
		int score = 100;
		
		System.out.println(++score);
		// score = score + 1;
		// score += 1;
		
		System.out.println(score++); // score 101�� ����ϰ� ���� 1 ���� ��Ŵ
		System.out.println(score);
		
		System.out.println(--score);
		System.out.println(score--); // score 101�� ����ϰ� ���� 1 ���� ��Ŵ
		System.out.println(score);
		
	}
	
}
