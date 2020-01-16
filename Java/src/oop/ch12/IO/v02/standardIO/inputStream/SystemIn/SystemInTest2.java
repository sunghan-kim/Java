package oop.ch12.IO.v02.standardIO.inputStream.SystemIn;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		
		System.out.println("�Է�:");
		
		try {
			
			int i;
			
			while ( (i = System.in.read()) != '\n' ) { // �������� ���� �Է� (���� ġ�� �� ����)
				
				System.out.print((char)i);
				
			}
			
			
		} catch (IOException e) {
			
			System.out.println(e);
			
		}
		
	}
	
}
