package sec01.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		
		int r = 10;
		
		Calculator calculator = new Calculator();   // �θ�
		System.out.println("���� ����: " + calculator.areaCircle(r));
		System.out.println();
		
		computer2 computer = new computer2();		// �ڽ�
		System.out.println("���� ����: " + computer.areaCircle(r)); // �ڽ� Ŭ�������� �����ǵ� �޼ҵ带 ȣ��
		System.out.println();
		
		//��°��
		//Calculator�� areaCircle() ����
		//���� ����: 314.159

		//Computer2�� areaCircle() ����
		//���� ����: 314.1592653589793

	}

}
