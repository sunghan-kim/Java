package oop.ch07.v02.polymorphismWithInterface.scheduler;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ��� ������ ���ų� ����Ⱑ ���� ���� �������� �Ҵ��մϴ�.");
	}

}
