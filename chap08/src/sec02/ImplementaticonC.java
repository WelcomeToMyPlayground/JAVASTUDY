package sec02;

public class ImplementaticonC implements interfaceC {

	@Override
	public void methodA() {
		System.out.println("�޼ҵ�A ����");
		
	}

	@Override
	public void methodB() {
		System.out.println("�޼ҵ�B ����");
		
	}

	@Override
	public void methodC() {
		System.out.println("�޼ҵ�C ����");
		
	}
	
	public static void main(String[] args) {
		ImplementaticonC imple = new ImplementaticonC();
		// �������̽�C ��ü�� ic�� A�� B�� ��� �޼ҵ� ��� ������
		interfaceC ic = imple;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
	
}
