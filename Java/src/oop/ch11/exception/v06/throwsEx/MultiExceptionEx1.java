package oop.ch11.exception.v06.throwsEx;

public class MultiExceptionEx1 {

	/*
	 * 
	 * # 다중 예외 처리하기
	 * 
	 *   - 하나의 try{} 블록에서 여러 예외가 발생하는 경우, catch{} 블록 한 곳에서 처리하거나
	 *     여러 catch{} 블록으로 나누어 처리할 수 있음
	 *     
	 *   - 가장 최상위 클래스인 Exception 클래스는 가장 마지막 블록에 위치해야 함
	 *   
	 *     public static void main(String[] args) {
	 *     
	 *     		ThrowsException test = new ThrowsException();
	 *     
	 *     		try {
	 *     
	 *     			test.loadClass("a.txt", "java.lang.String");
	 *     
	 *     		} catch (FileNotFoundException e) {
	 *     
	 *     			e.printStackTrace();
	 *     
	 *     		} catch (ClassNotFoundException e) {
	 *     
	 *     			e.printStackTrace();
	 *     
	 *     		} catch (Exception e) { // Exception 클래스로 그 외 예외 상황 처리
	 *     
	 *     			e.printStackTrace();
	 *     
	 *     		}
	 *     
	 *     }
	 * 
	 */
	
}
