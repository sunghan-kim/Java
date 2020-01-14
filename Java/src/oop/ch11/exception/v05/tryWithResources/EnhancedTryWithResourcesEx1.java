package oop.ch11.exception.v05.tryWithResources;

public class EnhancedTryWithResourcesEx1 {

	/*
	 * 
	 * # ���� try - with - resources ��
	 * 
	 *   - java 9 ���� �����Ǵ� ����
	 *   
	 *   - �ڹ� 9 ����
	 *   
	 *     AutoCloseObj obj = new AutoCloseObj();
	 *     
	 *     try (AutoCloseObj obj2 = obj) { // �ٸ� ���� ������ �ٽ� �����ؾ� ��
	 *     
	 *     		throw new Exception();
	 *     
	 *     } catch (Exception e) {
	 *     
	 *     		System.out.println("���� �κ��Դϴ�.");
	 *     
	 *     }
	 *     
	 *     
	 *   - �ڹ� 9 ����
	 *   
	 *     AutoCloseObj obj = new AutoCloseObj();
	 *     
	 *     try (obj) { // �ܺο��� ������ ������ �״�� �� �� ����
	 *     
	 *     		throw new Exception();
	 *     
	 *     } catch (Exception e) {
	 *     
	 *     		System.out.println("���� �κ��Դϴ�.");
	 *     
	 *     }
	 * 
	 */
	
}
