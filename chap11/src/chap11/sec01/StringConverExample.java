package chap11.sec01;

public class StringConverExample {

	public static void main(String[] args) {
		
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);  // ���ڿ� "200"�� ������ ��ȯ
		
		int intData2 = 150;
		String strData2 = String.valueOf(intData2); // ���� 150�� ���ڿ��� ��ȯ
		
		System.out.println(intData1); // 200
		System.out.println(strData2); // 150

	}

}
