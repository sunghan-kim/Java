package oop.ch09.collectionFramework.v06.set.treeSet;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		/*
		 * 
		 *   ȸ���� ID (memberId)�� ����
		 *   
		 *     - TreeSet �� add() �޼��带 ������ ��, ���׸����� ������ Member�� ��� �񱳵Ǿ�� �� �� �������� ������ ClassCastException�� �߻��Ѵ�.
		 * 
		 */
		
		/*
		 * 
		 *   - Exception �ذ� �� ���� ��� �߰� ���
		 *   
		 *     - ��� 1 : Member Ŭ������ Comparable �������̽��� �����ϵ��� �Ѵ�.
		 *       
		 *       - Comparable �������̽� ���� �� compareTo �߻� �޼��带 �������̵��ؾ� �Ѵ�.
		 *        
		 *       - Member, MemberTreeSet Ŭ���� Ȱ���Ͽ� ����
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
		 *   - Exception �ذ� �� ���� ��� �߰� ���    
		 *         
		 *    - ��� 2 : Member2 Ŭ������ Comparator �������̽��� ����
		 *      
		 *      - Comparator �������̽� ���� �� compare �߻� �޼��带 �������̵��ؾ� �Ѵ�.
		 *      
		 *      - Member2, MemberTreeSet2 Ŭ������ Ȱ���Ͽ� ����
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
