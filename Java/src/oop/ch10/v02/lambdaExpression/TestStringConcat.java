package oop.ch10.v02.lambdaExpression;

public class TestStringConcat {

	public static void main(String[] args) {
		
		// �Ϲ����� ���� ���
		StringConImpl impl = new StringConImpl();
		impl.makeString("hello", "world");
		
		System.out.println("================");
		
		// ���ٽ��� �̿��� ���� ��� : Ŭ���� ������ �ʿ� ����
		StringConcat concat = (s,v) -> System.out.println(s + ", " + v);
		
		concat.makeString("hello", "world");
		
		System.out.println("================");
		
		StringConcat concat2 = new StringConcat( ) { // ���������� �͸� ��ü�� �����ȴ�.
			
			@Override
			public void makeString(String s1, String s2) { 
				System.out.println(s1 + ", " + s2); 
			}
		};
		
		concat2.makeString("hello", "world");
		
	}
	
}
