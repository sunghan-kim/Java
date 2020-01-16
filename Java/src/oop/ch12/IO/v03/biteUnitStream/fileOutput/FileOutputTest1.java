package oop.ch12.IO.v03.biteUnitStream.fileOutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest1 {

	public static void main(String[] args) {
		
		try ( FileOutputStream fos = new FileOutputStream("output.txt") ) {
			
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
			// output.txt ���Ͽ� "ABC" ��� �ؽ�Ʈ�� �ԷµǾ� ������
			
		} catch (IOException e) {
			System.out.println(e); 
		}
		
	}
	
}
