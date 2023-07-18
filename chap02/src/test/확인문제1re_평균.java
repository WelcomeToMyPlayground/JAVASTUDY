package test;

import java.util.Scanner;

public class 확인문제1re_평균 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("당신의 이름은?");
		String name = s.next();
		System.out.print("중간고사 점수? ");
		double mid = s.nextDouble();
		System.out.print("기말고사 점수? ");
		double last = s.nextDouble();
		System.out.print("리포트 점수는? ");
		double report = s.nextDouble();
		
		double a = (mid+last+report) / 3;
		
		System.out.printf("%s님의 평균 점수는 : %5.2f 입니다.", name, a );
		
		//실수값을 출력할 때 서식 지정자 안에 %.숫자f로 작성하면 해당 숫자까지의 소수점 자리를 출력함
		

	}
}
