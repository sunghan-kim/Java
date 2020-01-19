package oop.ch13.thread.v03.multiThread.waitNotify;

public class WaitNotifyEx1 {

	/*
	 * 
	 * # wait() / notify()
	 * 
	 *   - wait()
	 *   
	 *     - 리소스가 더 이상 유효하지 않은 경우 리소스가 사용 가능할 때 까지 기다리기 위해
	 *     
	 *       thread를 non-runnable 상태로 전환
	 *       
	 *     - wait() 상태가 된 thread는 notify() 가 호출될 때까지 기다린다.
	 *     
	 *   
	 *   - notify()
	 *   
	 *     - wait() 하고 있는 thread 중 한 thread를 runnable 한 상태로 깨움
	 *     
	 *     - 깨울 thread는 랜덤하게 선택
	 *     
	 *   
	 *   - notifyAll()
	 *   
	 *     - wait() 하고 있는 모든 thread 가 runnable 한 상태가 되도록 함
	 *     
	 *     - notify() 보다 notifyAll()을 사용하기를 권장
	 *     
	 *     - 특정 thread 가 통지를 받도록 제어할 수 없으므로 모두 깨운 후 scheduler에 CPU를 점유하는 것이 좀 더 공평하다고 함
	 * 
	 */
	
}
