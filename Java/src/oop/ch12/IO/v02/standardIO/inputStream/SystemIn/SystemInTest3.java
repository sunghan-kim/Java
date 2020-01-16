package oop.ch12.IO.v02.standardIO.inputStream.SystemIn;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest3 {

	public static void main(String[] args) {
		
		System.out.println("입력 후 '끝'이라고 쓰세요:");
		
		try {
			
			int i;
			
			/*
			 * 
			 * # 보조 스트림 사용
			 *   
			 *   - Sytem.in.read()는 '끝' 이라는 문자를 인식하지 못한  다. 
			 *   
			 *     - 한글은 2바이트이기 때문
			 *     - 멀티 바이트(문자)를 읽을 수 있게 보조 스트림 사용 필요
			 *   
			 *   - InputStreamReader
			 *   
			 *     - 보조 스트림
			 *     - 보조 스트림은 매개변수로 스트림을 받는다.
			 * 
			 */
			InputStreamReader isr = new InputStreamReader(System.in);
			
			while ( (i = isr.read()) != '끝' ) { 
				
				System.out.print((char)i);
				
			}
			
			
		} catch (IOException e) {
			
			System.out.println(e);
			
		}
		
	}
	
}
