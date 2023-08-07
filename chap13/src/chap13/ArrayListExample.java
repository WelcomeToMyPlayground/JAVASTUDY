package chap13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Java"); // 0��° ��
		list.add("JDBC"); // 1��° ��
		list.add("Servlet/JSP"); // 2��° �� -> 3��° ������ �и�
		list.add(2, "Database"); // 2��° �濡 "Database" �߰� -> ���� �ִ� "Servlet/JSP"�� �з��� 3���� �ȴ� 	
		list.add("iBATIS"); // 4��° ��
		
		int size = list.size();  //  list�� ����
		System.out.println("�� ��ü ��: " + size); // 5
		
		String skill = list.get(2); // 2��° �� ������ ��������
		System.out.println("2 : " + skill);
		
		System.out.println("----------------------------");
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		
		list.remove(2);  // 2��° �� ������ ����(database)
		list.remove(2);  // 2��° �� ������ ����(servelt)
		list.remove("iBATIS");  // �������� ���� ������
		
		System.out.println("----------------------------");
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}

	}

}
