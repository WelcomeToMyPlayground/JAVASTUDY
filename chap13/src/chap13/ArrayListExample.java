package chap13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Java"); // 0번째 방
		list.add("JDBC"); // 1번째 방
		list.add("Servlet/JSP"); // 2번째 방 -> 3번째 방으로 밀림
		list.add(2, "Database"); // 2번째 방에 "Database" 추가 -> 원래 있던 "Servlet/JSP"가 밀려서 3번이 된다 	
		list.add("iBATIS"); // 4번째 방
		
		int size = list.size();  //  list의 개수
		System.out.println("총 객체 수: " + size); // 5
		
		String skill = list.get(2); // 2번째 방 데이터 가져오기
		System.out.println("2 : " + skill);
		
		System.out.println("----------------------------");
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		
		list.remove(2);  // 2번째 방 데이터 삭제(database)
		list.remove(2);  // 2번째 방 데이터 삭제(servelt)
		list.remove("iBATIS");  // 내용으로 삭제 가능함
		
		System.out.println("----------------------------");
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}

	}

}
