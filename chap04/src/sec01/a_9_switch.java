package sec01;

public class a_9_switch {

	public static void main(String[] args) {
		
		int num = (int) (Math.random()*4)+8 ;
		System.out.println("[���� �ð�: " + num + "��]");
		
		switch (num) {
		case 8:
			System.out.println("����մϴ�.");
			break;
		case 9:
			System.out.println("ȸ�Ǹ� �մϴ�.");
			break;
		case 10:
			System.out.println("������ ���ϴ�.");
			break;
		default:
			System.out.println("�ܱ��� �����ϴ�.");
			break;
		}
	}

}
