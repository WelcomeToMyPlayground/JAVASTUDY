package practice;

public class ����1 {

	public static void main(String[] args) {
		
		for(int i=1; i <= 6; i++) {             // 1,2,3,4,5,6  => �� 6��
			for(int j=5; j >= i; j--) {
				System.out.print(" ");      // ���� ���
			} 
			for(int k=1; k<= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		


	}

}
