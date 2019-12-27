package basic.variable;

public class TypeConversionTest {

	public static void main(String[] args) {
		
		/*
		 * 형변환
		 * 
		 *   - 서로 다른 자료형의 값이 대입되는 경우 형 변환이 일어남
		 *   
		 *   1. 묵시적 형 변환 (implicit type conversion)
		 *   
		 *     - 작은 수에서 큰 수로
		 *     - 덜 정밀한 수에서 더 정밀한 수로 대입되는 경우
		 *     
		 *   2. 명시적 형 변환 (explicit type conversion)
		 *   
		 *     - 변환되는 자료형을 명시
		 *     - 자료의 손실이 발생할 수 있음
		 */
		
		
		/*
		 * 1. 묵시적 형 변환 (Implicit Type Conversion)
		 */
		
		byte bNum = 10; // 작은 자료형
		int iNum = bNum; // 큰 자료형
		
		System.out.println(bNum);
		System.out.println(iNum); 
		
		int iNum2 = 20; // 덜 정밀한 수
		float fNum = iNum2; // 더 정밀한 수
		
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum; // iNum이 int에서 float으로 형변환 -> (fNum + iNum)이 float에서 double로 형변환 (형 변환 2번 발생)
		
		System.out.println(dNum);
		
		
		/*
		 * 2. 명시적 형 변환 (Explicit Type Conversion)
		 * 
		 * - 실수의 경우 더 정밀한 수에서 덜 정밀한 수로 형변환이 일어나면 소수점 이하 데이터가 truncate 된다.
		 */

		int i = 1000;
		//byte bNum2 = i; // 4bytes 가 1byte로 들어갈려고 해서 에러 발생
		byte bNum2 = (byte)i; // (byte)를 사용해 명시적 형 변환 실시 (데이터의 유실이 발생할 수 있다.)
		
		System.out.println(bNum2);
		
		double dNum2 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum2 + (int)fNum2; // 1.2 -> 1, 0.9 -> 0 => 1 
		int iNum4 = (int)(dNum2 + fNum2); // 1.2 + 0.9 = 2.1 => 2
		
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		
		
	}
	
}
