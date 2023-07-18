package sec02;

public class 배열_확인문제 {

	public static void main(String[] args) {
		int [] array = {1,2,3};
		//int[] array2; array2 = {1,2,3};   -> 불가능
		int [] array3 = new int[3];
		
		int [] array4 = new int[3];
		array4[0] =3;
		array4[1] =4;
		array4[2] =5;
		
		int [][] array5 = new int [3][2];
		int [][] array6 = new int [3][];
		
		//200p 3번
		int [][] array7 = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		for(int i =0; i<3; i++) {
			System.out.println(array7[i].length);
		
		}
	}

}
