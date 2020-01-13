package oop.ch09.collectionFramework.v08.treeSet;

import java.util.Comparator;

public class Member2 implements Comparator<Member2> {

	private int memberId;
	private String memberName;
	
	public Member2() {}
	
	public Member2(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Member2) {
			
			Member2 member = (Member2) obj;
			
			return this.memberId == member.memberId; 
		}
		
		return false;
		
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	/*
	 * 
	 *   Comparator 인터페이스 구현으로 인한 compare 추상 메서드 오버라이딩
	 * 
	 */
	@Override
	public int compare(Member2 member1, Member2 member2) {
		// Comparable 인터페이스 구현시 오버라이딩한 compareTo() 에서의 this 가 여기서 member1에 해당한다.
		// Comparator 사용 시 MemberTreeSet2 의 생성자에서 TreeSet 객체 생성 시 Member2 객체를 생성해줘야 한다.
		return (member1.memberId - member2.memberId); // 정수 비교 : member1의 memberId에서 member2의 memberId를 뺀 값이 양수 -> 오름차순 정렬 
	}

	
 }
