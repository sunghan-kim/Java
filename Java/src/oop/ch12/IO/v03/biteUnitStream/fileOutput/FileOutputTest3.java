package oop.ch12.IO.v03.biteUnitStream.fileOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest3 {

	public static void main(String[] args) {
		
		/*
		 * 
		 *   InputStream, OutputStream ���� ���
		 * 
		 */
		
		byte[] bs = new byte[26]; // ��� ���ĺ��� ���� byte �迭
		byte data = 65;
		 
		for (int i=0; i<bs.length; i++) { // 65(A)���� 90(Z)���� �迭�� �Է�
			bs[i] = data;
			data++;
		}
		
		try ( FileOutputStream fos = new FileOutputStream("alpha.txt", true); FileInputStream fis = new FileInputStream("alpha.txt"); ) {
			
			fos.write(bs); // byte �迭�� �Ű������� �޴� write() �޼��� ����Ͽ� alpha.txt ���Ͽ� ������ �Է�
			
			int ch;
			
			while ( ( ch = fis.read() ) != -1 ) { // ������ alpha.txt ���� �б�
				
				System.out.print((char)ch);
				
			}
			
		} catch (IOException e) {
			System.out.println(e); 
		}
		
	}
	
}
