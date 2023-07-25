package chap11.sec01;

import java.io.UnsupportedEncodingException;

public class StringGetByteExample {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "안녕하세요";
		
		byte[] byte1 = str.getBytes();
		System.out.println(byte1.length); // 5 x 2 = 10 (기본 문자셋 - 한글은 2)
		
		byte[] byte2 = str.getBytes("UTF-8"); // 예외처리
		System.out.println(byte2.length); // 5 x 3 = 15 출력 (3 바이트)
 	}

}
