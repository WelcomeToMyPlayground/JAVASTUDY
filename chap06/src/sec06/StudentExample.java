package sec06;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {
		
		Student student = new Student();
		Scanner s = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			boolean check = student.checkLogin();   // �α��� ���� �޼ҵ� �ۼ�
			
			if(check) {  //�α��� �Ǿ��ٸ� �α׾ƿ�(����), ���� �Է� ó��
				System.out.println("�۾��� �������ּ���");
				System.out.println("1���� �α׾ƿ�, 2���� ���� �Է�");
				int choice = s.nextInt();
				
				if(choice==1) {
					run = false;
				} else if(choice==2) {
					student.inputExam();  //���� �Է� �޼ҵ� �ۼ�
				}
			} else {
				System.out.println("�α����� �����Ͽ����ϴ�.");
			}
		}
		
//		Student s = new Student("ȫ�浿",30);
//		
//		s.address ="���ֱ�����";    // ���� - ��� ������ private�� �����߱� ������ ���� �Ұ���
//		s.setAddress("���ֱ�����");    
//		System.out.println(s.getAddress()); // �� �������� - getter
	}

}
