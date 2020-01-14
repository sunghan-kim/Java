package oop.ch10.v01.innerClass;

class Outer2 {
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		
		int num = 100;
		
		return new Runnable() { // 익명 내부 클래스 : 클래스의 이름을 따로 지정하지 않음
			
			@Override
			public void run() {
				
				//num += 10; // 익명 내부 클래스도 외부 클래스의 메서드 내의 지역변수를 변경할 수 없다. (상수화 됨)
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(sNum);
				
			}
			
		}; // 새미콜론(;) 지정 필요
		
	}
	
	Runnable runner = new Runnable() {

		@Override
		public void run() {
			System.out.println("test");
		}
		
	};
	
}

public class AnonymousInnerClassTest {

	public static void main(String[] args) {
		
		Outer2 outer = new Outer2();
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
		
		System.out.println("================");
		
		// 익명 내부 클래스의 사용 : 하나의 인터페이스 또는 추상 클래스를 사용할 때, 클래스 이름 없이 바로 new 키워드를 이용해 생성할 수 있다.
		outer.runner.run();
		
	}
	
}
