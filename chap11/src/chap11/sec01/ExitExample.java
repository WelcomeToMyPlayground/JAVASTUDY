package chap11.sec01;

public class ExitExample {

	public static void main(String[] args) {
		// 1���� 100���� ¦���� ����ϵ� 
		// ���� ���ڰ� 50�� ���´ٸ� ���� System.exit(0);
		// -> 50�� ���ͼ� �����߽��ϴ�. ���
		
		for(int i=2;i<=100; i+=2) {
			System.out.print(i+ " ");
			if(i == 50) {
				System.out.println("50�� ���ͼ� �����߽��ϴ�.");
				System.exit(0);
			}
		}
	}

}
