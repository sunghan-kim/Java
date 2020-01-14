package oop.ch10.v02.lambdaExpression;

public class TestStringConcat {

	public static void main(String[] args) {
		
		// 일반적인 구현 방식
		StringConImpl impl = new StringConImpl();
		impl.makeString("hello", "world");
		
		System.out.println("================");
		
		// 람다식을 이용한 구현 방식 : 클래스 구현이 필요 없음
		StringConcat concat = (s,v) -> System.out.println(s + ", " + v);
		
		concat.makeString("hello", "world");
		
		System.out.println("================");
		
		StringConcat concat2 = new StringConcat( ) { // 내부적으로 익명 객체가 생성된다.
			
			@Override
			public void makeString(String s1, String s2) { 
				System.out.println(s1 + ", " + s2); 
			}
		};
		
		concat2.makeString("hello", "world");
		
	}
	
}
