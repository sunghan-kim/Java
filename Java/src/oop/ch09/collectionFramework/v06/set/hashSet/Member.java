package oop.ch09.collectionFramework.v06.set.hashSet;

public class Member {

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
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}

	
	/*
	 *
	 *  중복 Member 제거를 위한 Object의  메서드 오버라이딩
	 * 
	 */
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
	
 }
