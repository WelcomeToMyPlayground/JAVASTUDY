package chap10.sec01;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		
		// �Ϲ����� ����
		String[] a = new String[10];
		a[0] = "������";
		String data0 = a[0];
		System.out.println(data0);
		
		// ����
		// args ��� �迭�� �������� �ʰ� �迭�� �ִ� ���� ������
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);

	}

}
