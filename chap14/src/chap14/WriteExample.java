package chap14;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteExample {

	public static void main(String[] args) throws Exception{
		
		Scanner s = new Scanner(System.in);
		OutputStream os = new FileOutputStream("C:/temp/address.txt");
		
		System.out.println("����� �ּҴ�?");
		String address = s.nextLine();
		byte[] data = address.getBytes();
		
		os.write(data,5,4);
		
		os.flush(); // ��� ����Ʈ�� ���
		os.close(); // ��� ��Ʈ�� �ݱ� 
		
		
	
	}

}
