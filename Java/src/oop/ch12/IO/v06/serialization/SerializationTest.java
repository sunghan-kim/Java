package oop.ch12.IO.v06.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	
	String name;
	String job;
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + ", " + job;
	}
	
}

public class SerializationTest {

	public static void main(String[] args) {
		
		Person personLee = new Person("�̼���", "�����Ͼ�");
		Person personKim = new Person("������", "������");
		
		// �� ��ü�� ���¸� ���Ͽ� �״�� ����
		try ( FileOutputStream fos = new FileOutputStream("serial.dat");
			  ObjectOutputStream oos = new ObjectOutputStream(fos); ) {
			
			// FileOutputStream ���� �̿��Ͽ� ������ �����ϸ� Ŭ������ ���õ� �����鵵 �ش� ���Ͽ� ���Եǰ� �ȴ�.
			// �� �� ���� ��Ʈ���� �� ������ ObjectOutputStream�� �̿��ϸ� �ȴ�.
			 
			oos.writeObject(personLee);
			oos.writeObject(personKim);
			
			// -> NotSerializableException �߻� (�ش� Ŭ������ Serializable �ϴٴ� ���� �������̽��� �����Ͽ� ǥ���ؾ� �Ѵ�.)
			// "String" �� ���� Ŭ�������� Serializable �������̽��� �����Ǿ� �ִ�.
			
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
		// ������ ���� �б�
		try ( FileInputStream fis = new FileInputStream("serial.dat");
			  ObjectInputStream ois = new ObjectInputStream(fis); ) {
			
			Person p1 = (Person) ois.readObject();
			Person p2 = (Person) ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
			
		} catch (IOException e) {
			System.out.println(e); 
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		
		
	}
	
}
