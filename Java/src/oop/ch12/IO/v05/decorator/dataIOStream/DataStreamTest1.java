package oop.ch12.IO.v05.decorator.dataIOStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest1 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * # DataIO ���� ��Ʈ��
		 * 
		 *   - �ڷ����� �����ϸ� �аų� ���� ����� ����
		 * 
		 */
		
		try ( FileOutputStream fos = new FileOutputStream("data.txt");
			  DataOutputStream dos = new DataOutputStream(fos);
			  FileInputStream fis = new FileInputStream("data.txt");
			  DataInputStream dis = new DataInputStream(fis); ) {
			
			/*
			 * 
			 * # ����
			 * 
			 *   - DataOutputStream�� �پ��� ������ write �޼��� ��� ����
			 *     - writeByte(), write(), writeChar(), writeUTF() ��
			 * 
			 */
			dos.writeByte(100); // writeByte(int v) : ����Ʈ ������ ����
			dos.write(100);
			dos.writeChar('A'); // writeChar(int v) : ����Ʈ ������ ����  
			dos.writeUTF("�ȳ��ϼ���"); // writeUTF(String str) : ���� ������ ����
			
			/*
			 * 
			 * # �б�
			 * 
			 *   - ������ �� : �����͸� �� �� ����� DataInputStream�� �޼���� ���εǴ� DataOutputStream�� �޼��带 ������ ������ ����ؾ� �Ѵ�.
			 *   
			 *     - writeByte() -> readByte()
			 *     - write()     -> read()
			 *     - writeChar() -> readChar()
			 *     - writeUTF()  -> readUTF()
			 * 
			 */
			System.out.println(dis.readByte());
			System.out.println(dis.read());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		
		
		
	}
	
}
