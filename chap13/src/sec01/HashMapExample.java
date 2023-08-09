package sec01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		// put(key, value) : key ���� �����Ǵ� value ����
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95); // ������ Ű�� ������ ���� �� ��ü

		System.out.println("�� ����: " + map.size()); // �� ����: 3
		System.out.println("ȫ�浿�� ������: " + map.get("ȫ�浿")); // 95
		// ������.get(Ű) -> �� ���

		Set<String> keySet = map.keySet();
		// Ű �� ��� �������� (85,90,95)

		// �߿�
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next(); // �ݺ��ؼ� Ű ������
			Integer value = map.get(key); // �ݺ��ؼ� �� ������
			System.out.println(key + " : " + value);
		}
		
		map.remove("ȫ�浿");
		// ȫ�浿 ���� -> ���� Ű (85,80)
		System.out.println("�� ���� : " + map.size()); // 2
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey(); // Ű�� ������
			Integer value =  entry.getValue(); // ���� ������
			System.out.println(key + " : " + value); 
		}

	}

}
