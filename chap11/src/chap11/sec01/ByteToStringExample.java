package chap11.sec01;

public class ByteToStringExample {

	public static void main(String[] args) {
		// byte �迭
		// Good morning ���
		// �߶� morning ���
		
		byte[] bytes = {71,111,111,100,32,109,111,114,110,105,110,103};
		String str1 = new String(bytes);
		System.out.println(str1);       // Good morning  ���
		
		String str2 = new String(bytes,5,7);
		System.out.println(str2);      // morning ��� 

	}

}