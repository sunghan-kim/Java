package oop.ch11.exception.v06.throwsEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException { 
		// throws를 통해 예외를 미루면, 해당 메서드를 호출하는 부분에서 처리해야 한다.
		
		FileInputStream fis = new FileInputStream(fileName); // FileNotFoundException 발생할 수 있음
		Class c = Class.forName(className); // ClassNotFoundException 발생할 수 있음
		
		return c;
	}
	
	public static void main(String[] args) { // main 메서드에서 throws를 하면 가상머신으로 넘어가 처리가 안되므로, try-catch 처리를 해줘야 한다.
		
		ThrowsException test = new ThrowsException();
		
		
		try {
			
			//test.loadClass("b.txt", "java.lang.string"); // FileNotFoundException 발생
			//test.loadClass("a.txt", "java.lang.string"); // ClassNotFoundException 발생
			test.loadClass("a.txt", "java.lang.String"); // 정상 실행 후 "end" 출력 
			
		} catch (FileNotFoundException | ClassNotFoundException e) {
			
			System.out.println(e); // 이 부분에 발생한 예외에 따른 로그 기록 
			
		} catch (Exception e) { // default Exception : 그 외에 발생할 수 있는 여러 가지 예외를 이 부분에서 처리 (가장 마지막에 걸어야 한다.)
			
			System.out.println(e); 
			
		}
		
		
		System.out.println("end");
		
		/*
		 * 
		 * 예외 처리를 하는 부분을 결정하는 것은 로그를 남기는 부분인지 등 다양한 요소를 고려하여 결정한다.
		 * 
		 */
		
		
		
	}

}
