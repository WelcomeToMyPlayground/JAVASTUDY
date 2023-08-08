class Parent{}
class Child extends Parent{}

public class InstanceofTest {

	public static void main(String[] args) {
		
		Parent parent = new Parent();
		Child child = new Child();
		
		// instanceof�� ��ü Ÿ���� Ȯ���ϴ� ������
		// ����ȯ ���� ���θ� Ȯ���ϸ� true/false�� ����� ��ȯ��
		// �ַ� ��� ���迡�� �θ� ��ü���� �ڽ� ��ü���� Ȯ���ϴµ� ���ȴ�
		// instanceof�� �⺻ ��� ����� "��ü + instanceof + Ŭ����"�� ���������ν� ����Ѵ�
		
		// ���� ���ؼ� instanceof�� �ش� Ŭ������ �ڱ����� �´��� Ȯ���� �ִ� ���̶�� �����ϸ� �ȴ�.
		
		// 1. �θ� ���� ���� ã������ true
		System.out.println(parent instanceof Parent); 
		// 2. �ڽ��� ��ӹ��� �θ� ���� ã������ true (��� �޾����� �ڱ� ���̶��ص� �����ϴ�?)
		System.out.println(child instanceof Parent); 
		// 3. �θ� �ڽ� ���� ã������ false
		System.out.println(parent instanceof Child); 
		// 4. �ڽ��� ���� ���� ã������ true
		System.out.println(child instanceof Child);    // true
	}

}
