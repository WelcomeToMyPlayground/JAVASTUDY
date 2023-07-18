package _02;

public class 배열_2차원 {

	public static void main(String[] args) {
		int[] num = new int[5]; // 1차원 배열
		int[] num2 = { 1, 2, 3, 4, 5 };

		int arr[][] = { { 1 }, { 1, 2, 3 }, { 1 }, { 1, 2, 3, 4 }, { 1, 2 } }; // 5행
		
		for(int i = 0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
