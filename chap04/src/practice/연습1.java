package practice;

public class 연습1 {

	public static void main(String[] args) {
		
		for(int i=1; i <= 6; i++) {             // 1,2,3,4,5,6  => 총 6줄
			for(int j=5; j >= i; j--) {
				System.out.print(" ");      // 공백 출력
			} 
			for(int k=1; k<= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		


	}

}
