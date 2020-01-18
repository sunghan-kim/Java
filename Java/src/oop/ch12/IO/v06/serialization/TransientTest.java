package oop.ch12.IO.v06.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person2 implements Serializable {
	
	String name;
	transient String job; // transient 키워드를 명시하면 해당 변수는 직렬화하지 말라는 의미이다.
	
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
		
		Person2 personLee = new Person2("이순신", "엔지니어");
		Person2 personKim = new Person2("김유신", "선생님");
		
		// 두 객체의 상태를 파일에 그대로 저장
		try ( FileOutputStream fos = new FileOutputStream("serial.dat");
			  ObjectOutputStream oos = new ObjectOutputStream(fos); ) {
			
			// FileOutputStream 만을 이용하여 파일은 생성하면 클래스와 관련된 정보들도 해당 파일에 포함되게 된다.
			// 이 때 보조 스트림의 한 종류인 ObjectOutputStream을 이용하면 된다.
			 
			oos.writeObject(personLee);
			oos.writeObject(personKim);
			
			// -> NotSerializableException 발생 (해당 클래스가 Serializable 하다는 것을 인터페이스를 구현하여 표시해야 한다.)
			// "String" 과 같은 클래스에도 Serializable 인터페이스가 구현되어 있다.
			
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
		// 내보낸 파일 읽기
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
