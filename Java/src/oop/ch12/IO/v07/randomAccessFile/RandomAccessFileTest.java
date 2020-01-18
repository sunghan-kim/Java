package oop.ch12.IO.v07.randomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw"); // �� ��° �Ķ���ͷ� mode ���� (rw : �а�(read) ����(write))
		
		rf.writeInt(100);
		
		System.out.println(rf.getFilePointer()); // ��ġ Ȯ��
		
		rf.writeDouble(3.14);
		rf.writeUTF("�ȳ��ϼ���");
		
		/*
		 * 
		 * �б�
		 * 
		 *   - write�� �ϴ� ���� �����Ͱ� ����Ű�� ��ġ�� �̵��߱� ������ ������ �߻��Ѵ�.
		 *   - seek() �޼��带 ���� �������� ��ġ�� �̵������ �Ѵ�.
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
