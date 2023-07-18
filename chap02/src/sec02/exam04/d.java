package sec02.exam04;

import java.util.Scanner;

public class d {

	public static void main(String[] args) {
		 
		Scanner s = new Scanner (System.in);
		
		System.out.println("전체 건물이 몇 층인가요?");	
		int a = s.nextInt(); 
		System.out.println("총 거주 인원은?");
		int b = s.nextInt();
		
		System.out.println("입력하신 건물은 전체 " + a*5 +"m이고 최대 거주인원은 "+ b/3 +"명입니다.");
		
		s.close();
		
	

	}

}
