package variable;

public class CharTest {

	public static void main(String[] args) {
		
		char ch = 'A';
		
		System.out.println(ch);
		System.out.println((int)ch); // 65
		
		int iCh = 66;
		
		System.out.println((char)iCh); // B
		
		// char ch2 = -66; 음수는 불가능
		
		
		/*
		 * 유니코드
		 */
		
		char hangul = '\uAC00';
		
		System.out.println(hangul); // 가
		
		char ch2 = '한';
		
		System.out.println((int)ch2);
				
		
	}
	
}
