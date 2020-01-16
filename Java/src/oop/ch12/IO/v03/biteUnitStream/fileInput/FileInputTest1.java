package oop.ch12.IO.v03.biteUnitStream.fileInput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest1 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("input.txt"); // input.txt 파일로 부터 읽음
			
			/*
			 * input.txt 파일 생성 전에는 FileNotFoundException, NullPointerException(Null인 상태에서 close()를 시도할 때 발생) 발생
			 */
			
			/*
			 * project 하위에 input.txt 파일 생성 
			 * 
			 *   - Exception 발생 안함
			 */
			
			int i =fis.read(); // IOException 처리 필요 
			System.out.println((char)i);
			i =fis.read();  
			System.out.println((char)i);
			i =fis.read();  
			System.out.println((char)i);
			
			
		} catch (IOException e) { // IOException 이 FileNotFoundException 도 함께 처리함
			System.out.println(e);
			
		} finally {
			
			try {
				
				fis.close();
				
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		
		System.out.println("end");  
		
	}
	
}
