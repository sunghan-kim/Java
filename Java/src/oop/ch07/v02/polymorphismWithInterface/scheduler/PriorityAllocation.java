package oop.ch07.v02.polymorphismWithInterface.scheduler;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("������� ���� ���� call�� ���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ���õ��� ���� �������� ���� ����մϴ�.");
	}

}
