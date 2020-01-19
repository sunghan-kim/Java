package oop.ch13.thread.v03.multiThread.sync;

class Bank2 { // critical section 
	
	private int money = 10000;
	
	public synchronized void saveMoney(int save) { // 메서드에 synchronized 키워드 사용하여 동기화 (Bank2 클래스에 lock이 걸림)
		
		int m = this.getMoney();
		
		try {
			
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney(m + save);
		
	}
	
	public synchronized void minusMoney(int minus) { // 메서드에 synchronized 키워드 사용하여 동기화 (Bank2 클래스에 lock이 걸림)
		
		int m = this.getMoney();
		
		try {
			
			Thread.sleep(200);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney(m - minus);
		
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}

class Park2 extends Thread {
	
	public void run() {
		
		System.out.println("start save");
		SyncTest2.myBank.saveMoney(3000);
		System.out.println("save money : " +  SyncTest2.myBank.getMoney());
		
	}
	
}

class ParkWife2 extends Thread {
	
	public void run() {
		
		System.out.println("start minus");
		SyncTest2.myBank.minusMoney(1000);
		System.out.println("minus money : " +  SyncTest2.myBank.getMoney());
		
	}
	
}

public class SyncTest2 {

	public static Bank2 myBank = new Bank2();
	
	public static void main(String[] args) throws InterruptedException {
		
		Park2 p = new Park2();
		
		p.start();
		
		Thread.sleep(200);
		
		ParkWife2 pw = new ParkWife2();
		
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
