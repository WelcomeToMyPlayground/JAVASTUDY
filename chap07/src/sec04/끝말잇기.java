package sec04;

import java.util.Scanner;

public class �����ձ� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�����ձ� ������ �����մϴ�.");
		boolean run = true;

		 System.out.println("���ӿ� �����ϴ� �ο��� �� ���Դϱ�?");
		int p = s.nextInt(); // ex) 2��
		String[] p1 = new String[p]; // �ο����� �ش��ϴ� String �迭 ���� (������ p���� �迭 p1)

		for (int i = 0; i < p1.length; i++) { // �迭 ���̸�ŭ �ݺ�
			System.out.print("�������� �̸��� �Է��ϼ��� >>");
			String name = s.next();
			p1[i] = name; // �迭 �ȿ� ���ʴ�� �̸��� ����
		}

		// while ����
		String keyword2 = " ";
		String keyword = " ";
		String word = "�ƹ���";
		System.out.println("�����ϴ� �ܾ�� " + word);
		
		O:while (true) {

			for (int i = 0; i < p1.length; i++) {
				System.out.print(p1[i] + ">>"); // �迭 �ȿ� ����ִ� �̸� ���. ex) ȫ�浿>>

					keyword = s.next(); // �ܾ� �Է�
					
					for (int j = 0; j < j; j++) {
						System.out.print(p1[i+1] + ">>");
						keyword2 = s.next(); // ���� �ܾ� �Է�
					
						//�̰� �� ���� 
						if (keyword.length() - 1 != keyword2.charAt(0)) {
							
							System.out.println(p1[i+1]+"���� �����ϴ�.");
							break O;
						}
					}
					
				}
			} // while ��
		}
	}

