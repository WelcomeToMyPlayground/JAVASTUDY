package sec02;

import java.util.Scanner;

public class �迭8_�ζ���÷ {

	public static void main(String[] args) {
		
		//�ζ� �� ������ �Ͻðڽ��ϱ�?
		// ����ڰ� �Է��� ���ڸ�ŭ �ζǹ�ȣ�� �������� ����ϼ��� *45 +1
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("�ζ� �� ������ �Ͻðڽ��ϱ�?");
		
		int [] lotto = new int [6];
		int game = s.nextInt();
		
		for(int i=0; i < game; i++) {    // ��) 3����
			
			for(int j=0; j < lotto.length; j++) {    //6�� 	 
				lotto[j] = (int) (Math.random()*45)+1;    //random�� for�ȿ� �־�� ���ڰ� ��� �ٲ�
				System.out.print(lotto[j]+" ");
			}
			System.out.println();
		}
	}

}
