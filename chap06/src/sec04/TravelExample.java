package sec04;

import java.util.Scanner;

public class TravelExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Travel tr = new Travel();

		tr.setOil(20); // 초기 셋팅 set 사용
		tr.setLocation("광주");

		while (tr.isOilLeft()) {
			System.out.print("여행할 지역명을 입력하세요 : ");
			String local = s.next();

			if (local.equals("서울")) {
				tr.oilMinus(10);
				tr.setLocation("서울");
				System.out.println("현재 위치는 : " + tr.getLocation());

			} else if (local.equals("부산")) {
				tr.oilMinus(5);
				tr.setLocation("부산");
				System.out.println("현재 위치는 : " + tr.getLocation());

			} else {
				tr.oilMinus(2);
				tr.setLocation("화순");
				System.out.println("현재 위치는 : " + tr.getLocation());
			}

		}
	}
}
