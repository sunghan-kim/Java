package oop.ch07.v06.implementAndInheritance;

public class BookShelf extends Shelf implements Queue { // extends(상속)이 implements(구현)보다 먼저 온다.

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0); // ArrayList의 remove() 메서드 사용
	}

	@Override
	public int getSize() {
		return getCount(); // getCount() : Shelf 상위 클래스에서 상속받은 메서드
	}

}
