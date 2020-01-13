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
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
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
	 *   Comparable 인터페이스 구현으로 인한 compareTo 추상 메서드 오버라이딩
	 * 
	 */
	@Override
	public int compareTo(Member member) {
		// this와 매개변수 비교
		//return (this.memberId - member.memberId ); // 숫자(int) 정렬 시 this의 memberId에서 넘어온 매개변수의 memberId를 뺀 값이 양수이면 오름차순으로 정렬됨
		//return (this.memberId - member.memberId) * (-1); // 숫자(int) 정렬 시  this의 memberId에서 넘어온 매개변수의 memberId를 뺀 값이 음수이면 내림차순으로 정렬됨
		return this.memberName.compareTo(member.memberName); // 문자열 정렬 시 String 클래스에 이미 정의된 compareTo() 메서드를 사용한다. (오름차순)
	}
	
 }
