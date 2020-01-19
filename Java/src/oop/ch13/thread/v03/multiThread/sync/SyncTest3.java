package oop.ch13.thread.v03.multiThread.sync;

class Bank3 { // critical section
	
	/*
	 * 
	 * shared resource�� synchronized ������ �ؾ� ȿ���� �ִ�.
	 * 
	 *   - thread�� synchronized�� �ϴ� ���� �ǹ̰� ����. 
	 * 
	 */
	
	private int money = 10000;
	
	public void saveMoney(int save) { 
		
		synchronized (this) { // synchronized ���๮ : �Ű������� lock�� �� ��ü�� ����
			
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
		
		synchronized (this) { // synchronized ���๮ : �Ű������� lock�� �� ��ü�� ����
			
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
		
		synchronized (SyncTest3.myBank) { // synchronized ���๮
			
			System.out.println("start save");
			SyncTest3.myBank.saveMoney(3000);
			System.out.println("save money : " +  SyncTest3.myBank.getMoney());
			
		}
		
	}
	
}

class ParkWife3 extends Thread {
	
	public void run() {
		
		synchronized (SyncTest3.myBank) { // synchronized ���๮
			
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
		 *  # �ܰ�
		 *  
		 *    - ���� : 12000
		 *    - ���� ��� : 13000
		 *    
		 *    - main thread���� 0.2�� ���� ���� �� saveMoney() �޼��带 �����ϴ� ���� 3�ʸ� ���� �ȴ�.
		 *    
		 * 
		 */
		
	}
	
}
