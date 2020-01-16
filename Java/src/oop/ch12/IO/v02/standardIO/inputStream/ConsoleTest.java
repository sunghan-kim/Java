package oop.ch12.IO.v02.standardIO.inputStream;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		
		Console console = System.console();
		
		System.out.println("�̸�:");
		String name = console.readLine();
		
		System.out.println("��й�ȣ:");
		char[] password = console.readPassword();
		
		System.out.println(name);
		System.out.println(password);
		
		/*
		 * 
		 * ��Ŭ���������� ���� �Ұ��� (���� �ֿܼ��� �����ؾ� �Ѵ�.)
		 * 
		 *   - cmd
		 *   
		 *   - cd C:\Users\shkim\git\Java\Java\bin 
		 *     (������Ʈ ���丮 �Ʒ��� bin���� �̵�)
		 *     
		 *   - java oop.ch12.IO.v02.standardIO.inputStream.ConsoleTest 
		 *     (java ������ ��Ű����.Ŭ������ ���� ����)
		 *    
		 * 
		 */
		
	}
	
}
