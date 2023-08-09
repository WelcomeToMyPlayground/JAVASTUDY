package sec01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		// put(key, value) : key 값에 대응되는 value 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // 동일한 키가 있으면 기존 값 대체

		System.out.println("총 개수: " + map.size()); // 총 개수: 3
		System.out.println("홍길동의 점수는: " + map.get("홍길동")); // 95
		// 변수명.get(키) -> 값 출력

		Set<String> keySet = map.keySet();
		// 키 값 모두 가져오기 (85,90,95)

		// 중요
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next(); // 반복해서 키 가져옴
			Integer value = map.get(key); // 반복해서 값 가져옴
			System.out.println(key + " : " + value);
		}
		
		map.remove("홍길동");
		// 홍길동 제거 -> 남은 키 (85,80)
		System.out.println("총 개수 : " + map.size()); // 2
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey(); // 키를 가져옴
			Integer value =  entry.getValue(); // 값을 가져옴
			System.out.println(key + " : " + value); 
		}

	}

}
