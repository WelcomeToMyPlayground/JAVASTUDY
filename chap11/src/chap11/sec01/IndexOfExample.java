package chap11.sec01;

public class IndexOfExample {

	public static void main(String[] args) {
		String str1 ="���� �ڹٸ� ����մϴ�.";
		
		int index = str1.indexOf("����մϴ�");
		// int index = str1.indexOf("�ڵ�");  // -1 ��� (�ش� ���ڰ� ������ -1�� ��µȴ�)
		System.out.println(index);  // 7��� (�ε��� ���� ��ġ�� ���: "��" ���� ~) 

	}

}
