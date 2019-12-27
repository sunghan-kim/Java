package control.loop;

public class ForEx1 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 반복문 (for문)
		 * 
		 */
		
		int count;
		int sum = 0;
		
		for (count=0; count < 10; count++) {
			sum += count;
		}
		
		System.out.println("count : " + count);
		System.out.println("sum : " + sum);
		
		////////////////////////////////////////////////////////////////
		
		int count2 = 0;
		int sum2 = 0;
		
		while ( count2 < 10 ) {    
			sum2 += count2;
			count2++;
		}
		
		System.out.println("count2 : " + count2);
		System.out.println("sum2 : " + sum2);
		
		////////////////////////////////////////////////////////////////		
		
		for (int i=0; i < 10; i++) { // 10번 실행
			System.out.println(i);
		}
		
		int num = 0;
		
		////////////////////////////////////////////////////////////////
		
		for (;;) { // while(true) 와 동일한 기능
			
			if (num == 10) {
				break;
			}
			
			num++;
			
		}
		
		System.out.println("num : " + num);
		
		
		
	}
	
}
