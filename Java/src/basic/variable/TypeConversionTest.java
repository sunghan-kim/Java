package basic.variable;

public class TypeConversionTest {

	public static void main(String[] args) {
		
		/*
		 * ����ȯ
		 * 
		 *   - ���� �ٸ� �ڷ����� ���� ���ԵǴ� ��� �� ��ȯ�� �Ͼ
		 *   
		 *   1. ������ �� ��ȯ (implicit type conversion)
		 *   
		 *     - ���� ������ ū ����
		 *     - �� ������ ������ �� ������ ���� ���ԵǴ� ���
		 *     
		 *   2. ����� �� ��ȯ (explicit type conversion)
		 *   
		 *     - ��ȯ�Ǵ� �ڷ����� ���
		 *     - �ڷ��� �ս��� �߻��� �� ����
		 */
		
		
		/*
		 * 1. ������ �� ��ȯ (Implicit Type Conversion)
		 */
		
		byte bNum = 10; // ���� �ڷ���
		int iNum = bNum; // ū �ڷ���
		
		System.out.println(bNum);
		System.out.println(iNum); 
		
		int iNum2 = 20; // �� ������ ��
		float fNum = iNum2; // �� ������ ��
		
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum; // iNum�� int���� float���� ����ȯ -> (fNum + iNum)�� float���� double�� ����ȯ (�� ��ȯ 2�� �߻�)
		
		System.out.println(dNum);
		
		
		/*
		 * 2. ����� �� ��ȯ (Explicit Type Conversion)
		 * 
		 * - �Ǽ��� ��� �� ������ ������ �� ������ ���� ����ȯ�� �Ͼ�� �Ҽ��� ���� �����Ͱ� truncate �ȴ�.
		 */

		int i = 1000;
		//byte bNum2 = i; // 4bytes �� 1byte�� ������ �ؼ� ���� �߻�
		byte bNum2 = (byte)i; // (byte)�� ����� ����� �� ��ȯ �ǽ� (�������� ������ �߻��� �� �ִ�.)
		
		System.out.println(bNum2);
		
		double dNum2 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum2 + (int)fNum2; // 1.2 -> 1, 0.9 -> 0 => 1 
		int iNum4 = (int)(dNum2 + fNum2); // 1.2 + 0.9 = 2.1 => 2
		
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		
		
	}
	
}
