package oop.ch12.IO.v02.standardIO.inputStream;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		
		Console console = System.console();
		
		System.out.println("이름:");
		String name = console.readLine();
		
		System.out.println("비밀번호:");
		char[] password = console.readPassword();
		
		System.out.println(name);
		System.out.println(password);
		
		/*
		 * 
		 * 이클립스에서는 실행 불가능 (실제 콘솔에서 실행해야 한다.)
		 * 
		 *   - cmd
		 *   
		 *   - cd C:\Users\shkim\git\Java\Java\bin 
		 *     (프로젝트 디렉토리 아래의 bin으로 이동)
		 *     
		 *   - java oop.ch12.IO.v02.standardIO.inputStream.ConsoleTest 
		 *     (java 다음에 패키지명.클래스명 으로 실행)
		 *    
		 * 
		 */
		
	}
	
}
