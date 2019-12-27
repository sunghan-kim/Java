package basic.variable;

public class BinaryTest {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 2진수 표현
		 * 
		 *   - '0B' 를 앞에 붙인다.
		 *   - ex) 0B1010 -> 10
		 *   
		 * 
		 * 8진수 표현
		 *   
		 *   - '0' 를 앞에 붙인다.
		 *   - ex) 012 -> 10
		 *   
		 *   
		 * 16진수 표현
		 * 
		 *   - '0' 를 앞에 붙인다.
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
