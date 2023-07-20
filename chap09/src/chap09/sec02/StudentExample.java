package chap09.sec02;

public class StudentExample {

	public static void main(String[] args) {

		// StudentB ��ü �����ϼ���
		StudentA sta = new StudentA();
		StudentA.StudentB stb = sta.new StudentB();
		// StudentA.StudentB stb = new StudentA().new StudentB(); // �̷��� �� �ٷε� ����

		stb.name = "��ö��";
		stb.age = 22;
		stb.sleep();

		sta.person.wake();
//		sta.person.work();  // �̰� �� �ȵǳ��� => �������̵� �ȵ� �޼ҵ带 ���� ȣ�� �Ұ���
		sta.method1();

		// method2�� �Ű������� Person Ŭ���� Ÿ���� �Ѱ���� ��
		// �Ű������� �������� �����ݷ�; ��� �� ��
		sta.method2(new Person() {
			void study() {
				System.out.println("�����մϴ�");
			}

			@Override
			void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�");
				study();
				// �������̵� �ȵ� �޼ҵ�� �ٷ� ȣ���� �Ұ����ϱ� ������
				// �������� �޼ҵ带 ȣ����
			}

		}
		);
	}

}
