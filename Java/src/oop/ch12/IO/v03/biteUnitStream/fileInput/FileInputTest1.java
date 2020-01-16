package oop.ch12.IO.v03.biteUnitStream.fileInput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest1 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("input.txt"); // input.txt ���Ϸ� ���� ����
			
			/*
			 * input.txt ���� ���� ������ FileNotFoundException, NullPointerException(Null�� ���¿��� close()�� �õ��� �� �߻�) �߻�
			 */
			
			/*
			 * project ������ input.txt ���� ���� 
			 * 
			 *   - Exception �߻� ����
			 */
			
			int i =fis.read(); // IOException ó�� �ʿ� 
			System.out.println((char)i);
			i =fis.read();  
			System.out.println((char)i);
			i =fis.read();  
			System.out.println((char)i);
			
			
		} catch (IOException e) { // IOException �� FileNotFoundException �� �Բ� ó����
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
