package sec02;

import java.util.Scanner;

public class 배열8_로또추첨 {

	public static void main(String[] args) {
		
		//로또 몇 게임을 하시겠습니까?
		// 사용자가 입력한 숫자만큼 로또번호를 랜덤으로 출력하세요 *45 +1
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("로또 몇 게임을 하시겠습니까?");
		
		int [] lotto = new int [6];
		int game = s.nextInt();
		
		for(int i=0; i < game; i++) {    // 예) 3게임
			
			for(int j=0; j < lotto.length; j++) {    //6번 	 
				lotto[j] = (int) (Math.random()*45)+1;    //random이 for안에 있어야 숫자가 계속 바뀜
				System.out.print(lotto[j]+" ");
			}
			System.out.println();
		}
	}

}
