package oop.ch12.IO.v03.biteUnitStream.fileInput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest2 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("input.txt"); // input.txt 파일로 부터 읽음
			
			/*
			 * while문을 이용해 파일을 끝까지 읽기 
			 */
			
			int i;
			
			while ( (i = fis.read()) != -1 ) { // fis.read()는 파일의 끝에서 "-1" 반환 (한글은 깨짐)
				System.out.print((char)i);
			}
			
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
