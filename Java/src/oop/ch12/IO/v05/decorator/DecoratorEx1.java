package oop.ch12.IO.v05.decorator;

public class DecoratorEx1 {

	/*
	 * 
	 * # 보조 스트림
	 * 
	 *   - 실제 읽고 쓰는 스트림이 아닌 보조적인 기능을 추가하는 스트림
	 *   
	 *   - FilterInputStream과 FilterOutputStream이 보조 스트림의 상위 클래스
	 *   
	 *   - 생성자의 매개 변수로 또 다른 스트림을 가짐
	 *   
	 *     - 생성자 1 : protected FilterInputStream(InputStream in)
	 *     
	 *       - 생성자의 매개변수로 InputStream을 받는다.
	 *       
	 *     - 생성자 2 : public FilterOutputStream(OutputStream out)
	 *     
	 *       - 생성자의 매개변수로 OutputStream을 받는다.
	 *       
	 *   - 데코레이터 패턴 (Decorator Pattern)
	 *   
	 *    --------------------				  -----------------				  -----------------
	 *    |    바이트 단위   |	(포함 관계)	  | + 문자로 변환 |  (포함 관계)  | + 버퍼링 기능 |
	 *    |					 |  	 >		  |	 			  |		  >	      |	  			  |
	 *    | 파일 입력 스트림 |  			  |	  기능 추가   |				  |   추가		  |
	 * 	  --------------------				  -----------------				  -----------------
	 * 			   ^								  ^								   ^
	 * 			   |								  |								   |
	 * 		  기반 스트림						 보조 스트림					 보조 스트림
	 * 
	 * 
	 * # 여러 가지 보조 스트림 사용하기
	 * 
	 *   1. Buffered 스트림
	 *   
	 *     - 내부에 8192 바이트 배열을 가지고 있음
	 *     
	 *     - 읽거나 쓸 때 속도가 빠름
	 *     
	 *   2. DataInputStream / DataOutputStream
	 *   
	 *     - 자료가 저장된 상태 그대로 자료형을 유지하며 읽거나 쓰는 기능을 제공하는 스트림
	 * 
	 */
	
}
