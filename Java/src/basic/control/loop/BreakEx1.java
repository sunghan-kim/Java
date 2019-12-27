package basic.control.loop;

public class BreakEx1 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * break 문
		 * 
		 *   - 감싸고 있는 블록(반복문)의 제어를 빠져나오는 기능
		 *   - 중첩 반복문의 경우 내부 반복문 안에서 break를 사용하면 내부 반복문만 빠져나온다.
		 * 
		 */
		
		/*
		 * 
		 * 1부터 1씩 증가한 값을 계속 더할 때(1 + 2 + 3 + ...) 합계 값이 100을 넘을 때의 값을 출력
		 * 
		 */
		
		int num = 1;
		int sum = 0;
		
		boolean b = true;
		
		while (b) {
			
			sum += num;
			
			if (sum > 100) {
				System.out.println("num : " + num);
				System.out.println("sum : " + sum);
				break;
			}
			
			num++;
			
		}
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println();
		
		int num2 = 1;
		int sum2 = 0;
		
		
		for (num2=1; sum2 <= 100; num2++) { //  num2++ 로직에 의해 반복문 종료 후 num2 의 값이 1 증가해 버림 (14 -> 15)
			sum2 += num2;
		}
			
		System.out.println("num2 : " + num2);
		System.out.println("sum2 : " + sum2);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println();
		
		int num3 = 1;
		int sum3 = 0;
		
		for (num3=1; sum3 <= 100; num3++) {
			
			sum3 += num3;
			if (sum3 > 100) break; // break 를 사용하여 반복문이 종료된 후 num3++ 에 의해 num3 값이 1 증가하는 로직 수행 전 for문을 벗어난다.
			
		}
		
		System.out.println("num3 : " + num3);
		System.out.println("sum3 : " + sum3);
		
	}
	
}
