package oop.ch12.IO.v05.decorator.bufferedStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy2 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * ���� ��Ʈ�� ������ �ϳ��� Buffered ��Ʈ���� �̿��� ������ �����ϴ� �� ��ŭ�� �ð��� �ɸ��� �� Ȯ�� 
		 * 
		 */
		
		long milliseconds = 0; // �ð��� �󸶳� �ɸ��� �� Ȯ��
		
		// a.zip : 3.7MB ũ���� ����
		try ( FileInputStream fis = new FileInputStream("a.zip"); FileOutputStream fos = new FileOutputStream("copy2.zip");
				BufferedInputStream bis = new BufferedInputStream(fis); BufferedOutputStream bos = new BufferedOutputStream(fos)) {  
			 
			 milliseconds = System.currentTimeMillis();
			 
			 int i;
			 
			 while ( ( i = bis.read() ) != -1 ) { 
				 
				 bos.write(i);
				 
			 }
			 
			 milliseconds = System.currentTimeMillis() - milliseconds; // �ɸ� �ð�
			 
		} catch (IOException e) {
			 
			System.out.println(e);
			 
		}
		
		System.out.println("�ð� : " + milliseconds); // 3.7MB ũ���� ������ �����ϴ� �� 126�и���(0.1��)�� �ɸ�
		
		/*
		 * 
		 * ����Ʈ ���� ��Ʈ���� �̿��Ͽ� ������ �����ϴ� �� ���� Buffered ���� ��Ʈ���� �̿��ϸ� �� 443��(55927 vs 126)�� �ӵ� ����� �̷������.
		 * 
		 *   - Buffered ��Ʈ���� �а� �� �� ���� �ӵ��� ���δ�.
		 * 
		 */
		  
		
	}
	
}
