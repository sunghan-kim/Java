package oop.ch10.v01.innerClass;

import oop.ch07.v05.interfaceInheritance.MyClass;

class OutClass { // 외부 클래스 
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		
		// 외부 클래스의 생성자에서 내부 클래스 생성
		inClass = new InClass();
		
	}
	
	// 내부 클래스 (인스턴스 내부 클래스 : 맴버 변수 자리에 정의됨)
	class InClass { 
		
		int iNum = 100;
		//static int sInNum = 200; // static 키워드의 경우, 인스턴스 생성 없이 사용이 가능해야 하므로, 내부 클래스에서 static 키워드를 갖는 변수 및 메서드를 만들 수 없다.
		 						 // 내부 클래스(InClass)가 static 클래스라면 내부 클래스 안에서 static 변수 및 메서드를 만들 수 있다.
		
		void inTest() {
			System.out.println(num); // 내부 클래스의 메서드 안에서 외부 클래스의 private 맴버 변수 사용 가능
			System.out.println(sNum); // 내부 클래스의 메서드 안에서 외부 클래스의 static 맴버 변수 사용 가능
		}
		
	}
	
	public void usingInner() {
		inClass.inTest();
	}
	
	// 정적 내부 클래스 : 외부 클래스(OutClass)의 인스턴스 생성 없이 사용 가능
	static class InStaticClass { 
		
		int inNum = 100;
		static int sInNum = 200; // static 맴버 변수 생성 가능
		
		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum); // OutClass 의 맴버 변수 사용
		}
		
		static void sTest() {
			//System.out.println(inNum); // static 클래스 내의 static 키워드가 지정되지 않은 맴버 변수는 static 메서드에서 사용 불가능
			System.out.println(sInNum);
			System.out.println(sNum);
		}
		
	}
	
}

public class InnerTest {

	public static void main(String[] args) {
		
		OutClass outClass = new OutClass(); // 외부 클래스 인스턴스 생성 시 내부 클래스도 생성됨
		outClass.usingInner();

		System.out.println("=====================");
		
		OutClass.InClass myInClass = outClass.new InClass(); // 외부 클래스 객체(outClass)를 이용해 내부 클래스 인스턴스를 생성할 수 있다.
														     // 내부 클래스에 private 키워드를 설정하면 인스턴스 생성 불가능
		
		myInClass.inTest();
		
		System.out.println("=====================");
		
		// 정적 내부 클래스 사용
		OutClass.InStaticClass.sTest(); // OutClass 의 인스턴스 생성 없이 정적 내부 클래스의 정적 메서드 사용 가능
		
		System.out.println("=====================");
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		
		sInClass.inTest(); // 정적 내부 클래스의 일반 메서드의 경우, 정적 내부 클래스의 객체 생성 후 사용 가능
		
	}
	
}
