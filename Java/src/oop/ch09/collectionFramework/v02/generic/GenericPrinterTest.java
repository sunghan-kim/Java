package oop.ch09.collectionFramework.v02.generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		Powder powder = new Powder();
		powderPrinter.setMaterial(powder);
		System.out.println(powderPrinter.toString());
		
		System.out.println("=======================");
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>(); // �ν��Ͻ� �����κп� ���̾Ƹ�� ������(<>)�� �ڷ����� �� ������ �ִ�.
		
		Plastic plastic = new Plastic();
		plasticPrinter.setMaterial(plastic);
		System.out.println(plasticPrinter.toString());
		
		System.out.println("=======================");
		
		// Water�δ� 3D �����͸� ���۽�ų �� ����.
		//GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
		// -> �ڷ����� �������� ������ ���� �ִ� Ŭ����(Material)�� ��ӹ޴� ���ʸ� Ŭ������ �ڷ��� T�� �����Ѵ�. 
		
		// ���� Ŭ������ Material���� ������ �߻� �޼���(doPrinting()�� ������ ���� Ŭ�������� overriding �� ��, ���ʸ� Ŭ�������� ����� �� �ִ�.
		powderPrinter.printing();
		plasticPrinter.printing();
		
		System.out.println("=======================");
		
		// ���ʸ� Ŭ������ ȣ���� �� <T> �κ��� �� ������ �ִ�. (�ڷ����� �������� �ʾ����Ƿ� Object�� ����)
		GenericPrinter printer = new GenericPrinter();
				
				
		
	}
	
}
