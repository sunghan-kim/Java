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
		return memberName + " ȸ������ ���̵�� " + memberId + "�Դϴ�.";
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
	 *   Comparator �������̽� �������� ���� compare �߻� �޼��� �������̵�
	 * 
	 */
	@Override
	public int compare(Member2 member1, Member2 member2) {
		// Comparable �������̽� ������ �������̵��� compareTo() ������ this �� ���⼭ member1�� �ش��Ѵ�.
		// Comparator ��� �� MemberTreeSet2 �� �����ڿ��� TreeSet ��ü ���� �� Member2 ��ü�� ��������� �Ѵ�.
		return (member1.memberId - member2.memberId); // ���� �� : member1�� memberId���� member2�� memberId�� �� ���� ��� -> �������� ���� 
	}

	
 }
