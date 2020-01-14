package oop.ch10.v02.lambdaExpression;

@FunctionalInterface // 함수형 인터페이스(람다식 인터페이스)임을 선언
public interface MyMaxNumber {

	int getMaxNumber(int x, int y); // 함수형 인터페이스로 선언된 경우 하나의 메서드만 선언할 수 있다. 해당 메서드는 익명화되어 사용된다.
	
}
