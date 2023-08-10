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
		
		is.close(); // 출력 스트림 닫기
		
		// 출력결과
		// 10
		// 20
		// 30


	}

}
