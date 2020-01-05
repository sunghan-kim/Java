package oop.ch06.v04.templateMethodUsage;

public class Player {

	//BeginnerLevel blevel;
	//AdvancedLevel alevel;
	//SuperLevel slevel;
	
	// ���� ���� ���� Ŭ������ ������ �����ϴ� ���� ��ü ���� ���α׷����� ������ ���� �ƴϴ�.
	
	private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel(); // �÷��̾ ó�� �����ϸ� �ʱ��� ������ �ȴ�.
		level.showLevelMessage();
	}

	public PlayerLevel getLevel() {
		return level;
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
	
}
