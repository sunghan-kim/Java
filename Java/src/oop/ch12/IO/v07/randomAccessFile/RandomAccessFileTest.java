package oop.ch12.IO.v07.randomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw"); // 두 번째 파라미터로 mode 지정 (rw : 읽고(read) 쓰기(write))
		
		rf.writeInt(100);
		
		System.out.println(rf.getFilePointer()); // 위치 확인
		
		rf.writeDouble(3.14);
		rf.writeUTF("안녕하세요");
		
		/*
		 * 
		 * 읽기
		 * 
		 *   - write를 하는 동안 포인터가 가리키는 위치가 이동했기 때문에 에러가 발생한다.
		 *   - seek() 메서드를 통해 포인터의 위치를 이동해줘야 한다.
		 * 
		 */
		rf.seek(0);
		int i = rf.readInt(); //
		double d = rf.readDouble();
		String s = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(s);
		
		rf.close();
		
		
	}
	
}
