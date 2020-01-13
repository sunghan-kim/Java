package oop.ch09.collectionFramework.v06.set.treeSet;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		/*
		 * 
		 *   회원의 ID (memberId)로 정렬
		 *   
		 *     - TreeSet 에 add() 메서드를 실행할 때, 제네릭으로 지정된 Member가 어떻게 비교되어야 할 지 지정되지 않으면 ClassCastException이 발생한다.
		 * 
		 */
		
		/*
		 * 
		 *   - Exception 해결 및 정렬 기능 추가 방법
		 *   
		 *     - 방법 1 : Member 클래스를 Comparable 인터페이스를 구현하도록 한다.
		 *       
		 *       - Comparable 인터페이스 구현 시 compareTo 추상 메서드를 오버라이딩해야 한다.
		 *        
		 *       - Member, MemberTreeSet 클래스 활용하여 구현
		 * 
		 */
		MemberTreeSet manager = new MemberTreeSet();
		
		Member memberLee = new Member(300, "Lee");
		Member memberKim = new Member(100, "Kim");
		Member memberPark = new Member(200, "Park");
		
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		
		
		manager.showAllMember();
		
		System.out.println("=============================");
		
		/*
		 * 
		 *   - Exception 해결 및 정렬 기능 추가 방법    
		 *         
		 *    - 방법 2 : Member2 클래스를 Comparator 인터페이스를 구현
		 *      
		 *      - Comparator 인터페이스 구현 시 compare 추상 메서드를 오버라이딩해야 한다.
		 *      
		 *      - Member2, MemberTreeSet2 클래스를 활용하여 구현
 		 * 
		 */
		
		MemberTreeSet2 manager2 = new MemberTreeSet2();
		
		Member2 memberLee2 = new Member2(300, "Lee");
		Member2 memberKim2 = new Member2(100, "Kim");
		Member2 memberPark2 = new Member2(200, "Park");
		
		
		manager2.addMember(memberLee2);
		manager2.addMember(memberKim2);
		manager2.addMember(memberPark2);
		
		
		manager2.showAllMember();
		
	}
	
}
