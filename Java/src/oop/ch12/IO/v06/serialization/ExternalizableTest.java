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
	 * Serializable 인터페이스 대신 Externalizable 인터페이스를 사용하면 추상 메서드를 오버라이딩하여 읽고 쓰는 메서드를 구현할 수 있다.
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
