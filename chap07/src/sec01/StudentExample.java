package sec01;

public class StudentExample {

	public static void main(String[] args) {
		
		// ��ü ���� -> �Ű����� 3�� �Ѱ��ֱ�
		Student student = new Student(20192231, 11 , 160);
		
		// �ڱ� �޼ҵ� ȣ��
		 student.study("������");
		// �θ� �޼ҵ� ȣ��
		 
		 String eat = student.eat("��");
		 System.out.println(eat);
		// System.out.println(student.eat("��"));  �� �޾ƿ͵� �ٷ� ����� ��
		 
		 String speed = student.run(10);
		 System.out.println(speed);
		 
		 //��°��
		 //�����ǿ��� �����մϴ�.
		 //����(��) ���� �Ծ��
		 //10�ӵ��� �޸��ϴ�.

	}

}
