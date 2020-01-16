package oop.ch12.IO.v01.javaIOStream;

public class IOStreamEx1 {

	/*
	 * 
	 * # 입출력 스트림이란?
	 * 
	 *   - 네트워크에서 자료의 흐름이 물과 같다는 의미에서 유래
	 *   
	 *   - 다양한 입출력 장치에 독립적으로 일관성있는 입출력 방식 제공
	 *   
	 *   - 입출력이 구현되는 곳에서는 모두 I/O 스트림을 사용
	 *   
	 *     - 키보드, 파일 디스크, 메모리 등
	 *     
	 *     
	 * # 입출력 스트림 구분?
	 * 
	 *   - I/O 대상 기준 : 입력 스트림, 출력 스트림 (입출력을 동시에 하는 스트림은 없다.)
	 *   
	 *   - 자료의 종류 : 바이트 스트림, 문자 스트림
	 *   
	 *   - 스트림의 기능 : 기반 스트림, 보조 스트림
	 *   
	 *   
	 * # 입력 스트림과 출력 스트림
	 * 
	 *   - 입력 스트림 : 대상으로부터 자료를 읽어 들이는 스트림
	 *   
	 *   - 출력 스트림 : 대상으로 자료를 출력하는 스트림
	 *   
	 *     
	 *     						 입력 스트림
	 *          자바		<--------------------		입출력
	 *     응용 프로그램	-------------------->		 자료
	 * 							 출력 스트림
	 * 
	 * 
	 *   - 스트림의 예
	 * 
	 *     - 입력 스트림의 예
	 *   
	 *       - FileInputStream 		
	 *       - FileReader			
	 *       - BufferedInputStream	
	 *       - BufferedReader		
	 *     
	 *     - 출력 스트림의 예
	 *   
	 *       - FileOutputStream		
	 *       - FileWriter			
	 *       - BufferedOutputStream	
	 *       - BufferedWriter		
	 * 
	 * 
	 * # 바이트 단위 스트림과 문자 단위 스트림
	 * 
	 *   - 바이트 단위 스트림 : 바이트 단위로 자료를 읽고 씀 (동영상, 음악 파일 등)
	 *   
	 *   - 문자 단위 스트림 : 문자는 2바이트씩 처리해야 함
	 *   
	 *   - 스트림의 예
	 *   
	 *     - 바이트 스트림
	 *     
	 *       - FileInputStream
	 *       - FileOutputStream
	 *       - BufferedInputStream
	 *       - BufferedOutputStream
	 *       
	 *     - 문자 스트림
	 *     
	 *       - FileReader
	 *       - FileWriter
	 *       - BufferedReader
	 *       - BufferedWriter
	 *       
	 *       
	 * # 기반 스트림과 보조 스트림
	 * 
	 *   - 기반 스트림
	 *     
	 *     - 대상에 직접 자료를 읽고 쓰는 기능의 스트림
	 *     
	 *   - 보조 스트림
	 *   
	 *     - 직접 읽고 쓰는 기능은 없고 추가적인 기능을 제공해주는 스트림
	 *     - 기반 스트림이나 또 다른 보조 스트림을 생성자의 매개변수로 포함
	 *     
	 *   - 스트림의 예
	 *   
	 *     - 기반 스트림
	 *     
	 *       - FileInputStream
	 *       - FileOutputStream
	 *       - FileReader
	 *       - FileWriter
	 *       
	 *     - 보조 스트림
	 *     
	 *       - InputStreamReader
	 *       - OutputStreamWriter
	 *       - BufferedInputStream
	 *       - BufferedOutputStream
	 * 
	 */
	
}
