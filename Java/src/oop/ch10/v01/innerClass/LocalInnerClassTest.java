package oop.ch10.v01.innerClass;

class Outer {
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		
		int num = 100;
		
		class MyRunnable implements Runnable { // ���� ���� Ŭ���� : �޼��� �ȿ��� ���ǵ� Ŭ����

			@Override
			public void run() {
				
				// �޼����� ���������� ���� ���� Ŭ���� ���� �޼��忡���� ������ ���������� ������ �� ����. (����� �ȴ�.)
				//num += 10;
				//i = 200;
				
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum); // �ܺ� Ŭ������ �Ϲ� �ɹ� ���� ��� ����
				System.out.println(sNum); // �ܺ� Ŭ������ static �ɹ� ���� ��� ����
				
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
