package chap13;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class MaxNum {

	public static void main(String[] args) {

		// Scanner Ŭ������ -1�� �Էµ� ������ ���� ������ �Է¹޾�
		// ���Ϳ� �����ϰ� ���͸� �˻��Ͽ� ���� ū ���� ����ϴ� ���α׷��� �ۼ��ϼ���.

		List<Integer> list = new Vector<>();
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print("���� ������ �Է��ϼ���(-1�� �Էµ� ������) : ");
			int a = s.nextInt();

			if (a == -1)
				break;
			list.add(a);
		}

		int max = list.get(0); // 0��° �ʱ� ����
		for (int i = 1; i < list.size(); i++) {
			if (max < list.get(i)) // ���ư��鼭 �� -> max ��
				max = list.get(i);
		}
		System.out.println("���� ū ���� " + max);
	}

}
