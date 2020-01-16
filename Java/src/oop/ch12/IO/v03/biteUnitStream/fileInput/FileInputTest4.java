package oop.ch12.IO.v03.biteUnitStream.fileInput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest4 {

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
				
				for (byte b : bs) {
					
					System.out.print((char)b);
					
					// 마지막에 출력되는 "UVWXYZQRST" 에서 "QRST" 는 버퍼에 남은 garbage이다. (이전 배열에서 읽었던 "QRST"가 남아있다.) 
					// -> 읽은 개수를 알아야 한다. (읽은 개수는 "i"로 반환된다.)
					
				}
				
				System.out.println();
				
			}
			
		} catch (IOException e) { 
			System.out.println(e);
			
		}
		
		//System.out.println("end");  
		
	}
	
}
