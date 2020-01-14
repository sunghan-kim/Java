package oop.ch11.exception.v05.tryWithResources;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		try (AutoCloseObj obj = new AutoCloseObj()) {
			
			// 강제로 Exception 발생
			throw new Exception();
			
		} catch (Exception e) {
			
			System.out.println(e);
			
		}
		
		// try{} 가 실행된 후 close()가 자동으로 호출된다.
		// Exception이 발생하여 catch{} 가 실행된 후에도 close()가 자동으로 실행된다.
		
	}
	
}
