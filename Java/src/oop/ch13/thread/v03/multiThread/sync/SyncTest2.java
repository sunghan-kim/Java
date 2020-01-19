package oop.ch13.thread.v03.multiThread.sync;

class Bank2 { // critical section 
	
	private int money = 10000;
	
	public synchronized void saveMoney(int save) { // �޼��忡 synchronized Ű���� ����Ͽ� ����ȭ (Bank2 Ŭ������ lock�� �ɸ�)
		
		int m = this.getMoney();
		
		try {
			
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney(m + save);
		
	}
	
	public synchronized void minusMoney(int minus) { // �޼��忡 synchronized Ű���� ����Ͽ� ����ȭ (Bank2 Ŭ������ lock�� �ɸ�)
		
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
