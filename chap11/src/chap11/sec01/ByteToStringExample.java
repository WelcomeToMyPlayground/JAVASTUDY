package chap11.sec01;

public class ByteToStringExample {

	public static void main(String[] args) {
		// byte 배열
		// Good morning 출력
		// 잘라서 morning 출력
		
		byte[] bytes = {71,111,111,100,32,109,111,114,110,105,110,103};
		String str1 = new String(bytes);
		System.out.println(str1);       // Good morning  출력
		
		String str2 = new String(bytes,5,7);
		System.out.println(str2);      // morning 출력 

	}

}
