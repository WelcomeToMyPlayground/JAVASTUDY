package chap11.sec01;

import java.io.UnsupportedEncodingException;

public class StringGetByteExample {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "�ȳ��ϼ���";
		
		byte[] byte1 = str.getBytes();
		System.out.println(byte1.length); // 5 x 2 = 10 (�⺻ ���ڼ� - �ѱ��� 2)
		
		byte[] byte2 = str.getBytes("UTF-8"); // ����ó��
		System.out.println(byte2.length); // 5 x 3 = 15 ��� (3 ����Ʈ)
 	}

}
