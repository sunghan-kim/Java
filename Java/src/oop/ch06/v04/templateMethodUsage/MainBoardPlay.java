package oop.ch06.v04.templateMethodUsage;

public class MainBoardPlay {

	public static void main(String[] args) {
		
		Player player = new Player(); // Player�� �����ڿ��� �ʱ��� ���� ���� �� �޼��� ���
		player.play(1);
		
		// �÷��̾��� ������ �ʱ��ڿ��� �߱��ڷ� ���׷��̵�
		PlayerLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel); // Player�� upgradeLevel �޼��忡�� ���� ���׷��̵� �� �޼��� ���
		player.play(2);
		
		// �÷��̾��� ������ �߱��ڿ��� ����ڷ� ���׷��̵�
		PlayerLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		
	}
	
}
