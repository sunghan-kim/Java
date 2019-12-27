package basic.control.loop;

public class WhileEx1 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * while 문
		 * 
		 *   - 조건이 참인 동안 수행문이 반복해서 수행 됨 
		 * 
		 */
		
		int num = 1;
		int sum = 0;
		
		while ( num <= 10) { // num <= 10 대신 true 를 사용하면 무한 반복
			sum += num;
			num++; // 11
		}
		
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
		
		
	}
	
}
