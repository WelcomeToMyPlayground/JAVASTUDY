package sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("�ڹ�");
		set.add("���̵��");
		set.add("����");
		set.add("���̹�Ƽ��");
		set.add("���̵��"); // ���� �����ʹ� �߰� �ȵ�
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String element = iter.next();
			System.out.println(element);
		}
		System.out.println("---------------");
		iter = set.iterator();
		for(String element : set) {
			System.out.println(element);
		}
		
		System.out.println("---------------");
		set.clear(); // ��� ����
		
		if(set.isEmpty()) {
			System.out.println("�������");
		}
	}

}
