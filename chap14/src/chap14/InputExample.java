package chap14;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputExample {

	public static void main(String[] args) throws Exception{
		
		InputStream is = new FileInputStream("C:/temp/test1.db");
		
		while(true) {
			int data = is.read();
			if(data==-1) break;
			System.out.println(data);
		}
		
		is.close(); // ��� ��Ʈ�� �ݱ�
		
		// ��°��
		// 10
		// 20
		// 30


	}

}
