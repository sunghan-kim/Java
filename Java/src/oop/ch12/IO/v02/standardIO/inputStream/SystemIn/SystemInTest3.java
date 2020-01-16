package oop.ch12.IO.v02.standardIO.inputStream.SystemIn;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest3 {

	public static void main(String[] args) {
		
		System.out.println("�Է� �� '��'�̶�� ������:");
		
		try {
			
			int i;
			
			/*
			 * 
			 * # ���� ��Ʈ�� ���
			 *   
			 *   - Sytem.in.read()�� '��' �̶�� ���ڸ� �ν����� ����  ��. 
			 *   
			 *     - �ѱ��� 2����Ʈ�̱� ����
			 *     - ��Ƽ ����Ʈ(����)�� ���� �� �ְ� ���� ��Ʈ�� ��� �ʿ�
			 *   
			 *   - InputStreamReader
			 *   
			 *     - ���� ��Ʈ��
			 *     - ���� ��Ʈ���� �Ű������� ��Ʈ���� �޴´�.
			 * 
			 */
			InputStreamReader isr = new InputStreamReader(System.in);
			
			while ( (i = isr.read()) != '��' ) { 
				
				System.out.print((char)i);
				
			}
			
			
		} catch (IOException e) {
			
			System.out.println(e);
			
		}
		
	}
	
}
