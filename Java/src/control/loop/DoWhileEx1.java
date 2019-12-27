package control.loop;

public class DoWhileEx1 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * do-while 문
		 * 
		 *   - 먼저 수행문을 수행하고 조건 체크
		 *   - 한번 이상 수행문이 수행되어야 하는 경우 사용
		 *   
		 *   - 반복문 중에 사용 빈도가 제일 적음
		 * 
		 */
		
		int num = 1;
		int sum = 0;
		
		do {
			
			sum += num;
			num++;
			
		} while (num <= 10);
		
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
		
	}
	
}
