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
			 * # Byte Array read() ���
			 * 
			 */
			
			byte[] bs = new byte[10];
			
			while ( (i = fis.read(bs)) != -1 ) {
				
				for (byte b : bs) {
					
					System.out.print((char)b);
					
					// �������� ��µǴ� "UVWXYZQRST" ���� "QRST" �� ���ۿ� ���� garbage�̴�. (���� �迭���� �о��� "QRST"�� �����ִ�.) 
					// -> ���� ������ �˾ƾ� �Ѵ�. (���� ������ "i"�� ��ȯ�ȴ�.)
					
				}
				
				System.out.println();
				
			}
			
		} catch (IOException e) { 
			System.out.println(e);
			
		}
		
		//System.out.println("end");  
		
	}
	
}
