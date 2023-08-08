package chap13;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class MaxNum {

	public static void main(String[] args) {

		// Scanner 클래스로 -1이 입력될 때까지 양의 정수를 입력받아
		// 벡터에 저장하고 벡터를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하세요.

		List<Integer> list = new Vector<>();
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print("양의 정수를 입력하세요(-1이 입력될 때까지) : ");
			int a = s.nextInt();

			if (a == -1)
				break;
			list.add(a);
		}

		int max = list.get(0); // 0번째 초기 셋팅
		for (int i = 1; i < list.size(); i++) {
			if (max < list.get(i)) // 돌아가면서 비교 -> max 값
				max = list.get(i);
		}
		System.out.println("가장 큰 수는 " + max);
	}

}
