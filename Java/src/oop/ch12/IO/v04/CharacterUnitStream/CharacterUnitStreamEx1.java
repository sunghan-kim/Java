package oop.ch12.IO.v04.CharacterUnitStream;

public class CharacterUnitStreamEx1 {

	/*
	 * 
	 * # 문자 단위 입출력 스트림
	 * 
	 *   - Reader : 문자 단위로 읽는 최상위 스트림
	 *   
	 *   - Writer : 문자 단위로 쓰는 최상위 스트림
	 *   
	 *   - 추상 메서드를 포함한 추상 클래스로 하위 클래스가 상속받아 구현
	 *   
	 *   - 하위 클래스
	 *   
	 *     1. Reader 하위 클래스
	 *     
	 *       1.1 FileReader
	 *       
	 *         - 파일에서 문자 단위로 읽는 스트림 클래스
	 *         
	 *       1.2 InputStreamReader
	 *       
	 *         - 바이트 단위로 읽은 자료를 문자로 변환해주는 보조 스트림 클래스
	 *         
	 *       1.3 BufferedReader
	 *       
	 *         - 문자로 읽을 때 배열을 제공하여 한꺼번에 읽을 수 있는 기능을 제공해주는 보조 스트림
	 *        
	 *         
	 *     2. Writer 하위 클래스
	 *     
	 *       2.1 FileWriter
	 *       
	 *         - 파일에 문자 단위로 출력하는 스트림 클래스
	 *         
	 *       2.2 OutputStreamWriter
	 *       
	 *         - 파일에 바이트 단위로 출력한 자료를 문자로 변환해주는 보조 스트림
	 *         
	 *       2.3 BufferedWriter
	 *       
	 *         - 문자로 쓸 때 배열을 제공하여 한꺼번에 쓸 수 있는 기능을 제공해주는 보조 스트림
	 * 
	 */
	
}
