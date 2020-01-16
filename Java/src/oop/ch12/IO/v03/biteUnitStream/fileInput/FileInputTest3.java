package oop.ch12.IO.v03.biteUnitStream.fileInput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest3 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * # try-with-resources 이용
		 * 
		 *   - AutoCloseable이 구현되어 있어서 finally{} 에서 close()를 하지 않아도 됨
		 * 
		 */
		
 		try ( FileInputStream fis = new FileInputStream("input.txt") ) { 
			
			int i;
			
			while ( (i = fis.read()) != -1 ) {
				System.out.print((char)i);
			}
			
		} catch (IOException e) { 
			System.out.println(e);
			
		}
		
		System.out.println("end");  
		
	}
	
}
