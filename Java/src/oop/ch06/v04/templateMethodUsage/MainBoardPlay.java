package oop.ch06.v04.templateMethodUsage;

public class MainBoardPlay {

	public static void main(String[] args) {
		
		Player player = new Player(); // Player의 생성자에서 초급자 레벨 지정 및 메세지 출력
		player.play(1);
		
		// 플레이어의 레벨을 초급자에서 중급자로 업그레이드
		PlayerLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel); // Player의 upgradeLevel 메서드에서 레벨 업그레이드 및 메세지 출력
		player.play(2);
		
		// 플레이어의 레벨을 중급자에서 고급자로 업그레이드
		PlayerLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		
	}
	
}
