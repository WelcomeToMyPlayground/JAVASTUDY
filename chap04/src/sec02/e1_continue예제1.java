package sec02;

public class e1_continue����1 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {    // 1���� 10���� 10�� �ݺ�
			if(i%2 != 0) {     // i�� Ȧ���� ����
				continue;
			}
			System.out.println(i);
		}

	}

}
