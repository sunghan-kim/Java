package variable;

public class IntegerTest {
	public static void main(String[] args) {
		
		/*
		 * 1. byte
		 */
		
		byte bs = -128;
		byte bs2 = 127;
		
		System.out.println(bs + ", " + bs2);
		
		//byte bs3 = -129; // error 발생 (byte 자료형이 담을 수 있는 범위(-1~-128)를 초과했기 때문
		//byte bs4 = 128;  // error 발생 (byte 자료형이 담을 수 있는 범위(0~127)를 초과했기 때문
		
		
		/*
		 * 2. int, long
		 */
		
		//int iVal = 12345678900; // error 발생 (해당 값이 4bytes 안에 들어갈 수 없음)
		long lVal = 12345678900L; // L : Long(8bytes)으로 취급하라고 지정하는 것
		long lVal2 = 100; // 값이 4bytes 안에 들어올 경우 L을 생략할 수 있다. 
		
		
		System.out.println(lVal + ", " + lVal2);
		
	}
}
