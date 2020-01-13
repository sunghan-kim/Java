package oop.ch09.collectionFramework.v02.generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		Powder powder = new Powder();
		powderPrinter.setMaterial(powder);
		System.out.println(powderPrinter.toString());
		
		System.out.println("=======================");
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>(); // 인스턴스 생성부분에 다이아몬드 연산자(<>)에 자료형을 안 쓸수도 있다.
		
		Plastic plastic = new Plastic();
		plasticPrinter.setMaterial(plastic);
		System.out.println(plasticPrinter.toString());
		
		System.out.println("=======================");
		
		// Water로는 3D 프린터를 동작시킬 수 없다.
		//GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
		// -> 자료형의 제약조건 정보를 갖고 있는 클래스(Material)를 상속받는 제너릭 클래스의 자료형 T를 선언한다. 
		
		// 상위 클래스인 Material에서 정의한 추상 메서드(doPrinting()를 각각의 하위 클래스에서 overriding 한 후, 제너릭 클래스에서 사용할 수 있다.
		powderPrinter.printing();
		plasticPrinter.printing();
		
		System.out.println("=======================");
		
		// 제너릭 클래스를 호출할 때 <T> 부분을 안 쓸수도 있다. (자료형이 지정되지 않았으므로 Object로 지정)
		GenericPrinter printer = new GenericPrinter();
				
				
		
	}
	
}
