package basic.control.loop;

public class BreakContinueEx1 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * break, continue 문제
		 * 
		 *   구구단을 출력할 때 짝수 단만 출력하면서 단보다 곱하는 수가 작거나 같을 때 까지만 출력
		 * 
		 */
		
		for (int dan=2; dan <= 9; dan++) {
			
			if (dan % 2 != 0) continue; // 짝수단만 출력
			
			System.out.println("#####################" + dan + "단#####################");
			
			for (int cnt=1; cnt <= 9; cnt++) {
				
				if ( dan < cnt ) break; // 단보다 곱하는 수가 크면 내부 반복문 탈출
				System.out.println(dan + " x " + cnt + " = " + (dan * cnt));
				
			}
			
		}
		
	}
	
}
