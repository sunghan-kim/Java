package oop.ch06.v04.templateMethodUsage;

public class TemplateMethodUsageEx1 {

	/*
	 * 
	 *   # 템플릿 메서드 활용 예제
	 *   
	 *     - Player 가 있고 이 Player 가 게임을 한다.
	 *     
	 *     - 게임에서 Player가 가지는 레벨에 따라 run(), jump(), turn() 세 가지 기능을 할 수 있다.
	 *     
	 *     - 각 레벨에 따라 기능 가능 여부는 다음과 같다.
	 *     
	 *       - 초보자 레벨
	 *       
	 *         - 천천히 달린다. (run() 가능)
	 *         
	 *       - 중급자 레벨
	 *       
	 *         - 빠르게 달린다. (run() 가능)
	 *         - 점프를 할 수 있다. (jump() 가능)
	 *         
	 *       - 고급자 레벨
	 *       
	 *         - 엄청 빠르게 달린다. (run() 가능)
	 *         - 점프를 할 수 있다. (jump() 가능)
	 *         - 한 바퀴를 돌 수 있다. (turn() 가능)
	 *         
	 *     - 플레이어는 go() 명령어를 받으면 이 세 가지 기능을 수행한다.
	 *     
	 *     - 이 중 할 수 없는 것은 "할 수 없다" 는 메세지를 보낸다.
	 *     
	 *     
	 *     - Player.java, PlayerLevel.java, BeginnerLevel.java, AdvancedLevel.java, SuperLevel.java 참고
	 * 
	 * 
	 *   # 객체 지향 프로그래밍의 특징
	 *   
	 *     - 다형성, 추상화 등의 객체 지향 프로그래밍 언어의 특징을 활용하여 if문의 사용을 줄일 수 있고,
	 *       상위 클래스에 추상 클래스를 추가함으로써 버전 업그레이드 관리를 효율적으로 수행할 수 있다.
	 * 
	 */
	
}
