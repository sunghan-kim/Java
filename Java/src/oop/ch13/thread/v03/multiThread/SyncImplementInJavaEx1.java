package oop.ch13.thread.v03.multiThread;

public class SyncImplementInJavaEx1 {

	/*
	 * 
	 * # 자바에서 동기화 구현
	 * 
	 *   - synchronized 수행문과 synchronized 메서드를 이용
	 *   
	 *     1. synchronized 수행문
	 *     
	 *       synchronized(참조형 수식) {
	 *       
	 *       }
	 *       
	 *       - 참조형 수식에 해당되는 객체에 lock을 건다.
	 *       
	 *     2. synchronized 메서드
	 *       
	 *       - 현재 이 메서드가 속해 있는 객체에 lock을 건다.
	 *       
	 *       - synchronized 메서드 내에서 다른 synchronized 메서드를 호출하지 않는다.
	 *         (deadlock 방지)
	 * 
	 */
	
}
