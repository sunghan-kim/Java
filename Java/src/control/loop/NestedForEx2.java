package control.loop;

public class NestedForEx2 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 구구단 구현 (while문 이용)
		 * 
		 */
		
		int dan = 2;
		int cnt = 1;
		
		while (dan <= 9) {
			
			cnt = 1; // 내부 while문이 끝나면 cnt가 10이 되어 있으므로 초기화해주는 작업이 필요하다.
			
			System.out.println("#########" + dan + "단" + "#########");
			
			while (cnt <= 9) {
				
				System.out.println(dan + " x " + cnt + " = " + (dan * cnt));
				cnt++;
				
			}
			
			dan++; 
			
		}

		
	}
	
}
