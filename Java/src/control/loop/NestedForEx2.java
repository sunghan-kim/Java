package control.loop;

public class NestedForEx2 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * ������ ���� (while�� �̿�)
		 * 
		 */
		
		int dan = 2;
		int cnt = 1;
		
		while (dan <= 9) {
			
			cnt = 1; // ���� while���� ������ cnt�� 10�� �Ǿ� �����Ƿ� �ʱ�ȭ���ִ� �۾��� �ʿ��ϴ�.
			
			System.out.println("#########" + dan + "��" + "#########");
			
			while (cnt <= 9) {
				
				System.out.println(dan + " x " + cnt + " = " + (dan * cnt));
				cnt++;
				
			}
			
			dan++; 
			
		}

		
	}
	
}
