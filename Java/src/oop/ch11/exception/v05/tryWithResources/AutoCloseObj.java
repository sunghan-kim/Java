package oop.ch11.exception.v05.tryWithResources;

public class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {
		
		System.out.println("close() �� ȣ��Ǿ����ϴ�.");
		
	}

}
