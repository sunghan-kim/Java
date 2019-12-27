package control.loop;

public class NestedForEx1 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 중첩 반복문 (Nested for)
		 * 
		 */
		
		/*
		 * 구구단 구현 (for문 이용)
		 */
		
		int dan; // 2 x 3 에서 2
		int cnt; // 2 x 3 에서 3
		
		for (dan=2; dan <= 9; dan++) {
			
			System.out.println("#########" + dan + "단" + "#########");
			
			for (cnt=1; cnt <= 9; cnt++) {
				
				System.out.println(dan + " x " + cnt + " = " + (dan * cnt));
				
			}
			
		}
		
	}
	

	
}
