package control.loop;

public class NestedForEx1 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * ��ø �ݺ��� (Nested for)
		 * 
		 */
		
		/*
		 * ������ ���� (for�� �̿�)
		 */
		
		int dan; // 2 x 3 ���� 2
		int cnt; // 2 x 3 ���� 3
		
		for (dan=2; dan <= 9; dan++) {
			
			System.out.println("#########" + dan + "��" + "#########");
			
			for (cnt=1; cnt <= 9; cnt++) {
				
				System.out.println(dan + " x " + cnt + " = " + (dan * cnt));
				
			}
			
		}
		
	}
	

	
}
