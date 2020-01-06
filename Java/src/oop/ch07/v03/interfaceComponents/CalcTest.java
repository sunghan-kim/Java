package oop.ch07.v03.interfaceComponents;

public class CalcTest {

	public static void main(String[] args) {

		Calc calc = new CompleteCalc();
		
		int n1 = 10;
		int n2 = 2;
		
		System.out.println(calc.add(n1, n2));
		System.out.println(calc.substract(n1, n2));
		System.out.println(calc.times(n1, n2));
		System.out.println(calc.divide(n1, n2));
		
		// 디폴트 메서드
		calc.description(); // 재정의된 디폴트 메서드가 없는 경우 -> 인터페이스의 디폴트 메서드 호출
							// 재정의된 디폴트 메서드가 있는 경우 -> 재정의된 디폴트 메서드 호출
		
		
		// 정적(static) 메서드 : 인터페이스 타입을 통해 바로 호출 가능 (인스턴스 생성할 필요 x)
		int[] arr = {1,2,3,4,5};
		int total = Calc.total(arr);
		System.out.println(total);
		
		
		// private 메서드를 인터페이스 내에서 구현한 뒤 해당 메서드를 디폴트 메서드 안에서 사용하면 아래 코드를 통해 실행할 수 있다.
		calc.description(); 
		
	}
	
}
