package basic.variable;

public class BinaryTest {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 2���� ǥ��
		 * 
		 *   - '0B' �� �տ� ���δ�.
		 *   - ex) 0B1010 -> 10
		 *   
		 * 
		 * 8���� ǥ��
		 *   
		 *   - '0' �� �տ� ���δ�.
		 *   - ex) 012 -> 10
		 *   
		 *   
		 * 16���� ǥ��
		 * 
		 *   - '0' �� �տ� ���δ�.
		 *   - ex) 0XA -> 10
		 * 
		 */
		
		int num = 10;
		int bNum = 0B1010;
		int oNum = 012;
		int xNum = 0XA;
		
		System.out.println(num);	// 10
		System.out.println(bNum);	// 10
		System.out.println(oNum);	// 10
		System.out.println(xNum);	// 10
		
	}
	
}
