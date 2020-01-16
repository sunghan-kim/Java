package oop.ch12.IO.v05.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DecoratorPatternTest1 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 
		 * ���ڷ����� ����
		 * 
		 *   - ���� ��Ʈ���� �Ű������� �� �ٸ� ���� ��Ʈ���� ���� �� �ִ�.
		 *   
		 */
		
		Socket socket = new Socket(); // ���� ���
		
		// 1. ��Ĺ���� �����͸� �о���� ��, InputStream�� ���� ����Ʈ ������ �о���δ�. (������ ���� �� �ִ�.)
		//socket.getInputStream().read();
		
		// 2. InputStreamReader ���� ��Ʈ���� ����� ����Ʈ ������ �о���� ���� ���ڷ� �о�帱 �� �ִ�. (���� ������ ���� �� ����)
		//InputStreamReader isr = new InputStreamReader(socket.getInputStream()); 
		
		// 3. 2������ InputStreamReader ���� ��Ʈ������ ���� ���� BufferedReader ��� ���� ��Ʈ���� �Ű������� �����Ͽ� buffer ��ɱ��� ����� �� �ִ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		br.readLine(); // readLine() : ���忡�� �� �پ� ���� �� �ִ� ����� �����ϴ� BufferedReader�� �޼���
		
		/*
		 * 
		 * ���ڷ����� ������ ������� �����ϰ� �Ǹ� �ſ� ����������.
		 * 
		 */
		
		  
	}			
	
}
