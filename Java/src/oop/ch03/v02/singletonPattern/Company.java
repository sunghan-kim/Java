package oop.ch03.v02.singletonPattern;

public class Company {

	private static Company instance = new Company(); // 2. ���ο��� �ν��Ͻ� ����
	
	private Company() {} // 1. private ������ (�̷��� �ϸ� �����Ϸ��� �ڵ����� �����ڸ� ���� �� �ʴ´�.)
	
	// 3. �ܺ� Ŭ�������� Comany �ν��Ͻ��� ����� �� �ִ� get �޼��� ����
	//  - �� �޼��带 �Ϲ� �޼���� ����� �Ǹ� �ܺ� Ŭ���������� �ν��Ͻ��� �������� ���ϹǷ� �ش� �޼��带 ����� �� ����.
	//  - �׷��Ƿ� �ش� �޼���� static �޼���� �����ؾ� �Ѵ�.
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
