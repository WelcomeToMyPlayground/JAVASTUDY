package sec01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class �ؽøʿ���1 {

	// ����� �α����� ��ĳ�ʸ� �̿��Ͽ� 3���� �Է¹�������
	// ��) �ѱ� 5000, �Ϻ� 12000, �߱� 30000
	// �ش� �����͸� �ؽø����� ������ ��
	// ����ڰ� ���� �̸��� �Է��ϸ� �α����� ����ϴ� �ڵ带 �ۼ��ϼ���
	// ����ڰ� �׸��̶�� �Է��ϸ� �����ϼ���

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Map<String, Integer> map = new HashMap<>();
		System.out.println("����, �α��� �Է�");
		for (int i = 0; i < 3; i++) {
			map.put(s.next(), s.nextInt());
		}

		while (true) {
			System.out.print("���� �̸��� �Է����ּ��� : ");
			String country = s.next();
			if (country.equals("�׸�")) {
				System.out.println("�˻��� �����մϴ�.");
				break;
			}

			if (map.containsKey(country)) {
				System.out.println("�ش� ������ �α� ���� : " + map.get(country));
			} else {
				System.out.println("�ش� ���� �����");
			}

		}
	}
}