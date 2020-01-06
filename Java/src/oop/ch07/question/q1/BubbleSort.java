package oop.ch07.question.q1;

public class BubbleSort implements Sort {

	@Override
	public void ascending(int[] arr) {
		System.out.println("BobbleSort ascendinig");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("BobbleSort descendinig");
	}
	
	@Override
	public void description() {
		// TODO Auto-generated method stub
		Sort.super.description();
		System.out.println("BobbleSort 알고리즘입니다.");
	}

}
