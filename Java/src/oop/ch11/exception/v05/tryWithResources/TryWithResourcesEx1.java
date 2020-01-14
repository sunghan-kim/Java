package oop.ch11.exception.v05.tryWithResources;

public class TryWithResourcesEx1 {

	/*
	 * 
	 * # try - with - resources 문
	 * 
	 *   - 리소스를 자동으로 해제 하도록 제공해주는 구문
	 *   
	 *   - 해당 리소스가 AutoCloseable을 구현한 경우, close() 를 명시적으로 호출하지 않아도 try{} 블록에서 오픈된 리소스는
	 *     정상적인 경우나 예외가 발생한 경우 모두 자동으로 close()가 호출됨
	 *     
	 *   - java 7 부터 제공됨
	 *   
	 *   - FileInputStream 의 경우 AutoCloseable을 구현하고 있음
	 *   
	 *   - 문법
	 *   
	 *     try (오류발생이 예상되는 로직) {
	 *     
	 *     } catch () {
	 *     
	 *     } catch () {
	 *     
	 *     }
	 *   
	 * 
	 * # AutoCloseable 인터페이스 사용하기
	 * 
	 *   - AutoCloseable 인터페이스를 구현한 클래스를 만들고, close()가 잘 호출되는 지 확인
	 *   
	 *     public class AutoCloseObj implements AutoCloseable {
	 *     
	 *     		#Override
	 *     		public void close() throws Exception { // close() 메서드 구현
	 *     
	 *     			System.out.println("리소스가 close() 되었습니다.");
	 *     
	 *     		}
	 *     
	 *     }
	 * 
	 * 
	 */
	
}
