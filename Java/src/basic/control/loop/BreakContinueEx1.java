package basic.control.loop;

public class BreakContinueEx1 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * break, continue ����
		 * 
		 *   �������� ����� �� ¦�� �ܸ� ����ϸ鼭 �ܺ��� ���ϴ� ���� �۰ų� ���� �� ������ ���
		 * 
		 */
		
		for (int dan=2; dan <= 9; dan++) {
			
			if (dan % 2 != 0) continue; // ¦���ܸ� ���
			
			System.out.println("#####################" + dan + "��#####################");
			
			for (int cnt=1; cnt <= 9; cnt++) {
				
				if ( dan < cnt ) break; // �ܺ��� ���ϴ� ���� ũ�� ���� �ݺ��� Ż��
				System.out.println(dan + " x " + cnt + " = " + (dan * cnt));
				
			}
			
		}
		
	}
	
}
