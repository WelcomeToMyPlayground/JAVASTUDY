package sec02.exam05;

public class PhoneExample {
	
	public static void main(String[] args) {
		
		//SmartPhone sp = new SmartPhone();  // �⺻ ��ü ������ ���� ���� �����
		//System.out.println(sp.cost); // SmartPhone ���� ȣ��
		
		Phone p = new SmartPhone();
		// �ڽ� ��ü�� �θ� ��ü�� Ÿ�� ��ȯ ��Ŵ (�ڵ���ȯ)
		System.out.println(p.cost);
		p.powerOn();
		p.ring();  // �������̵� �޼ҵ� ȣ��
		// p.videoOn();  // �ڽ� Ŭ���� �޼ҵ� ȣ�� �ȵ�
		// p.PhoneCase="�ϵ����̽�";  // �ڽ� Ŭ���� �ʵ� ��� �ȵ�
		
		SmartPhone sp = (SmartPhone)p;
		// �θ� ��ü�� �ڽ� ��ü�� ���� Ÿ�� ��ȯ ��Ŵ
		sp.Phonecase="����Ʈ���̽�"; // �ڽ� ��ü �ʵ峪 �޼ҵ� ��� ����
		sp.powerOn();				 // �θ� ��ü �޼ҵ� ��� ����, ��� �޾ұ� ����
		System.out.println(sp.cost); // 200000 ���, ���� �̸��� �ʵ�� �ڽ� ��ü ���
		
		//Phone p2 = new Phone();          // �ڽ� Ÿ���� �θ� Ÿ������ ��ȯ���� ���� ���¿��� 
		//SmartPhone sp2 = (SmartPhone)p2; // �θ� Ÿ���� �ڽ� Ÿ������ ���� ��ȯ�� ���� ����
	
		//��°��
		//100000
		//������ �����ϴ�
		//����Ʈ���� �︳�ϴ�
		//������ �����ϴ�
		//200000		
	}
}
