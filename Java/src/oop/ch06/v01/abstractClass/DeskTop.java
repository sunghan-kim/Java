package oop.ch06.v01.abstractClass;

public class DeskTop extends Computer { // 1.�߻� �޼��带 ������ �ִ� Computer Ŭ������ ��� ����

	// 2. �߻� �޼��带 �����϶�� ��� �޼����� ��Ÿ����. (Add unimplemented methods)
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("DeskTop display");
	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub
		System.out.println("DeskTop typing");
		
	}

	// 3. �߻� �޼��带 �����ϴ� ��� DeskTop Ŭ������ abstract Ű���带 ����Ͽ� �߻� Ŭ������ �����ص� �ȴ�. (Make type 'DeskTop' abstract)
	//  - ����, ��� �߻� �޼��带 �����ϰ� ���� ���� ������, �����ϰ� ���� �߻� �޼��带 �����ϰ�, �ش� Ŭ������ abstract Ű���带 ����Ͽ� �߻� Ŭ������ �����ؾ� �Ѵ�.
	
	
	// 4. ���� Ŭ������ ������ �޼��嵵 ���� Ŭ�������� �������̵�(overriding)�Ͽ� ������ �� �ִ�.
	@Override
	public void turnOff() {
		System.out.println("deskTop turnoff");
	} 
	
	
}
