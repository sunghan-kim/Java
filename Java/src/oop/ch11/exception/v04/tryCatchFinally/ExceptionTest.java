package oop.ch11.exception.v04.tryCatchFinally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("a.txt");
			// 프로젝트 하위에 "a.txt" 파일을 생성하면 이 부분이 정상적으로 수행되어 catch 부분이 수행되지 않는다. 
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e);
			return; // catch 수행 시 return 을 하면 가장 아래의 end 가 출력되지 않는다.
			
		} finally {
			
			try {
				
				fis.close();
				System.out.println("finally");
				
			} catch (Exception e) {
				
				System.out.println(e);
				
			}
		}
		
		System.out.println("end");
		
	}
	
}
