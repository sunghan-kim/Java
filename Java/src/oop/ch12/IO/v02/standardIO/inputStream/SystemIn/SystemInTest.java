package oop.ch12.IO.v02.standardIO.inputStream.SystemIn;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		
		System.out.println("�Է�:");
		
		try {
			
			int i = System.in.read(); // ��ȯ�� : int (ó���� ���� ��Ÿ���� "-1"�� �ޱ� ���� ��ȯ���� int�� ������)
			System.out.println(i);
			System.out.println((char)i);
			
		} catch (IOException e) {
			
			System.out.println(e);
			
		}
		
	}
	
}
