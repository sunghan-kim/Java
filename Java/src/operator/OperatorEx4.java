package operator;

public class OperatorEx4 {

	public static void main(String[] args) {
		
		/*
		 * 증가, 감소 연산자 (단항 연산자)
		 * 
		 *   ++ : 항의 값에 1을 더함
		 *   
		 *     - val = ++num; // 먼저 num 값이 1 증가한 후 val 변수에 대입
		 *     - val = num++; // val 변수에 기존 num 값을 먼저 대입한 후 num 값 1 증가
		 *     
		 *   -- : 항의 값에서 1을 뺌
		 *   
		 *     - val = --num; // 먼저 num 값이 1 감소한 후 val 변수에 대입
		 *     - val = num--; // val 변수에 기존 num 값을 먼저 대입한 후 num 값 1 감소
		 *   
		 *     - 
		 */
		
		int score = 100;
		
		System.out.println(++score);
		// score = score + 1;
		// score += 1;
		
		System.out.println(score++); // score 101을 출력하고 값을 1 증가 시킴
		System.out.println(score);
		
		System.out.println(--score);
		System.out.println(score--); // score 101을 출력하고 값을 1 감소 시킴
		System.out.println(score);
		
	}
	
}
