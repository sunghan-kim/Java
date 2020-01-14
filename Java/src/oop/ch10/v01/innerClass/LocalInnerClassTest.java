package oop.ch10.v01.innerClass;

class Outer {
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		
		int num = 100;
		
		class MyRunnable implements Runnable { // 지역 내부 클래스 : 메서드 안에서 정의된 클래스

			@Override
			public void run() {
				
				// 메서드의 지역변수는 지역 내부 클래스 안의 메서드에서는 참조는 가능하지만 변경할 수 없다. (상수가 된다.)
				//num += 10;
				//i = 200;
				
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum); // 외부 클래스의 일반 맴버 변수 사용 가능
				System.out.println(sNum); // 외부 클래스의 static 맴버 변수 사용 가능
				
			}
			
		}
		
		return new MyRunnable();
		
	}
	
}

public class LocalInnerClassTest {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
		
	}
	
}
