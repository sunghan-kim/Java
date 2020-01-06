package oop.ch07.v06.implementAndInheritance;

public class BookShelf extends Shelf implements Queue { // extends(���)�� implements(����)���� ���� �´�.

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0); // ArrayList�� remove() �޼��� ���
	}

	@Override
	public int getSize() {
		return getCount(); // getCount() : Shelf ���� Ŭ�������� ��ӹ��� �޼���
	}

}
