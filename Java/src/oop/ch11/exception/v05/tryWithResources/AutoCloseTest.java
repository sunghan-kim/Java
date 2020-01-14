package oop.ch11.exception.v05.tryWithResources;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		try (AutoCloseObj obj = new AutoCloseObj()) {
			
			// ������ Exception �߻�
			throw new Exception();
			
		} catch (Exception e) {
			
			System.out.println(e);
			
		}
		
		// try{} �� ����� �� close()�� �ڵ����� ȣ��ȴ�.
		// Exception�� �߻��Ͽ� catch{} �� ����� �Ŀ��� close()�� �ڵ����� ����ȴ�.
		
	}
	
}
