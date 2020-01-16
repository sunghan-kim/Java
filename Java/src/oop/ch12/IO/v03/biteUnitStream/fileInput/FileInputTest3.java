package oop.ch12.IO.v03.biteUnitStream.fileInput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest3 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * # try-with-resources �̿�
		 * 
		 *   - AutoCloseable�� �����Ǿ� �־ finally{} ���� close()�� ���� �ʾƵ� ��
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
