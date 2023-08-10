package chap14;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteExample {

	public static void main(String[] args) throws Exception{
		
		Scanner s = new Scanner(System.in);
		OutputStream os = new FileOutputStream("C:/temp/address.txt");
		
		System.out.println("당신의 주소는?");
		String address = s.nextLine();
		byte[] data = address.getBytes();
		
		os.write(data,5,4);
		
		os.flush(); // 모든 바이트를 출력
		os.close(); // 출력 스트림 닫기 
		
		
	
	}

}
