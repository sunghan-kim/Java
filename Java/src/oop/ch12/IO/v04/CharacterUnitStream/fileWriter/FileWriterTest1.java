package oop.ch12.IO.v04.CharacterUnitStream.fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest1 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("writer.txt");
		
		fw.write('A'); // write(int c) ��� 
		
		char[] buf = {'B', 'C', 'D', 'E', 'F'};
		
		fw.write(buf); // write(char[] cbuf) ���
		
		fw.write("�ȳ��ϼ���"); // write(String str) ��� 

		fw.write(buf, 2, 2); // write(char[] cbuf, int off, int len) ��� : cbuf �迭���� 0 ��° �ε������� off ��ŭ ������ ��ġ���� len ������ŭ�� �����͸� write
		
		fw.close();
		
		System.out.println("end");
		
	}
	
}
