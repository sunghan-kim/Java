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
		 * # DataIO 보조 스트림
		 * 
		 *   - 자료형을 유지하며 읽거나 쓰는 기능을 제공
		 * 
		 */
		
		try ( FileOutputStream fos = new FileOutputStream("data.txt");
			  DataOutputStream dos = new DataOutputStream(fos);
			  FileInputStream fis = new FileInputStream("data.txt");
			  DataInputStream dis = new DataInputStream(fis); ) {
			
			/*
			 * 
			 * # 쓰기
			 * 
			 *   - DataOutputStream의 다양한 종류의 write 메서드 사용 가능
			 *     - writeByte(), write(), writeChar(), writeUTF() 등
			 * 
			 */
			dos.writeByte(100); // writeByte(int v) : 바이트 단위로 쓰기
			dos.write(100);
			dos.writeChar('A'); // writeChar(int v) : 바이트 단위로 쓰기  
			dos.writeUTF("안녕하세요"); // writeUTF(String str) : 문자 단위로 쓰기
			
			/*
			 * 
			 * # 읽기
			 * 
			 *   - 주의할 점 : 데이터를 쓸 때 사용한 DataInputStream의 메서드와 매핑되는 DataOutputStream의 메서드를 동일한 순서로 사용해야 한다.
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
