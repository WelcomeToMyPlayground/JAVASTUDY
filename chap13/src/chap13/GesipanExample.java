package chap13;

import java.util.ArrayList;
import java.util.List;


public class GesipanExample {

	public static void main(String[] args) {
		
		List<Gesipan> list = new ArrayList<>();
		
		list.add(new Gesipan(1,"8�� ���� ����", "�ڹ� ���� ������Ʈ ��ǥ","ȫ�浿"));
		list.add(new Gesipan(2,"9�� ���� ����", "������ ���̽�","ȫ�浿"));
		list.add(new Gesipan(3,"10�� ���� ����", "JSP","ȫ�浿"));
		list.add(new Gesipan(4,"11�� ���� ����", "�� ������Ʈ �غ�","ȫ�浿"));
		
		for(int i = 0; i<list.size(); i++) {
			Gesipan gesipan = list.get(i);  // Ŭ����(Gesipan) Ÿ�� ���� �޾ƾ���
			System.out.println(gesipan.number+" "+gesipan.subject+" "+gesipan.content+" "+gesipan.user);
		}
	}

}
