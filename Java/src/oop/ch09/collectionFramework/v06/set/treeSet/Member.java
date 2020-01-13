package oop.ch09.collectionFramework.v06.set.treeSet;

public class Member implements Comparable<Member> {

	private int memberId;
	private String memberName;
	
	public Member() {}
	
	public Member(int memberId, String memberName) {
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

		if (obj instanceof Member) {
			
			Member member = (Member) obj;
			
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
	 *   Comparable �������̽� �������� ���� compareTo �߻� �޼��� �������̵�
	 * 
	 */
	@Override
	public int compareTo(Member member) {
		// this�� �Ű����� ��
		//return (this.memberId - member.memberId ); // ����(int) ���� �� this�� memberId���� �Ѿ�� �Ű������� memberId�� �� ���� ����̸� ������������ ���ĵ�
		//return (this.memberId - member.memberId) * (-1); // ����(int) ���� ��  this�� memberId���� �Ѿ�� �Ű������� memberId�� �� ���� �����̸� ������������ ���ĵ�
		return this.memberName.compareTo(member.memberName); // ���ڿ� ���� �� String Ŭ������ �̹� ���ǵ� compareTo() �޼��带 ����Ѵ�. (��������)
	}
	
 }
