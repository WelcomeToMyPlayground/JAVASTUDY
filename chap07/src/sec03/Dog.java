package sec03;

public class Dog extends Animal{
	
	public Dog() {
		this.kind = "������";
	}
	
	// �߻� �޼ҵ� ������
	@Override
	public void sound() {
		System.out.println("�������� �۸�");
		
	}
	
}
