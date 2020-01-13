package oop.ch09.collectionFramework.v06.set.hashSet;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet manager = new MemberHashSet();
		
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberPark = new Member(300, "Park");
		
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		
		
		manager.showAllMember();
		
		System.out.println("=============================");
		
		manager.removeMember(100);
		
		manager.showAllMember();
		
		System.out.println("=============================");
		
		Member memberPark2 = new Member(300, "Park2");
		manager.addMember(memberPark2);
		
		manager.showAllMember();
		
		/*
		 * 
		 *   memberId가 300으로 중복되는 Park2가 추가된 이유
		 *   
		 *     - memberPark 과 memberPark2가 같다는 것이 정의되지 않았기 때문 
		 *     
		 *     - Member 클래스에서 memberId 가 같으면 똑같은 Member 다는 것을 정의해야 한다.
		 *     
		 *     - Object의 equals() 와 hashCode() 재정의
		 * 
		 */
		
		// Member 클래스에서 equals() 와 hashCode() 재정의한 후 Park2 가 추가되지 않는 것 확인
		
	}
	
}
