package variable;

public class IntegerTest {
	public static void main(String[] args) {
		
		/*
		 * 1. byte
		 */
		
		byte bs = -128;
		byte bs2 = 127;
		
		System.out.println(bs + ", " + bs2);
		
		//byte bs3 = -129; // error �߻� (byte �ڷ����� ���� �� �ִ� ����(-1~-128)�� �ʰ��߱� ����
		//byte bs4 = 128;  // error �߻� (byte �ڷ����� ���� �� �ִ� ����(0~127)�� �ʰ��߱� ����
		
		
		/*
		 * 2. int, long
		 */
		
		//int iVal = 12345678900; // error �߻� (�ش� ���� 4bytes �ȿ� �� �� ����)
		long lVal = 12345678900L; // L : Long(8bytes)���� ����϶�� �����ϴ� ��
		long lVal2 = 100; // ���� 4bytes �ȿ� ���� ��� L�� ������ �� �ִ�. 
		
		
		System.out.println(lVal + ", " + lVal2);
		
	}
}
