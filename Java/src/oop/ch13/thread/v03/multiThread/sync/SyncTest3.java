package oop.ch13.thread.v03.multiThread.sync;

class Bank3 { // critical section
	
	/*
	 * 
	 * shared resource에 synchronized 설정을 해야 효과가 있다.
	 * 
	 *   - thread에 synchronized를 하는 것은 의미가 없다. 
	 * 
	 */
	
	private int money = 10000;
	
	public void saveMoney(int save) { 
		
		synchronized (this) { // synchronized 수행문 : 매개변수로 lock을 걸 객체를 지정
			
			int m = this.getMoney();
			
			try {
				
				Thread.sleep(3000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			setMoney(m + save);
			
		}
		
	}
	
	public synchronized void minusMoney(int minus) {
		
		synchronized (this) { // synchronized 수행문 : 매개변수로 lock을 걸 객체를 지정
			
			int m = this.getMoney();
			
			try {
				
				Thread.sleep(200);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			setMoney(m - minus);			
			
		}
		
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}

class Park3 extends Thread {
	
	public void run() {
		
		synchronized (SyncTest3.myBank) { // synchronized 수행문
			
			System.out.println("start save");
			SyncTest3.myBank.saveMoney(3000);
			System.out.println("save money : " +  SyncTest3.myBank.getMoney());
			
		}
		
	}
	
}

class ParkWife3 extends Thread {
	
	public void run() {
		
		synchronized (SyncTest3.myBank) { // synchronized 수행문
			
			System.out.println("start minus");
			SyncTest3.myBank.minusMoney(1000);
			System.out.println("minus money : " +  SyncTest3.myBank.getMoney());
			
		}
		
	}
	
}

public class SyncTest3 {

	public static Bank3 myBank = new Bank3();
	
	public static void main(String[] args) throws InterruptedException {
		
		Park3 p = new Park3();
		
		p.start();
		
		Thread.sleep(200);
		
		ParkWife3 pw = new ParkWife3();
		
		pw.start();
		
		/*
		 * 
		 *  # 잔고
		 *  
		 *    - 예상 : 12000
		 *    - 실제 결과 : 13000
		 *    
		 *    - main thread에서 0.2초 동안 쉬는 데 saveMoney() 메서드를 실행하는 동안 3초를 쉬게 된다.
		 *    
		 * 
		 */
		
	}
	
}
