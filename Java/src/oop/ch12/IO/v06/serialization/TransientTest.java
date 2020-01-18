package oop.ch12.IO.v06.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person2 implements Serializable {
	
	String name;
	transient String job; // transient Ű���带 ����ϸ� �ش� ������ ����ȭ���� ����� �ǹ��̴�.
	
	public Person2(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + ", " + job;
	}
	
}

public class TransientTest {

	public static void main(String[] args) {
		
		Person2 personLee = new Person2("�̼���", "�����Ͼ�");
		Person2 personKim = new Person2("������", "������");
		
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
			
			Person2 p1 = (Person2) ois.readObject();
			Person2 p2 = (Person2) ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
			
		} catch (IOException e) {
			System.out.println(e); 
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		
	}
	
}
