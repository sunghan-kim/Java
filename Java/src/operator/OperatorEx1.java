package operator;

public class OperatorEx1 {

	public static void main(String[] args) {
		
		/*
		 * 부호 연산자 (+, -)
		 */
		
		int num1 = -10;
		int num2 = 20;
		
		System.out.println(+num1); // 부호 연산자 '+' 의 경우 원래 상태 유지
		System.out.println(+num2);
		
		System.out.println(-num1); // 부호 연산자 '-' 의 경우 값의 부호를 바꿈
		System.out.println(-num2);
		
	}
	
}
