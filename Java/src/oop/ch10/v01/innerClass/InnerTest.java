package oop.ch10.v01.innerClass;

import oop.ch07.v05.interfaceInheritance.MyClass;

class OutClass { // �ܺ� Ŭ���� 
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		
		// �ܺ� Ŭ������ �����ڿ��� ���� Ŭ���� ����
		inClass = new InClass();
		
	}
	
	// ���� Ŭ���� (�ν��Ͻ� ���� Ŭ���� : �ɹ� ���� �ڸ��� ���ǵ�)
	class InClass { 
		
		int iNum = 100;
		//static int sInNum = 200; // static Ű������ ���, �ν��Ͻ� ���� ���� ����� �����ؾ� �ϹǷ�, ���� Ŭ�������� static Ű���带 ���� ���� �� �޼��带 ���� �� ����.
		 						 // ���� Ŭ����(InClass)�� static Ŭ������� ���� Ŭ���� �ȿ��� static ���� �� �޼��带 ���� �� �ִ�.
		
		void inTest() {
			System.out.println(num); // ���� Ŭ������ �޼��� �ȿ��� �ܺ� Ŭ������ private �ɹ� ���� ��� ����
			System.out.println(sNum); // ���� Ŭ������ �޼��� �ȿ��� �ܺ� Ŭ������ static �ɹ� ���� ��� ����
		}
		
	}
	
	public void usingInner() {
		inClass.inTest();
	}
	
	// ���� ���� Ŭ���� : �ܺ� Ŭ����(OutClass)�� �ν��Ͻ� ���� ���� ��� ����
	static class InStaticClass { 
		
		int inNum = 100;
		static int sInNum = 200; // static �ɹ� ���� ���� ����
		
		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum); // OutClass �� �ɹ� ���� ���
		}
		
		static void sTest() {
			//System.out.println(inNum); // static Ŭ���� ���� static Ű���尡 �������� ���� �ɹ� ������ static �޼��忡�� ��� �Ұ���
			System.out.println(sInNum);
			System.out.println(sNum);
		}
		
	}
	
}

public class InnerTest {

	public static void main(String[] args) {
		
		OutClass outClass = new OutClass(); // �ܺ� Ŭ���� �ν��Ͻ� ���� �� ���� Ŭ������ ������
		outClass.usingInner();

		System.out.println("=====================");
		
		OutClass.InClass myInClass = outClass.new InClass(); // �ܺ� Ŭ���� ��ü(outClass)�� �̿��� ���� Ŭ���� �ν��Ͻ��� ������ �� �ִ�.
														     // ���� Ŭ������ private Ű���带 �����ϸ� �ν��Ͻ� ���� �Ұ���
		
		myInClass.inTest();
		
		System.out.println("=====================");
		
		// ���� ���� Ŭ���� ���
		OutClass.InStaticClass.sTest(); // OutClass �� �ν��Ͻ� ���� ���� ���� ���� Ŭ������ ���� �޼��� ��� ����
		
		System.out.println("=====================");
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		
		sInClass.inTest(); // ���� ���� Ŭ������ �Ϲ� �޼����� ���, ���� ���� Ŭ������ ��ü ���� �� ��� ����
		
	}
	
}
