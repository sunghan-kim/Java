package basic.operator;

public class OperatorEx5 {

	public static void main(String[] args) {
		
		/*
		 * Ex5. 논리 연산자
		 * 
		 * 5.1 논리 연산자의 종류 (3가지)
		 * 
		 *   5.1.1 && (논리 곱)
		 *  
		 *     - 두 항이 모두 참인 경우에만 결과 값이 참
		 *     - 그렇지 않은 경우는 모두 거짓
		 *   
		 *   5.1.2 || (논리 합)
		 *   
		 *     - 두 항 중 하나의 항만 참이면 결과 값은 참
		 *     - 두 항이 모두 거짓이면 결과 값은 거짓
		 *     
		 *   5.1.3 ! (부정)
		 *   
		 *     - 단항 연산자
		 *     - 참인 경우 -> 거짓으로 바꿈
		 *     - 거짓인 경우 -> 참으로 바꿈
		 *     
		 *     
		 * 5.2 단락 회로 평가 (short circuit evaluation)
		 * 
		 *   - 논리 곱(&&)은 두 항이 모두 true 일 때만 결과가 true
		 *   
		 *     - 앞의 항이 false 이면 뒤 항의 결과를 평가하지 않아도 false 임
		 *     
		 *   - 논리 합(||)은 두 항이 모두 false일 때만 결과가 false
		 *   
		 *     - 앞의 항이 true 이면 뒤 항의 결과를 평가하지 않아도 true 임
		 *     
		 *   - 실제 프로그램에서 예상하지 않는 결과가 발생할 수 있으므로 유의
		 * 
		 */
		
		
		/*
		 * 단락 회로 평가 실습
		 */
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ( (num1 = num1 + 10) < 10 ) && ( (i = i + 2) < 10 );
		
		System.out.println(num1);
		System.out.println(i); 
		System.out.println(value);
		// i의 경우 연산이 실시되지 않음 
		// -> 논리곱 연산자(&&)를 사용했을 때 앞쪽만 봐도 평가가 완료되기 때문에 뒤쪽은 확인 및 연산을 실시하지 않는다.
		//   -> 뒤의 항을 evaluation 하지 않는다

		int num2 = 10;
		int i2 = 2;
		
		boolean value2 = ( (num2 = num2 + 10) < 10 ) || ( (i2 = i2 + 2) < 10 );
		
		System.out.println(num2);
		System.out.println(i2);
		System.out.println(value2);
		// 뒤쪽 항의 연산이 실시됨
		// -> 논리합 연산자(||)의 경우, 앞쪽 항의 결과가 false이므로 뒤쪽항을 평가해야 전체 결과를 평가할 수 있으므로
		//    뒤쪽 항의 연산 실시
		
	}
	
}
