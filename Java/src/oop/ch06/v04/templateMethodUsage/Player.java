package oop.ch06.v04.templateMethodUsage;

public class Player {

	//BeginnerLevel blevel;
	//AdvancedLevel alevel;
	//SuperLevel slevel;
	
	// 위와 같이 개별 클래스를 일일이 정의하는 것은 객체 지향 프로그래밍을 구현한 것이 아니다.
	
	private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel(); // 플레이어를 처음 생성하면 초급자 레벨이 된다.
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
