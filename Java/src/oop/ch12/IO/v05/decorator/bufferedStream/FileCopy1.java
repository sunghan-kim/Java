package oop.ch12.IO.v05.decorator.bufferedStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy1 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * ����Ʈ ���� ��ũ�� Ŭ������ �̿��� ������ �����ϴ� �� ��ŭ�� �ð��� �ɸ��� �� Ȯ�� 
		 * 
		 */
		
		long milliseconds = 0; // �ð��� �󸶳� �ɸ��� �� Ȯ��
		
		// a.zip : 3.7MB ũ���� ����
		try ( FileInputStream fis = new FileInputStream("a.zip"); FileOutputStream fos = new FileOutputStream("copy.zip") ) { 
			 
			 milliseconds = System.currentTimeMillis();
			 
			 int i;
			 
			 while ( ( i = fis.read() ) != -1 ) { // �� ����Ʈ�� �о
				 
				 fos.write(i); // �� ����Ʈ�� ����
				 
			 }
			 
			 milliseconds = System.currentTimeMillis() - milliseconds; // �ɸ� �ð�
			 
		} catch (IOException e) {
			 
			System.out.println(e);
			 
		}
		
		System.out.println("�ð� : " + milliseconds); // 3.7MB ũ���� ������ �����ϴ� �� 55927�и���(55��)�� �ɸ�
		  
		
	}
	
}
