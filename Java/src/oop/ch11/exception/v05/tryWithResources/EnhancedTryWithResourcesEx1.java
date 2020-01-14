package oop.ch11.exception.v05.tryWithResources;

public class EnhancedTryWithResourcesEx1 {

	/*
	 * 
	 * # 향상된 try - with - resources 문
	 * 
	 *   - java 9 에서 제공되는 구문
	 *   
	 *   - 자바 9 이전
	 *   
	 *     AutoCloseObj obj = new AutoCloseObj();
	 *     
	 *     try (AutoCloseObj obj2 = obj) { // 다른 참조 변수로 다시 선언해야 함
	 *     
	 *     		throw new Exception();
	 *     
	 *     } catch (Exception e) {
	 *     
	 *     		System.out.println("예외 부분입니다.");
	 *     
	 *     }
	 *     
	 *     
	 *   - 자바 9 이후
	 *   
	 *     AutoCloseObj obj = new AutoCloseObj();
	 *     
	 *     try (obj) { // 외부에서 선언한 변수를 그대로 쓸 수 있음
	 *     
	 *     		throw new Exception();
	 *     
	 *     } catch (Exception e) {
	 *     
	 *     		System.out.println("예외 부분입니다.");
	 *     
	 *     }
	 * 
	 */
	
}
