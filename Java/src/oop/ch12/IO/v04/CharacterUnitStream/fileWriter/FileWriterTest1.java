package oop.ch12.IO.v04.CharacterUnitStream.fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest1 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("writer.txt");
		
		fw.write('A'); // write(int c) 사용 
		
		char[] buf = {'B', 'C', 'D', 'E', 'F'};
		
		fw.write(buf); // write(char[] cbuf) 사용
		
		fw.write("안녕하세요"); // write(String str) 사용 

		fw.write(buf, 2, 2); // write(char[] cbuf, int off, int len) 사용 : cbuf 배열에서 0 번째 인덱스부터 off 만큼 떨어진 위치부터 len 개수만큼의 데이터를 write
		
		fw.close();
		
		System.out.println("end");
		
	}
	
}
