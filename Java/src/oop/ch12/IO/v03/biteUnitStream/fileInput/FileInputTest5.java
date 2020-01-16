package oop.ch12.IO.v03.biteUnitStream.fileInput;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest5 {

	public static void main(String[] args) {
		
 		try ( FileInputStream fis = new FileInputStream("input2.txt") ) { 
			
			int i;
			
			/*
			 * 
			 * # Byte Array read() 사용
			 * 
			 */
			
			byte[] bs = new byte[10];
			
			while ( (i = fis.read(bs)) != -1 ) {
				
				for (int k=0; k < i; k++) {
					
					System.out.print((char)bs[k]); // garbage가 출력되지 않는다.
					
				}
				
				System.out.println();
				
			}
			
		} catch (IOException e) { 
			System.out.println(e);
			
		}
		
		//System.out.println("end");  
		
	}
	
}
