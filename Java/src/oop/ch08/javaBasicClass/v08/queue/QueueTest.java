package oop.ch08.javaBasicClass.v08.queue;

import java.util.ArrayList;

class MyQueue {
	
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enqueue(String data) {
		arrayQueue.add(data);
	}
	
	public String dequeue() {
		int len = arrayQueue.size();
		if (len == 0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		
		return arrayQueue.remove(0);
		
	}
	
}

public class QueueTest {

	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue();
		
		queue.enqueue("A");
		queue.enqueue("B");
		queue.enqueue("C");
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
		// Queue는 인터페이스가 구현되어 있다. 이 Queue 인터페이스를 이용해 구현된 클래스들(LinkedList 등)이 존재한다.
		
	}
	
}
