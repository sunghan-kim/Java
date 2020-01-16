package oop.ch12.IO.v03.biteUnitStream.fileInput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest2 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("input.txt"); // input.txt ���Ϸ� ���� ����
			
			/*
			 * while���� �̿��� ������ ������ �б� 
			 */
			
			int i;
			
			while ( (i = fis.read()) != -1 ) { // fis.read()�� ������ ������ "-1" ��ȯ (�ѱ��� ����)
				System.out.print((char)i);
			}
			
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
