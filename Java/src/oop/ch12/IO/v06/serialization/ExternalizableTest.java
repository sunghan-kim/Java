package oop.ch12.IO.v06.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

class Person3 implements Externalizable {
	
	String name;
	transient String job;
	 
	/*
	 * 
	 * Serializable �������̽� ��� Externalizable �������̽��� ����ϸ� �߻� �޼��带 �������̵��Ͽ� �а� ���� �޼��带 ������ �� �ִ�.
	 * 
	 */
	
	@Override
	public void readExternal(ObjectInput arg0) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void writeExternal(ObjectOutput arg0) throws IOException {
		// TODO Auto-generated method stub
		
	}
	
}

public class ExternalizableTest {

}
