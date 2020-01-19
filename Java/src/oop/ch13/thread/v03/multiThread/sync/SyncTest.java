package oop.ch13.thread.v03.multiThread.sync;

class Bank { // critical section 
	
	private int money = 10000;
	
	public void saveMoney(int save) {
		
		int m = this.getMoney();
		
		try {
			
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney(m + save);
		
	}
	
	public void minusMoney(int minus) {
		
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

class Park extends Thread {
	
	public void run() {
		
		System.out.println("start save");
		SyncTest.myBank.saveMoney(3000);
		System.out.println("save money : " +  SyncTest.myBank.getMoney());
		
	}
	
}

class ParkWife extends Thread {
	
	public void run() {
		
		System.out.println("start minus");
		SyncTest.myBank.minusMoney(1000);
		System.out.println("minus money : " +  SyncTest.myBank.getMoney());
		
	}
	
}

public class SyncTest {

	public static Bank myBank = new Bank();
	
	public static void main(String[] args) throws InterruptedException {
		
		Park p = new Park();
		
		p.start();
		
		Thread.sleep(200);
		
		ParkWife pw = new ParkWife();
		
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
