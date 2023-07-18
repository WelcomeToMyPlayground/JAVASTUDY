package sec02;

public class 다차원배열1_연습1 {

	public static void main(String[] args) {
		
		int[][] array1 = new int[3][4];   // 이차원 배열 - 3행 4열
		
		int[][] array2 = new int[3][]; // 3행, 열은 안 정함
		
		array2[0] = new int[1];   // 1행(0)에 1칸(열)
		array2[1] = new int[2];	  // 2행(1)에 2칸
		array2[2] = new int[3];   // 3행(2)에 3칸
		
	}

}
