package sec02;

public class �迭2 {

	public static void main(String[] args) {

//		int[] a;       // �迭 ����
//		int b [];      // �迭 ����                  [] int a; (x)
//		String c [];   // �迭 ����


		// �迭�� ��ü �հ�� ����� ���ϼ���
		// ����� doubleŸ��

		int d[] = { 52, 87, 94, 77, 69 }; // �迭 ���� �� ����
		int sum = 0;
		

		for (int i = 0; i <= 4; i++) {
			sum += d[i];			
		}
		
		double avg = (double) sum/5;
		System.out.println("�迭�� ��ü �հ�: " + sum);
		System.out.println("�迭�� ��ü ���: " + avg);
	}

}
