package sec02;

public class e1_�극��ũ����3 {

	public static void main(String[] args) {
		
		// 158p �ٱ��� �ݺ������� ����
		a: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break a; 
				}
			}
		}
		System.out.println("���α׷� ���� ����");
	}

}
