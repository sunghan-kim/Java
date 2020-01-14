package oop.ch10.v01.innerClass;

class Outer2 {
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		
		int num = 100;
		
		return new Runnable() { // �͸� ���� Ŭ���� : Ŭ������ �̸��� ���� �������� ����
			
			@Override
			public void run() {
				
				//num += 10; // �͸� ���� Ŭ������ �ܺ� Ŭ������ �޼��� ���� ���������� ������ �� ����. (���ȭ ��)
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(sNum);
				
			}
			
		}; // �����ݷ�(;) ���� �ʿ�
		
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
		
		// �͸� ���� Ŭ������ ��� : �ϳ��� �������̽� �Ǵ� �߻� Ŭ������ ����� ��, Ŭ���� �̸� ���� �ٷ� new Ű���带 �̿��� ������ �� �ִ�.
		outer.runner.run();
		
	}
	
}
